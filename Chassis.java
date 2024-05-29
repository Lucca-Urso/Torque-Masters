public class Chassis {
    private String chassisModel;

    Chassis(String chassisModel) {
        this.chassisModel = chassisModel;
    }

    public double setCost() {
        switch (chassisModel) {
            case "suv":
                return 12000;
                
            case "sedan":
                return 14000;

            case "esportivo":
                return 20000;

            case "hatchback":
                return 10000;

            case "coupe":
                return 17000;
               
            default:
                return 0;
        }
    }

    public String toString() {
        return String.format("\n4 - Chassis Model: %s", chassisModel);
    }
}
