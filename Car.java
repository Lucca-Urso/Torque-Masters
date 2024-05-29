import java.util.Scanner;

public class Car {
    Scanner sc = new Scanner(System.in);

    private Engine engine;
    private Brakes brakes;
    private Tires tires;
    private Chassis chassis;
    private Suspension suspension;
    private BodyPaint bodyPaint;

    private double cost;
    private double consumption;
    private double weight;
    private double maxSpeed;
    private double acceleration;
    private double handling;
    private double brakesPower;

    Car (Engine engine, Brakes brakes, Tires tires, Chassis chassis, Suspension suspension, BodyPaint bodyPaint) {
        this.engine = engine;
        this.brakes = brakes;
        this.tires = tires;
        this.chassis = chassis;
        this.suspension = suspension;
        this.bodyPaint = bodyPaint;
    }

    public String toString() {
        return "------------------------------Car------------------------------\n" +
                engine.toString() + brakes.toString() + tires.toString() + chassis.toString() + suspension.toString() + bodyPaint.toString() +
                "\n------------------------------Stats------------------------------\n";
    }

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

        Engine carEngine = new Engine(engineType, cylinders, aspiration, fuel, engineMaterial, traction);
        Brakes carBrakes = new Brakes(brakes);
        Tires carTires = new Tires(tires);
        Chassis carChassis = new Chassis(chassis);
        Suspension carSuspension = new Suspension(suspension);
        BodyPaint carBodyPaint = new BodyPaint(color);

        sc.close();

        Car subaru = new Car(carEngine, carBrakes, carTires, carChassis, carSuspension, carBodyPaint);
        System.out.println(subaru.toString());
    }
}