package Model;

import java.util.ArrayList;
import java.util.List;

public class Customerinformation  {

    private String fname;
    private String lname;
    private String cusid;
    private String cusmobilenumber;
    private List<Vehicle> vehicles;



    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCusid() {
        return cusid;
    }

    public void setCusid(String cusid) {
        this.cusid = cusid;
    }

    public String getCusmobilenumber() {
        return cusmobilenumber;
    }

    public void setCusmobilenumber(String cusmobilenumber) {
        this.cusmobilenumber = cusmobilenumber;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle) {

        if(this.vehicles == null){
            this.vehicles = new ArrayList<Vehicle>();
        }
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(String vehiclemodelnumber){
            if(this.vehicles != null || this.vehicles.size() > 0) {
            this.vehicles.removeIf(p -> vehiclemodelnumber.equalsIgnoreCase(p.getVehiclemodelnumber()));
        }
    }
}