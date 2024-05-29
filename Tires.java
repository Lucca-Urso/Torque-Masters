public class Tires {
    private String tireType;

    Tires(String tireType) {
        this.tireType = tireType;
    }

    public String toString() {
        return String.format("\n3 - Tires: %s", tireType);
    }
}
