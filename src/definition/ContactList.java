package definition;

public class ContactList {
    private List<Person> contacts;

    public ContactList() {
        contacts = new List<>();
    }

    public void insertPerson(Person data) {

        contacts.add(new Person(firstName, lastName, (List<String>) numbers, email));
    }

    public Person removePerson() {
        return contacts.remove();
    }
}