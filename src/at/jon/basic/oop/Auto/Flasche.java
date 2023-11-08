package at.jon.basic.oop.Auto;

public class Flasche {
    private String shersteller;
    private int ivolumen;
    private String sgefuelltmit;


    public Flasche(String shersteller, int ivolumen, String sgefuelltmit) {
        this.shersteller = shersteller;
        this.ivolumen = ivolumen;
        this.sgefuelltmit = sgefuelltmit;
    }

    public String getShersteller() {
        return shersteller;
    }

    public void setShersteller(String shersteller) {
        this.shersteller = shersteller;
    }

    public int getIvolumen() {
        return ivolumen;
    }

    public void setIvolumen(int ivolumen) {
        this.ivolumen = ivolumen;
    }

    public String getSgefuelltmit() {
        return sgefuelltmit;
    }

    public void setSgefuelltmit(String sgefuelltmit) {
        this.sgefuelltmit = sgefuelltmit;
    }
}
