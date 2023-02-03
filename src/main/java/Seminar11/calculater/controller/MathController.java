package Seminar11.calculater.controller;

import Seminar11.calculater.model.EquasionModel;
import Seminar11.calculater.service.Service;

import java.util.ArrayList;
import java.util.List;

public class MathController {
    Service service = new Service();
    public int getNumbers (int a, int b, char operator){
        EquasionModel equasionModelA = new EquasionModel(a);
        EquasionModel equasionModelB = new EquasionModel(b);
        return service.operation(equasionModelA,equasionModelB, operator);
    }
}
