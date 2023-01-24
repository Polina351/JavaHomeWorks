package Seminar8;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
       Map statement = createStatement();

       Student student1 = new Student("Ivan", "Ivanov", 19, statement);
       System.out.println(student1);
    }
    static Map<String, Integer> createStatement(){
        Map<String, Integer> statement = new HashMap<>();
        statement.put("History", 89);
        statement.put("Geography", 95);
        return statement;
    }

}
