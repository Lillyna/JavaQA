package homework4.phoneBookApp;

public class TaskTwoApp {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.putPhone("Smith", "+18645615466");
        phoneBook.putPhone("Dawson", "+18645615467");
        phoneBook.putPhone("Ackerman", "+18645615465");
        phoneBook.putPhone("Smith", "+18645615464");
        System.out.println(phoneBook.getPhones("Smith"));
    }
}
