package Seminar11.calculater.service;

import Seminar11.calculater.model.EquasionModel;

public class Service {

    public int operation(EquasionModel a, EquasionModel b, char operator){
        if (operator == '+'){
            return sum(a,b);
        }
        if (operator == '-'){
            return difference(a,b);
        }
        if (operator == '*'){
            return multiplication(a,b);
        }
        if (operator == '/'){
            return division(a,b);
        }
        else return -1000000;

    }

    public int sum(EquasionModel a, EquasionModel b){
        return a.getNumber() + b.getNumber();
    }
    public int difference(EquasionModel a, EquasionModel b){
        return a.getNumber() - b.getNumber();
    }
    public int multiplication(EquasionModel a, EquasionModel b){
        return a.getNumber() * b.getNumber();
    }
    public int division(EquasionModel a, EquasionModel b){
        return a.getNumber() / b.getNumber();
    }

}
