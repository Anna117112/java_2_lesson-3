package phonebook;


import java.util.ArrayList;
import java.util.HashMap;

/*2. Написать простой класс ТелефонныйСправочник,
который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи.
С помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.
 */
public class Phonebook {
    private HashMap<String, ArrayList<Integer>> listPhonebook = new HashMap<>();

    public void add(String surname, Integer number){
       // HashMap<String, ArrayList<Integer>> listPhonebook = new HashMap<>();
        if (!listPhonebook.containsKey(surname)){
            listPhonebook.put(surname, new ArrayList<>());
            listPhonebook.get(surname).add(number);
    }
        else
            listPhonebook.get(surname).add(number);

    }
    public void get (String surname){

        System.out.println(listPhonebook.get(surname));
    }
    public void info (){
        System.out.println(listPhonebook);
    }

}
