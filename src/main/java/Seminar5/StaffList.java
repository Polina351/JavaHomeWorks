package Seminar5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class StaffList {
    private static HashMap<String, String> personList = new HashMap<>();
    private static HashMap<String, Integer> countName = new HashMap<>();

    /*Иван Иванов
    Светлана Петрова
    Кристина Белова
    Анна Мусина
    Анна Крутова
    Иван Юрин
    Петр Лыков
    Павел Чернов
    Петр Чернышов
    Мария Федорова
    Марина Светлова
    Мария Савина
    Мария Рыкова
    Марина Лугова
    Анна Владимирова
    Иван Мечников
    Петр Петин
    Иван Ежов
    */
    public static void main(String[] args) {
        fillList();
        System.out.println(personList);
        ArrayList<String> names = new ArrayList<>(personList.values());
        Collections.sort(names);
        countNames(names);
        System.out.println(countName);

    }
    private static void fillList() {
        personList.putIfAbsent("Иванов","Иван");
        personList.putIfAbsent("Петрова","Светлана");
        personList.putIfAbsent("Белова","Кристина");
        personList.putIfAbsent("Мусина","Анна");
        personList.putIfAbsent("Крутова","Анна");
        personList.putIfAbsent("Юрин","Иван");
        personList.putIfAbsent("Лыков","Петр");
        personList.putIfAbsent("Чернов","Павел");
        personList.putIfAbsent("Чернышов","Петр");
        personList.putIfAbsent("Федорова","Мария");
        personList.putIfAbsent("Светлова","Марина");
        personList.putIfAbsent("Савина","Мария");
        personList.putIfAbsent("Рыкова","Мария");
        personList.putIfAbsent("Лугова","Марина");
        personList.putIfAbsent("Владимирова","Анна");
        personList.putIfAbsent("Мечников","Иван");
        personList.putIfAbsent("Петин","Петр");
        personList.putIfAbsent("Ежов","Иван");
    }

    private static void countNames(ArrayList<String> names){

        int counter = 1;
        String controlName = names.get(0);

        for (int i = 1; i < names.size(); i++) {
            if (names.get(i) == controlName) {
                counter++;
            }else {
                countName.put(controlName, counter);
                counter = 1;
                controlName = names.get(i);
            }
        }
        countName.put(controlName, counter);
    }
}
