package Seminar11.calculater.view;

import Seminar11.calculater.controller.MathController;

import java.util.Scanner;

public class ExampleView {
    private MathController mathController = new MathController();
    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите A: ");
        int a = scanner.nextInt();
        System.out.print("Введите B: ");
        int b = scanner.nextInt();
        System.out.println("Выберите операцию(+, -, *, /):");
        char operator = scanner.next().charAt(0);
        System.out.printf("%d %c %d = %d", a, operator, b,mathController.getNumbers(a,b, operator));
    }
}
