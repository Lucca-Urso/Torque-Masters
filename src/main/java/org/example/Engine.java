public class Engine {
    private String engineType;
    private int cylindersAmmount;
    private double cylinders;
    private String aspiration;
    private String fuel;
    private String engineMaterial;
    private String traction;

    Engine(String engineType, int cylindersAmmount, double cylinders, String aspiration, String fuel, String engineMaterial, String traction) {
        //passagem de valores para os atributos do construtores
        this.engineType = engineType;
        this.cylindersAmmount = cylindersAmmount;
        this.cylinders = cylinders;
        this.aspiration = aspiration;
        this.fuel = fuel;
        this.engineMaterial = engineMaterial;
        this.traction = traction;
    }

    public double setRadius() {
        switch (engineType) {
            case "em linha":
                return 1.2;

            case "boxer":
                return 1.3;

            case "V":
                return 1.4;
        
            default:
                return 0;
        }
    }

    public double setWeight() {
        double carWeight = 0;

        switch (aspiration) {
            case "turbo compressor":
                carWeight += 13;
                break;
            
            case "super compressor":
                carWeight += 22;
                break;
        
            default:
                break;
        }

        switch (engineMaterial) {
            case "ferro fundido":
                carWeight += 150 + (5 * cylindersAmmount * cylinders);
                break;

            case "liga de aluminio":
                carWeight += 130 + (3 * cylindersAmmount * cylinders);
                break;

            case "liga de titanio":
                carWeight += 110 + (2 * cylindersAmmount * cylinders);
        
            default:
                break;
        }

        switch (traction) {
            case "traseira":
                carWeight += 50;
                break;

            case "dianteira":
                carWeight += 50;
                break;
            
            case "integral":
                carWeight += 80;
                break;
        
            default:
                break;
        }

        return carWeight;
    }

    public double setHorsePower() {
        double carHorsePower = 0;

        switch (aspiration) {
            case "turbo compressor":
                carHorsePower += 15 * cylindersAmmount;
                break;
            
            case "super compressor":
                carHorsePower += 25 * cylindersAmmount;
                break;
        
            default:
                break;
        }

        switch (fuel) {
            case "gasolina":
                carHorsePower += 10 * cylindersAmmount;
                break;

            case "diesel":
                carHorsePower += 8 * cylindersAmmount;
                break;
        
            default:
                break;
        }

        switch (engineMaterial) {
            case "ferro fundido":
                carHorsePower += 10 * cylindersAmmount;
                break;

            case "liga de aluminio":
                carHorsePower += 11 * cylindersAmmount;
                break;

            case "liga de titanio":
                carHorsePower += 12 * cylindersAmmount;
        
            default:
                break;
        }

        return (carHorsePower + (cylinders * cylindersAmmount * 10));
    }

    public double setHandling() {
        switch (traction) {
            case "traseira":
                return 0.7;

            case "dianteira":
                return 0.85;
            
            case "integral":
                return 1;
        
            default:
                return 0;
        }
    }

    public double setConsumption() {
        double carConsumption = 0;

        switch (fuel) {
            case "gasolina":
                carConsumption += 1;
                break;

            case "diesel":
                carConsumption += 0.9;
                break;
        
            default:
                break;
        }

        switch (engineMaterial) {
            case "ferro fundido":
                carConsumption += 1;
                break;

            case "liga de aluminio":
                carConsumption += 0.95;
                break;

            case "liga de titanio":
                carConsumption += 0.9;
        
            default:
                break;
        }

        return (20 / (carConsumption / 2)) - (setWeight() / 1000) - ((cylinders * cylindersAmmount) / 4);
    }

    public double setCost() {
        double carCost = 0;

        switch (aspiration) {
            case "turbo compressor":
                carCost += 5000;
                break;
            
            case "super compressor":
                carCost += 8000;
                break;
        
            default:
                break;
        }

        switch (engineMaterial) {
            case "ferro fundido":
                carCost += 10000 + 10 * (150 + (5 * cylindersAmmount * cylinders));
                break;

            case "liga de aluminio":
                carCost += 15000 + 15 * (130 + (3 * cylindersAmmount * cylinders));
                break;

            case "liga de titanio":
                carCost += 25000 + 25 * (110 + (2 * cylindersAmmount * cylinders));
        
            default:
                break;
        }

        switch (traction) {
            case "traseira":
                carCost += 8000;
                break;

            case "dianteira":
                carCost += 8000;
                break;
            
            case "integral":
                carCost += 15000;
                break;
        
            default:
                break;
        }

        return carCost;
    }

    public double setTractionCoef() {
        switch (traction) {
            case "traseira":
                return 2.5;

            case "dianteira":
                return 2;
            
            case "integral":
                return 4;
        
            default:
                return 0;
        }
    }

    public String toString() {
        return String.format("1 - Engine -> Type: %s; Cylinder Ammount: %d; " + 
        "Cylinders: %.1f; Aspiration: %s; Fuel: %s; Material: %s; Traction: %s",
        engineType, cylindersAmmount, cylinders, aspiration, fuel, engineMaterial, traction);
    }
  
}
