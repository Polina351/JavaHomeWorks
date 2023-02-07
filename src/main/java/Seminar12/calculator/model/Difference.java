package Seminar12.calculator.model;

public class Difference extends MathOperation {
    public Difference(int a, int b){
        super(a, b);
    }
    public int getResult() {
        return A - B;
    }
}
