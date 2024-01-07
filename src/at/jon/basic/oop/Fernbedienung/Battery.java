package at.jon.basic.oop.Fernbedienung;

public class Battery {
    private int Status;

    public Battery(int Status){
        this.Status = Status;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }
}
