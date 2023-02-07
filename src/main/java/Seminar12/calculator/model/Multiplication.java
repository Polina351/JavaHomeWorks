package Seminar12.calculator.model;

public class Multiplication extends MathOperation {
    public Multiplication(int a, int b){
        super(a, b);
    }
    public int getResult() {
        return A * B;
    }
}
