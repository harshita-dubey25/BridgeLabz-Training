package addressBookSystem;

public class AddressBookSystem {
    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();

        Address a1 = new Address("Indore", "Madhya Pradesh", "452001");
        Address a2 = new Address("Bhopal", "Madhya Pradesh", "462001");

        Contact c1 = new Contact("Harshita", "Dubey",
                "9876543210", "harshita@gmail.com", a1);

        Contact c2 = new Contact("Aman", "Verma",
                "9123456789", "aman@gmail.com", a2);

        addressBook.addContact(c1);
        addressBook.addContact(c2);

        System.out.println("\n📌 All Contacts (Sorted):");
        addressBook.displayAllContacts();

        System.out.println("\n🔍 Search by City: Indore");
        addressBook.searchByCity("Indore");

        System.out.println("\n✏️ Editing Contact:");
        addressBook.editContact("Harshita", "9999999999", "harshita@newmail.com");

        System.out.println("\n🗑️ Deleting Contact:");
        addressBook.deleteContact("Aman");

        System.out.println("\n📌 Final Contact List:");
        addressBook.displayAllContacts();
    }
}
