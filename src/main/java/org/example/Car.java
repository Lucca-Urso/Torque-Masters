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
        handling = (engine.setHandling() + tires.setHandling() + chassis.setHandling() + suspension.setHandling()) / 4;
        acceleration = engine.setTractionCoef() * (torque / (tires.setDiameter() / 100)) / weight;

        double frictionCoef = (brakes.setBrake() + tires.setBrake() + chassis.setBrake() + suspension.setBrake()) / 4;
        brakesPower = (160 / frictionCoef) / 55.56;
    }

    //Método para exibição no terminal (Provisório)
    public String toString() {
        return "------------------------------Car------------------------------\n" +
                engine.toString() + brakes.toString() + tires.toString() + chassis.toString() + suspension.toString() + bodyPaint.toString() +
                "\n------------------------------Stats------------------------------\n" + 
                String.format("A - Cost: %.0f\nB - Consumption: %.0f\nC - Weight: %.0f\n" + 
                "D - Max Speed: %.0f\nE - Acceleration: %.0f\nF - Handling: %.0f\nG - Brakes: %.0f\nH - Power: %.0f\nI - Torque: %.0f",
                cost, consumption, weight, maxSpeed, acceleration, handling, brakesPower, power, torque);
    }
}