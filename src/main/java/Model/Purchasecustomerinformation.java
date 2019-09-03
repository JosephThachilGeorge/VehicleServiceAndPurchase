package Model;

import java.util.ArrayList;
import java.util.List;

public class Purchasecustomerinformation {

    private String pfname;
    private String plname;
    private String pcusId;
    private String pmobilenumber;
    private List<PurchaseVehicle> pvehicles;

    public String getPfname() {
        return pfname;
    }

    public void setPfname(String pfname) {
        this.pfname = pfname;
    }

    public String getPlname() {
        return plname;
    }

    public void setPlname(String plname) {
        this.plname = plname;
    }

    public String getPcusId() {
        return pcusId;
    }

    public void setPcusId(String pcusId) {
        this.pcusId = pcusId;
    }

    public String getPmobilenumber() {
        return pmobilenumber;
    }

    public void setPmobilenumber(String pmobilenumber) {
        this.pmobilenumber = pmobilenumber;
    }

    public List<PurchaseVehicle> getPvehicles() {
        return pvehicles;
    }

    public void setPvehicles(List<PurchaseVehicle> pvehicles) {
        this.pvehicles = pvehicles;
    }

    public void addPurchaseVehicle(PurchaseVehicle purchaseVehicle) {

        if (this.pvehicles == null) {
            this.pvehicles = new ArrayList<>();
        }
        this.pvehicles.add(purchaseVehicle);
    }

    public void removePurchaseVehicle(String pmodelnumber) {
        if (this.pvehicles != null || this.pvehicles.size() > 0) {
            this.pvehicles.removeIf(p -> pmodelnumber.equalsIgnoreCase(p.getPmodelnumber()));
        }
    }

    public void findByPurchaseStatusType(PurchaseVehicle purchaseVehicle) {
        if (this.pvehicles != null || this.pvehicles.size() > 0) {

            purchaseVehicle.getStype();

        } else {
            System.out.println("Vehicle is not Present");
        }


    }

    public void updateVehicleByModelNumber(PurchaseVehicle pmodelnumber) {
        for (int i = 0; pvehicles.size() > i; i++) {

            PurchaseVehicle purchaseVehiclemobileNumberToUpdate = pvehicles.get(i);
            if (purchaseVehiclemobileNumberToUpdate.getPmodelnumber() == pmodelnumber.getPmodelnumber()) {

                this.pvehicles.set(i, pmodelnumber);

            } else {
                System.out.println("Mobile number is not present");
            }

        }


    }
}