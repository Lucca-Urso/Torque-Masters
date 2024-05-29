public class Brakes {
    private String brakeType;

    Brakes(String brakeType) {
        this.brakeType = brakeType;
    }

    public String toString() {
        return String.format("\n2 - Brakes: %s", brakeType);
    }

}
