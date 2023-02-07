package Seminar12.calculator.model;

abstract class MathOperation {
    int A;
    int B;

    public MathOperation(int a, int b) {
        A = a;
        B = b;
    }

    abstract int getResult();
}
