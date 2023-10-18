package at.jon.basic;

public class StringHelper {

    public static void main(String[] args) {
    int result = countletters("Hans achtet auf mich", 'a');
        System.out.println(result);
    }
    public static boolean isPalindrome (String text) {
        //A n n A

        return false;
    }

    public static int countletters(String text, char search) {
        //Hans

        //0 1 2 3
        //H a n s
        char[] textArray = text.toCharArray();
        int count = 0;


        for (int i = 0; i < textArray.length ; i++){
            if(textArray[i]==search){
                count++;
            }

        }

        return -1;
    }
}
