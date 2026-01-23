package addressBookSystem;

import java.util.*;

public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(contact.getFirstName())) {
                System.out.println("❌ Duplicate contact not allowed.");
                return;
            }
        }
        contacts.add(contact);
        System.out.println("✅ Contact added successfully.");
    }

    public void editContact(String firstName, String newPhone, String newEmail) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName)) {
                c.setPhoneNumber(newPhone);
                c.setEmail(newEmail);
                System.out.println("✏️ Contact updated.");
                return;
            }
        }
        System.out.println("❌ Contact not found.");
    }

    public void deleteContact(String firstName) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact c = iterator.next();
            if (c.getFirstName().equalsIgnoreCase(firstName)) {
                iterator.remove();
                System.out.println("🗑️ Contact deleted.");
                return;
            }
        }
        System.out.println("❌ Contact not found.");
    }

    public void searchByCity(String city) {
        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(city)) {
                System.out.println(c);
            }
        }
    }

    public void searchByState(String state) {
        for (Contact c : contacts) {
            if (c.getAddress().getState().equalsIgnoreCase(state)) {
                System.out.println(c);
            }
        }
    }

    public void displayAllContacts() {
        Collections.sort(contacts);
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
