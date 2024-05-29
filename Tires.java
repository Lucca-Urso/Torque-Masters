public class Tires {
    private String tireType;

    Tires(String tireType) {
        this.tireType = tireType;
    }

    public double setWeight() {
        switch (tireType) {
            case "popular":
                return 58;
                
            case "esportivo":
                return 48;
            
            case "corrida":
                return 36;
            
            case "off-road":
                return 52;
               
            default:
                return 0;
        }
    }

    public double setCost() {
        switch (tireType) {
            case "popular":
                return 4000;
                
            case "esportivo":
                return 8000;
            
            case "corrida":
                return 16000;
            
            case "off-road":
                return 8000;
               
            default:
                return 0;
        }
    }

    //INCOMPLETO
    public double setBrake() {
        switch (tireType) {
            case "popular":
                return 0.5;
                
            case "esportivo":
                return 1;
            

            case "corrida":
                return 1.5;
            

            case "off-road":
                return 2;
               
            default:
                return 0;
        }
    }

    //INCOMPLETO
    public double setHandling() {
        switch (tireType) {
            case "popular":
                return 50;
                
            case "esportivo":
                return 40;
            

            case "corrida":
                return 30;
            

            case "off-road":
                return 20;
               
            default:
                return 0;
        }
    }

    public String toString() {
        return String.format("\n3 - Tires: %s", tireType);
    }
}
