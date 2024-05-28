public class Car {
    private double cost;
    private double consumption;
    private double weight;
    private double maxSpeed;
    private double acceleration;
    private double handling;
    private double brakesPower;

    class Engine {
        class EngineType {
            private int cylinderNumber;
        }

        class Cylinders {
            private double cylinderVolume;
        }

        class Aspiration {
            private String aspirationType;
        }

        class Fuel {
            private String fuelType;
        }

        class EngineMaterial {
            private String engineMaterial;
        }

        class Traction {
            private String tractionType;
        }
    }

    class Brakes {
        private String brakeType;
    }

    class Tires {
        private String tiresType;
    }

    class Chassis {
        private String modelType;
    }

    class Suspension {
        private String suspensionType;
    }

    class BodyPaint {
        private String color;
    }


    public static void main(String[] args) {
        
    }
}