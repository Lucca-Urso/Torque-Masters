public class Suspension {
    private String suspensionType;

    Suspension(String suspensionType) {
        this.suspensionType = suspensionType;
    }

    public double setWeight() {
        switch (suspensionType) {
            case "popular":
                return 60;
                
            case "esportivo":
                return 40;

            case "corrida":
                return 40;

            case "rally":
                return 80;
               
            default:
                return 0;
        }
    }

    public double setCost() {
        switch (suspensionType) {
            case "popular":
                return 2000;
                
            case "esportivo":
                return 3000;

            case "corrida":
                return 5000;

            case "rally":
                return 3000;
               
            default:
                return 0;
        }
    }

    //INCOMPLETO
    public double setHandling() {
        switch (suspensionType) {
            case "popular":
                return 2000;
                
            case "esportivo":
                return 3000;

            case "corrida":
                return 5000;

            case "rally":
                return 3000;
               
            default:
                return 0;
        }
    }

    //INCOMPLETO
    public double setAcceleration() {
        switch (suspensionType) {
            case "popular":
                return 2000;
                
            case "esportivo":
                return 3000;

            case "corrida":
                return 5000;

            case "rally":
                return 3000;
               
            default:
                return 0;
        }
    }

    public String toString() {
        return String.format("\n5 - Suspension: %s", suspensionType);
    }
}
