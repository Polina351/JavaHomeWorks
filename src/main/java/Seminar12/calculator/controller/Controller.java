package Seminar12.calculator.controller;


import Seminar12.calculator.model.Multiplication;
import Seminar12.calculator.model.Difference;
import Seminar12.calculator.model.Division;
import Seminar12.calculator.model.Sum;
public class Controller {
    public static int returnResult(int a, int b, char operator){
        int res = 0;
        switch (operator){
            case '-':
                Difference difference = new Difference(a,b);
                res = difference.getResult();
                break;
            case '*':
                Multiplication multiplication = new Multiplication(a, b);
                res = multiplication.getResult();
                break;
            case '+':
                Sum sum = new Sum(a,b);
                res = sum.getResult();
                break;
            case '/':
                Division division = new Division(a, b);
                res = division.getResult();
                break;
            default:
                return -1000000;

        }
        return res;
    }
}
