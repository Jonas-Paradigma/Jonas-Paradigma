package at.jon.basic;

import java.util.Scanner;

public class TicTacToe {
     public static void main(String[] args) {
            char[][] board = {
                    {' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}
            };
            char currentPlayer = 'X';
            boolean gameWon = false;

            while (true) {
                printBoard(board);
                int[] move = getPlayerMove(board, currentPlayer);
                int row = move[0];
                int col = move[1];

                if (board[row][col] == ' ') {
                    board[row][col] = currentPlayer;
                    gameWon = checkWin(board, currentPlayer, row, col);
                    if (gameWon) {
                        printBoard(board);
                        System.out.println("Spieler " + currentPlayer + " hat gewonnen!");
                        break;
                    }

                    if (isBoardFull(board)) {
                        printBoard(board);
                        System.out.println("Es ist ein Unentschieden!");
                        break;
                    }

                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                } else {
                    System.out.println("Ungültiger Zug. Das Feld ist bereits belegt. Versuche es erneut.");
                }
            }
        }

        public static void printBoard(char[][] board) {
            System.out.println("Willkommen bei TicTacToe!");
            System.out.println("----------------------------");
            System.out.println("  0 1 2");
            for (int i = 0; i < 3; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j]);
                    if (j < 2) {
                        System.out.print("|");
                    }
                }
                System.out.println();
                if (i < 2) {
                    System.out.println();
                }
            }
        }

        public static int[] getPlayerMove(char[][] board, char player) {
            Scanner scanner = new Scanner(System.in);
            int[] move = new int[2];

            while (true) {
                System.out.print("Spieler " + player + ", gib deine Zeile und Spalte ein wie z.B. 1 2: ");
                move[0] = scanner.nextInt();
                move[1] = scanner.nextInt();

                if (move[0] >= 0 && move[0] < 3 && move[1] >= 0 && move[1] < 3) {
                    return move;
                } else {
                    System.out.println("Ungültige Eingabe. Gib eine Zahl ein, die in dem Bereich 0-2 liegt.");
                }
            }
        }

        public static boolean checkWin(char[][] board, char player, int row, int col) {
            return (board[row][0] == player && board[row][1] == player && board[row][2] == player) || // Horizontale
                    (board[0][col] == player && board[1][col] == player && board[2][col] == player) || // Vertikale
                    (row == col && board[0][0] == player && board[1][1] == player && board[2][2] == player) || // Diagonale von links oben nach rechts unten
                    (row + col == 2 && board[0][2] == player && board[1][1] == player && board[2][0] == player); // Diagonale von rechts oben nach links unten
        }

        public static boolean isBoardFull(char[][] board) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        return false;
                    }
                }
            }
            return true;
        }
    }
