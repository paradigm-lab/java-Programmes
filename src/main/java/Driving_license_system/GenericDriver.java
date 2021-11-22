package Driving_license_system;

public class GenericDriver {
    private String name;
    private int points;
    private boolean isProvisional;
    // Both superclass and subclass can access it
    protected String medicalReport;

    //The constructor of the GenericDriver
    public GenericDriver(String name, boolean isProvisional) {
        this.name = name;
        points = 15;
        this.isProvisional = isProvisional;
    }

    //The getter method
    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public boolean getIsProvisional() {
        return isProvisional;
    }

    public String getMedicalReport() {
        return medicalReport;
    }

    public void setMedicalReport() {
        medicalReport = "Approved to drive private car";
    }

    public void deduct(int p){
        // Check if negative point can result
        if (points >= p) {
            points -= p;
        }
        else {
            points = 0;
        }

        if (points == 0) {
            System.out.println("License Suspended");
        }
    }
}
