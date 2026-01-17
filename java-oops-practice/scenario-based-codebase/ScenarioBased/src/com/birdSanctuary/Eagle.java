package birdSanctuary;

public class Eagle extends Bird implements Flyable {

    public Eagle(int id, String name) {
        super(id, name, "Eagle");
    }

    @Override
    public void fly() {
        System.out.println(name + " soars high in the sky.");
    }

    @Override
    public void displayInfo() {
        System.out.println(" Eagle | ID: " + id + " | Name: " + name);
    }
}