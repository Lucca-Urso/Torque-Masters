import java.util.Scanner;

public class Car {
    Scanner sc = new Scanner(System.in);

    //Atributos do carro, influênciados pelas escolhas das demais componentes do carro
    private double cost;
    private double consumption;
    private double weight;
    private double maxSpeed;
    private double acceleration;
    private double handling;
    private double brakesPower;

    //Classes do carro, contém personalização dos atributos internos que impactam na performace do carro
    class Engine {
        private String engineType;
        private int cylinderNumber;
        private double cylinders;
        private String aspiration;
        private String fuel;
        private String engineMaterial;
        private String traction;

        Engine(String engineType, double cylinders, String aspiration, String fuel, String engineMaterial, String traction) {
            //Coleta e validação das caracteristicas do tipo do motor
            switch (engineType) {
                case "Inline":
                    System.out.println("Enter cylinder ammount:");
                    cylinderNumber = sc.nextInt();

                    if (cylinderNumber != 3 && cylinderNumber != 4 && cylinderNumber != 5)
                        System.out.println("Incorrect value!");

                    break;
                    

                case "Boxer":
                    System.out.println("Enter cylinder ammount:");
                    cylinderNumber = sc.nextInt();

                    if (cylinderNumber != 4 && cylinderNumber != 6)
                        System.out.println("Incorrect value!");
                    
                    break;

                case "V":
                    System.out.println("Enter cylinder ammount:");
                    cylinderNumber = sc.nextInt();

                    if (cylinderNumber != 6 && cylinderNumber != 8 && cylinderNumber != 10 && cylinderNumber != 12)
                        System.out.println("Incorrect value!");

                    break;
            
                default:
                    System.out.println("Incorrect value!");
            }

            if (cylinders != 1.0 && cylinders != 1.6 && cylinders != 2.0 && cylinders != 2.4 && cylinders != 3.0 && cylinders != 3.6 && cylinders != 4.2)
                System.out.println("Incorrect value!"); 


            //passagem de valores para os atributos do construtores
            this.engineType = engineType;
            this.cylinders = cylinders;
            





        }
    }

    class Brakes {
        private String brakeType;

        Brakes() {
            
        }
    }

    class Tires {
        private String tiresType;

        Tires() {

        }
    }

    class Chassis {
        private String modelType;

        Chassis() {

        }
    }

    class Suspension {
        private String suspensionType;

        Suspension() {

        }
    }

    class BodyPaint {
        private String color;

        BodyPaint() {

        }
    }

    //Construtor do carro, ja aplica todas as fórmulas de acordo com os componentes selecionados
    Car (String engineType, double cylinders, String aspiration, String fuel, String engineMaterial, String traction, 
    double cost, double consumption, double weight, double maxSpeed, double acceleration, 
    double handling, double brakesPower) {
        Engine carEngine = new Engine(engineType, 2.0, "Super Compressor", "Gas", "Titanium", "Rear");
        Brakes carBrakes = new Brakes();
        Tires carTires = new Tires();
        Chassis carChassis = new Chassis();
        Suspension carSuspension = new Suspension();
        BodyPaint carBodyPaint = new BodyPaint();
    }



    //Método main para teste das classes inicialmente, posteriormente realizar testes através de interfaces gráficas
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter engine type: ");
        String engineType = sc.nextLine();
        System.out.println("Enter cylinders: ");
        Double cylinders = sc.nextDouble();

        Car subaru = new Car(engineType, cylinders);

        
        
    }
}