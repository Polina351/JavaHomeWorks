package Seminar2;

import org.json.JSONArray;

public class StudentsInfo {
    /**
     * Дана json строка (можно сохранить в файл и читать из файла)
     * Написать метод(ы), который распарсит json и, используя StringBuilder,
     * создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет]
     */
    public static void main(String[] args) {
        printInfoStudentsGrade();
    }

    public static void printInfoStudentsGrade()
    {
        JSONArray students = new JSONArray("[" +
                "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]");
        for (int i = 0; i < students.length(); i++)
        {
            StringBuilder lastName = new StringBuilder((String) students.getJSONObject(i).get("фамилия"));
            StringBuilder grade = new StringBuilder((String) students.getJSONObject(i).get("оценка"));
            StringBuilder subject = new StringBuilder((String) students.getJSONObject(i).get("предмет"));
            System.out.println("Студент " + lastName + " получил(а) " + grade + " по предмету " + subject);
        }
    }
}
