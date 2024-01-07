package at.jon.basic.oop.Konto;

public class test {
    public static void main(String[] args) {
        Basiskonto bk = new Basiskonto("Raiffeisen", "Jonas", 27384950,"AT283938475647839876", 250.54 );
        bk.Einzahlen(500);
        bk.Auszahlen(20);
        bk.Saldo();

        Sparbuch sk = new Sparbuch("Raiffeisen", "Jonas", 12345678, "AT374659876543209876", 500.00, 2.5);
        sk.Einzahlen(250);
        sk.Zinszahlung();
        sk.Saldo();

        Girokonto gk = new Girokonto("Raiffeisen", "Jonas", 87654321, "AT394857620987635678", 650.00, 750.00);
        gk.Auszahlung(2000);
        gk.Einzahlen(5000);
        gk.Saldo();

        Kreditkonto kk = new Kreditkonto("Raiffeisen", "Jonas", 12345678, "AT849758678293847567", 450.00, 2.5);
        kk.Einzahlung(450);
        kk.Einzahlung(69);
        kk.Auszahlen(69);
        kk.Saldo();

    }
}
