package Seminar12.calculator.view;
import Seminar12.calculator.controller.Controller;
import java.util.Scanner;

public class View {
    private Controller controller = new Controller();
    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите A: ");
        int a = scanner.nextInt();
        System.out.print("Введите B: ");
        int b = scanner.nextInt();
        System.out.println("Выберите операцию(+, -, *, /):");
        char operator = scanner.next().charAt(0);
        System.out.printf("%d %c %d = %d", a, operator, b,controller.returnResult(a, b, operator));
    }
}
