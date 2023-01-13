package Seminar7.FamilyTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Human {
    String firstName;
    String lastName;
    int yearOfBirth;
    String sex;
    Map<String, String> connection;

    public Human(){
        System.out.print("Введите имя: ");
        Scanner value = new Scanner(System.in);
        this.firstName = value.next();
        System.out.print("Введите фамилию: ");
        this.lastName = value.next();
        System.out.print("Введите год рождения: ");
        this.yearOfBirth = value.nextInt();
        System.out.print("Введите пол (м или ж)");
        this.sex = value.next();
        this.connection = new HashMap<>();
    }
    public Human(String firstName, String lastName, int yearOfBirth, String sex){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.sex = sex;
        this.connection = new HashMap<>();
    }

    public static void getMarried(Human bride, Human groom){
        bride.connection.put(groom.firstName, "муж");
        groom.connection.put(bride.firstName, "жена");
    }

    public static void getChildren(Human mom, Human dad, Human child) {
        mom.connection.put(child.firstName, "ребенок");
        dad.connection.put(child.firstName, "ребенок");
        child.connection.put(mom.firstName, "мама");
        child.connection.put(dad.firstName, "папа");
    }

    public static void getBrotherOrSister(Human child1, Human child2){
        if(child2.sex == "ж") {
            child1.connection.put(child2.firstName, "сестра");
        }else {
            child1.connection.put(child2.firstName, "брат");
        }
        if(child1.sex == "ж") {
            child2.connection.put(child1.firstName, "сестра");
        }else {
            child2.connection.put(child1.firstName, "брат");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d г.р", firstName, lastName, yearOfBirth);
    }


}
