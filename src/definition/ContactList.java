package definition;

public class ContactList {
    private List<Person> contacts;

    public ContactList() {
        contacts = new List<>();
    }

    @Override
    public String toString() {
        return "ContactList{" +
                "contacts=" + contacts +
                '}';
    }

    public void insertPerson(String firstName) {

        contacts.add(new Person(firstName));
    }

    public Person removePerson() {
        return contacts.remove();
    }

    public void displayList() {
        contacts.print();
    }
}