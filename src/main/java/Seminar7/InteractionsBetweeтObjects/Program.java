package Seminar7.InteractionsBetweeтObjects;

public class Program {
    public static void main(String[] args) {
        Human h1 = new Human("Bаня", true);
        Human h2 = new Human("Лена", false);
        Human h3 = new Human("Паша", true);

        System.out.println(h1);
        System.out.println(h2);

        Oven oven1 = new Oven(true);
        Oven oven2 = new Oven(false);

        Oven.cookFood(oven1, h1);
        System.out.println();
        System.out.println(h1);

        Oven.cookFood(oven2, h3);
        System.out.println();
        System.out.println(h3);
    }
}
