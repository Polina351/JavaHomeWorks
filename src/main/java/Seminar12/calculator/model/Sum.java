package Seminar12.calculator.model;

public class Sum extends MathOperation {
    public Sum(int a, int b){
        super(a, b);
    }
    public int getResult() {
        return A + B;
    }
}
