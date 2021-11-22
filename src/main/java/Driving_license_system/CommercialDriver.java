package Driving_license_system;

public class CommercialDriver extends GenericDriver{
    private String hazardousMaterialsType;
    private String carType; // Special commercial car category

    public CommercialDriver(String name, boolean isProvisional, String materialType, String carType) {
        super(name, isProvisional);
        hazardousMaterialsType = materialType;
        this.carType = carType;
    }

    //The getter method for the
    public String getMaterialType() {
        return hazardousMaterialsType;
    }

    //Override the GenericDriver's method
    @Override
    public void setMedicalReport(){
        medicalReport = "Approved to drive " + carType;
    }


}
