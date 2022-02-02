package word;

import java.util.ArrayList;
import java.util.HashMap;


/*1. Создать массив с набором слов (10-20 слов,
 должны встречаться повторяющиеся). Найти и вывести
 список уникальных слов, из которых состоит массив
 (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
 */

public class Word {

    public static void main(String[] args) {
        // создали массив
        String[] word = {"А", "Б", "В", "Г", "Д", "А", "Б", "В", "Г", "Д", "А"};

        // создали 2 коллекции

        ArrayList<String> arrayWord = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        // счетчик совпадений
        int count = 0;
        // проходим по массиву циклом

        for (String words : word) {
            // если в коллеции нет такого слова то добавляем в коллекцию
            if (!arrayWord.contains(words)) {
                arrayWord.add(words);
            } else
// если же есть то берем это слово проходим по массиву снова вторым циклом
            // и смотрим сколько раз оно встреыается
            for (String s1 : word) {
                if (words.equals(s1)) {
                    // записываем количество совпадений в счетчик
                    count++;
                }

            }
            // выходим из внутренненго цикла и записываем наше слово в ключ
            // а количество совпадений в значение
            hm.put(words, count++);
            // обнуляем счетчик
            count = 0;
        }



        System.out.println(arrayWord);
        System.out.println(hm);
    }

    }

