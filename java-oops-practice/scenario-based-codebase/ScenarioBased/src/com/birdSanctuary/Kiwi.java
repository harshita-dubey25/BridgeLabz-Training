package birdSanctuary;

public class Kiwi extends Bird {

    public Kiwi(int id, String name) {
        super(id, name, "Kiwi");
    }

    @Override
    public void displayInfo() {
        System.out.println("Kiwi | ID: " + id + " | Name: " + name);
    }
}