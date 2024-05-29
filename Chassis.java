public class Chassis {
    private String chassisModel;

    Chassis(String chassisModel) {
        this.chassisModel = chassisModel;
    }

    public String toString() {
        return String.format("\n4 - Chassis Model: %s", chassisModel);
    }
}
