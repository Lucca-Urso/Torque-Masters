public class Engine {
    private String engineType;
    private double cylinders;
    private String aspiration;
    private String fuel;
    private String engineMaterial;
    private String traction;

    Engine(String engineType, double cylinders, String aspiration, String fuel, String engineMaterial, String traction) {
        //passagem de valores para os atributos do construtores
        this.engineType = engineType;
        this.cylinders = cylinders;
        this.aspiration = aspiration;
        this.fuel = fuel;
        this.engineMaterial = engineMaterial;
        this.traction = traction;
    }

    public String toString() {
        return String.format("1 - Engine -> Type: %s; Cylinders: %.1f; Aspiration: %s; Fuel: %s; Material: %s; Traction: %s",
        engineType, cylinders, aspiration, fuel, engineMaterial, traction);
    }
  
}
