package Seminar5;

import java.util.ArrayList;
import java.util.HashMap;

public class TelephoneBook {
    private static HashMap<String, ArrayList<Integer>> telephoneList = new HashMap<>();
    public static void main(String[] args) {
        fillTelBook();
        System.out.println(telephoneList);
    }
    private static void add (String name, Integer number){
        if (telephoneList.containsKey(name)) {
            telephoneList.get(name).add(number);
        }else {
            ArrayList<Integer> values = new ArrayList<>();
            values.add(number);
            telephoneList.put(name, values);
        }
    }

    public static void fillTelBook(){
        add("Иванов Иван", 523642);
        add("Денисов Денис", 589652);
        add("Иванов Иван", 853689);
        add("Мишин Михаил", 569314);
        add("Мишин Михаил", 543265);
        add("Петрова Зоя", 536241);
    }
}
