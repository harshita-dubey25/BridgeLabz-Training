package birdSanctuary;

public class Duck extends Bird implements Swimmable {

    public Duck(int id, String name) {
        super(id, name, "Duck");
    }

    @Override
    public void swim() {
        System.out.println(name + " swims calmly on water.");
    }

    @Override
    public void displayInfo() {
        System.out.println(" Duck | ID: " + id + " | Name: " + name);
    }
}