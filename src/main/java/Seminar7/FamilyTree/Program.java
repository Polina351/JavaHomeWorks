package Seminar7.FamilyTree;

public class Program {
    public static void main(String[] args) {
        Human h1 = new Human("Иван", "Первый", 1801, "м");
        Human h2 = new Human("Анна", "Первая", 1803, "ж");

        Human.getMarried(h2, h1);

        Human h3 = new Human("Олег","Первый", 1830, "м");
        Human h4 = new Human("Ольга","Первая", 1832, "ж");
        Human h5 = new Human("Михаил","Первый", 1833, "м");

        Human.getChildren(h2, h1, h3);
        Human.getChildren(h2, h1, h4);
        Human.getChildren(h2, h1, h5);

        Human.getBrotherOrSister(h3, h4);
        Human.getBrotherOrSister(h3, h5);
        Human.getBrotherOrSister(h4, h5);

        Human h6 = new Human("Никита","Первый", 1830, "м");
        Human.getMarried(h4, h6);

        Human h7 = new Human("Ибрагим","Первый", 1830, "м");


        System.out.println(h1);
        System.out.println(h1.connection);
        System.out.println(h2);
        System.out.println(h2.connection);
        System.out.println(h3);
        System.out.println(h3.connection);
        System.out.println(h4);
        System.out.println(h4.connection);
        System.out.println(h5);
        System.out.println(h5.connection);
        System.out.println(h6);
        System.out.println(h6.connection);
    }

}
