package Model;

public class Vehicle  {

    private Type type;
    private String vehiclename;
    private String vehiclemodelnumber;
    private String problemdescription;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getVehiclename() {
        return vehiclename;
    }

    public void setVehiclename(String vehiclename) {
        this.vehiclename = vehiclename;
    }

    public String getVehiclemodelnumber() {
        return vehiclemodelnumber;
    }

    public void setVehiclemodelnumber(String vehiclemodelnumber) {
        this.vehiclemodelnumber = vehiclemodelnumber;
    }

    public String getProblemdescription() {
        return problemdescription;
    }

    public void setProblemdescription(String problemdescription) {
        this.problemdescription = problemdescription;
    }

}
