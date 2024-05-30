import java.util.Scanner;

public class Car {
    Scanner sc = new Scanner(System.in);

    //Componentes do carro
    private Engine engine;
    private Brakes brakes;
    private Tires tires;
    private Chassis chassis;
    private Suspension suspension;
    private BodyPaint bodyPaint;

    //Atributos do carro
    private double cost;
    private double consumption;
    private double weight;
    private double maxSpeed;
    private double acceleration;
    private double torque;
    private double power;
    private double handling;
    private double brakesPower;

    //Construtor
    Car (Engine engine, Brakes brakes, Tires tires, Chassis chassis, Suspension suspension, BodyPaint bodyPaint) {
        this.engine = engine;
        this.brakes = brakes;
        this.tires = tires;
        this.chassis = chassis;
        this.suspension = suspension;
        this.bodyPaint = bodyPaint;
    }

    //Calcular o valor dos atributos
    public void setStats() {
        cost = engine.setCost() + brakes.setCost() + tires.setCost() + chassis.setCost() + suspension.setCost() + bodyPaint.setCost();
        consumption = engine.setConsumption();
        weight = engine.setWeight() + brakes.setWeight() + tires.setWeight() + chassis.setWeight() + suspension.setWeight();
        power = engine.setHorsePower();
        torque = (((Math.pow(power - 470, 2)) / 800) + power - 200) * (4.2 / 3);
        maxSpeed = (power / torque) * tires.setDiameter() * 8;
        acceleration = 12;
        handling = (engine.setHandling() + tires.setHandling() + chassis.setHandling() + suspension.setHandling()) / 4;

        double frictionCoef = (brakes.setBrake() + tires.setBrake() + chassis.setBrake() + suspension.setBrake()) / 4;
        brakesPower = (160 / frictionCoef) / 55.56;
    }

    //Método para exibição no terminal (Provisório)
    public String toString() {
        return "------------------------------Car------------------------------\n" +
                engine.toString() + brakes.toString() + tires.toString() + chassis.toString() + suspension.toString() + bodyPaint.toString() +
                "\n------------------------------Stats------------------------------\n" + 
                String.format("A - Cost: %.0f\nB - Consumption: %.0f\nC - Weight: %.0f\n" + 
                "D - Max Speed: %.0f\nE - Acceleration: %.0f\nF - Handling: %.0f\nG - Brakes: %.0f",
                cost, consumption, weight, maxSpeed, acceleration, handling, brakesPower);
    }

    //Teste em terminal através da main (Provisório)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------------------Engine Informations--------------------");
        System.out.println("Enter engine type: ");
        String engineType = sc.nextLine();
        System.out.println("Enter cylinder ammount: ");
        double cylinderAmmount = Double.parseDouble(sc.nextLine());
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

        System.out.println("\n--------------------Car Components--------------------");
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

        Engine carEngine = new Engine(engineType, cylinderAmmount, cylinders, aspiration, fuel, engineMaterial, traction);
        Brakes carBrakes = new Brakes(brakes);
        Tires carTires = new Tires(tires);
        Chassis carChassis = new Chassis(chassis);
        Suspension carSuspension = new Suspension(suspension);
        BodyPaint carBodyPaint = new BodyPaint(color);

        sc.close();

        Car carrao = new Car(carEngine, carBrakes, carTires, carChassis, carSuspension, carBodyPaint);
        carrao.setStats();

        System.out.println(carrao.toString());
    }
}