package Model;

public class PurchaseVehicle {

    private String pname;
    private String pmodelnumber;
    private double price;
    private PurchaseVehicleType ptype;
    private PurchaseStatusType stype;


    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPmodelnumber() {
        return pmodelnumber;
    }

    public void setPmodelnumber(String pmodelnumber) {
        this.pmodelnumber = pmodelnumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PurchaseVehicleType getPtype() {
        return ptype;
    }

    public void setPtype(PurchaseVehicleType ptype) {
        this.ptype = ptype;
    }

    public PurchaseStatusType getStype() {
        return stype;
    }

    public void setStype(PurchaseStatusType stype) {
        this.stype = stype;
    }
}
