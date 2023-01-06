package Seminar4;
import java.util.*;
public class Calc {
    /**
     * 3. В калькулятор добавьте возможность отменить последнюю операцию.
     */
    public static void main(String[] args) {
        delAction();
    }

    public static void delAction() {
        Deque<Integer> queue = new LinkedList<>();
        boolean flag = true;
        while (flag) {
            int num = calculator();
            queue.addLast(num);
            System.out.println(queue);
            System.out.println("Для отмены действия введите 'отмена'");
            System.out.println("Для выхода из калькулятора введите 'выход'");
            Scanner scanner = new Scanner(System.in);
            String back = scanner.next();

            if (back.equals("отмена")) {
                queue.pollFirst();
            }
            if (back.equals("выход")) {
                flag = false;
            }
        }
    }

    public static int calculator() {
        System.out.println("Введите число а: ");
        Scanner enterNumber = new Scanner(System.in);
        int a = enterNumber.nextInt();
        System.out.println("Введите число b: ");
        int b = enterNumber.nextInt();
        System.out.println("Введите действие (+,-,*,/): ");
        char c = enterNumber.next().charAt(0);
        if(c == '+') {
            return sum(a, b);
        } else if (c == '-') {
            return difference(a, b);
        } else if (c == '*') {
            return multiplication(a, b);
        } else if (c == '/') {
            return division(a, b);
        } else {
            System.out.println("Введены неверные значения");
            return 0;
        }
    }
    public static int sum(int a, int b) {
        return a+b;
    }
    public static int difference(int a, int b) {
        return a-b;
    }
    public static int multiplication(int a, int b) {
        return a*b;
    }
    public static int division(int a, int b) {
        return a/b;
    }
}
