package Driving_license_system;

public class License {

    public static void main(String[] args) {
        /*
        Driving License System
        -> Create GenericDriver Class
        -> Derive CommercialDriver class
            -Different medical report formats
            -can transport hazardous materials
        -> Method overriding is needed
         */
        GenericDriver tom = new GenericDriver("Tom", true);
        tom.deduct(3);
        tom.setMedicalReport();

        CommercialDriver Jerry = new CommercialDriver("Jerry", false, "Inflammable", "truck");
        Jerry.deduct(5);
        Jerry.setMedicalReport();

        GenericDriver[] driverArray = new GenericDriver[2];
        driverArray[0] = tom;
        driverArray[1] = Jerry; // Upcast to GenericDriver

        for (int i = 0; i < driverArray.length; i++) {
            System.out.println(driverArray[i].getName() + "'s license is provisional: " + driverArray[i].getIsProvisional());
            System.out.println(driverArray[i].getName() + " has " + driverArray[i].getPoints() + " points");
            System.out.println(driverArray[i].getMedicalReport());
        }

        System.out.println(Jerry.getMaterialType());

    }
}
