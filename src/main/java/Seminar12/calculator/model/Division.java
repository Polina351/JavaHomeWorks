package Seminar12.calculator.model;

public class Division extends MathOperation {
    public Division(int a, int b){
        super(a, b);
    }
    public int getResult() {
        return A / B;
    }
}
