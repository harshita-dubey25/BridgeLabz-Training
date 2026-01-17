package birdSanctuary;

public class Seagull extends Bird implements Flyable, Swimmable {

    public Seagull(int id, String name) {
        super(id, name, "Seagull");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies over the ocean.");
    }

    @Override
    public void swim() {
        System.out.println(name + " floats on seawater.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Seagull | ID: " + id + " | Name: " + name);
    }
}