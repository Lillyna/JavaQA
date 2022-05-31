package homework4.phoneBookApp;

import java.util.ArrayList;

public class PhoneBookEntry {
    String surname;
    ArrayList<String> phones;

    public PhoneBookEntry(String surname, ArrayList<String> phones) {
        this.surname = surname;
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "PhoneBookEntry{" +
                "surname='" + surname + '\'' +
                ", phones=" + phones +
                '}';
    }
}
