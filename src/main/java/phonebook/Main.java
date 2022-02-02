package phonebook;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", 254882);
        phonebook.add("Иванов", 254547);
        phonebook.add("Петров",25544);
        phonebook.get("Иванов");
        phonebook.info();

    }

}
