public class Chassis {
    private String chassisModel;

    Chassis(String chassisModel) {
        this.chassisModel = chassisModel;
    }

    public double setCost() {
        switch (chassisModel) {
            case "suv":
                return 8000;
                
            case "sedan":
                return 11000;

            case "esportivo":
                return 15500;

            case "hatchback":
                return 6500;

            case "coupe":
                return 13000;
               
            default:
                return 0;
        }
    }

    public String toString() {
        return String.format("\n4 - Chassis Model: %s", chassisModel);
    }
}
