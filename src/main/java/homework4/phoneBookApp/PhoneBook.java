package homework4.phoneBookApp;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void putPhone(String surname, String phone) {
        if (phoneBook.containsKey(surname)) {
            phoneBook.get(surname).add(phone);
        } else {
            ArrayList<String> phones = new ArrayList<>();
            phones.add(phone);
            phoneBook.put(surname, phones);
        }
    }

    public PhoneBookEntry getPhones(String surname) {
        ArrayList<String> phones = phoneBook.get(surname);
        if (phones == null){
            throw new RuntimeException("Contact is not exist!");
        }
        PhoneBookEntry phoneBookEntry = new PhoneBookEntry(surname,phones);
        return phoneBookEntry;
    }


}
