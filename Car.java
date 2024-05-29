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
            //Coleta dos valores dos atributos do tipo do motor
            //tipo do motor
            switch (engineType) {
                case "Em linha":
                    System.out.println("Enter engine cylinder number:");
                    cylinderNumber = sc.nextInt();

                    break;
                    

                case "Boxer":
                    System.out.println("Enter engine cylinder number:");
                    cylinderNumber = sc.nextInt();
                    
                    break;

                case "V":
                    System.out.println("Enter engine cylinder number:");
                    cylinderNumber = sc.nextInt();

                    break;
            
                default:
                    break;
            }

            //aspiração
            switch (aspiration) {
                case "aspirado naturalmente":
                    
                    break;

                case "turbo compressor":
                    
                    break;

                case "super compressor":
                    
                    break;
            
                default:
                    break;
            }

            //tipo do combustivel
            switch (fuel) {
                case "gasolina":
                    
                    break;

                case "diesel":
                    
                    break;
            
                default:
                    break;
            }

            //material do motor
            switch (engineMaterial) {
                case "ferro fundido":
                    
                    break;

                case "liga de aluminio":
                    
                    break;

                case "liga de titanio":
                    
                    break;
            
                default:
                    break;
            }

            //tipo de tração
            switch (traction) {
                case "traseira":
                    
                    break;
            
                case "dianteira":
                    
                    break;
                
                case "integral":
                    
                    break;

                default:
                    break;
            }

            



            //passagem de valores para os atributos do construtores
            this.engineType = engineType;
            this.cylinders = cylinders;
            this.aspiration = aspiration;
            this.fuel = fuel;
            this.engineMaterial = engineMaterial;
            this.traction = traction;
        }

        public String toString() {
            return String.format("-------------------Car-------------------\n1 - Engine:\nType: %s; Cylinders: %f; Aspiration: %s; Fuel: %s; Material: %s" + 
            "; Traction: %s", engineType, cylinders, aspiration, fuel, engineMaterial, traction);
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
    Car (String engineType, double cylinders, String aspiration, String fuel, String engineMaterial, String traction) {
        Engine carEngine = new Engine(engineType, cylinders, aspiration, fuel, engineMaterial, traction);
        Brakes carBrakes = new Brakes();
        Tires carTires = new Tires();
        Chassis carChassis = new Chassis();
        Suspension carSuspension = new Suspension();
        BodyPaint carBodyPaint = new BodyPaint();

        System.out.println(carEngine.toString());
    }

    //Método main para teste das classes inicialmente, posteriormente realizar testes através de interfaces gráficas
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------------------Engine Informations--------------------\n");
        System.out.println("Enter engine type: ");
        String engineType = sc.nextLine();
        System.out.println("Enter cylinders: ");
        Double cylinders = Double.parseDouble(sc.nextLine());
        System.out.println("Enter engine aspiration type: ");
        String aspiration = sc.nextLine();
        System.out.println("Enter fuel type: ");
        String fuel = sc.nextLine();
        System.out.println("Enter engine material: ");
        String engineMaterial = sc.nextLine();
        System.out.println("Enter traction type: ");
        String traction = sc.nextLine();

        System.out.println("\n--------------------Car Components--------------------\n");
        System.out.println("Enter car brake type: ");
        String brakes = sc.nextLine();
        System.out.println("Enter car tires type: ");
        String tires = sc.nextLine();
        System.out.println("Enter car chassis type: ");
        String chassis = sc.nextLine();
        System.out.println("Enter car suspension type: ");
        String suspension = sc.nextLine();
        System.out.println("Enter car chassis color: ");
        String color = sc.nextLine();

        Car subaru = new Car(engineType, cylinders, aspiration, fuel, engineMaterial, traction);
        


        
        
        
    }
}