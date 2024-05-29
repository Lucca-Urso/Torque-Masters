public class Suspension {
    private String suspensionType;

    Suspension(String suspensionType) {
        this.suspensionType = suspensionType;
    }

    public String toString() {
        return String.format("\n5 - Suspension: %s", suspensionType);
    }
}
