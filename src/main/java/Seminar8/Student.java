package Seminar8;

import java.util.HashMap;
import java.util.Map;

public final class Student {
    private String firstName;
    private String lastName;
    private int age;
    private Map<String, Integer> statement;

    public Student(String firstName, String lastName, int age, Map<String, Integer> statement) {
        String copyFirstName = "";
        copyFirstName = copyFirstName.copyValueOf(firstName.toCharArray());
        this.firstName = copyFirstName;

        String copyLastName = "";
        copyLastName = copyLastName.copyValueOf(lastName.toCharArray());
        this.lastName = copyLastName;

        this.age = age;

        Map<String, Integer> copyStatement = new HashMap<>();
        for (String key : statement.keySet()) {
            copyStatement.put(key, statement.get(key));
        }
        this.statement = copyStatement;
    }

    public String getFirstName() {
        String copyFirstName = "";
        copyFirstName = copyFirstName.copyValueOf(firstName.toCharArray());
        return copyFirstName;
    }

    public String getLastName() {
        String copyLastName = "";
        copyLastName = copyLastName.copyValueOf(lastName.toCharArray());
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Map<String, Integer> getStatement(){
        Map<String, Integer> copyStatement = new HashMap<>();
        for (String key : statement.keySet()) {
            copyStatement.put(key, statement.get(key));
        }
        return copyStatement;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", statement=" + statement +
                '}';
    }
}
