package Seminar3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MinMaxAverageValueInList {
    /**
     * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка
     */
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        int size = 10;

        for (int i = 0; i < size; i++) {
            Random random = new Random();
            int value = random.nextInt(1, 10);
            array.add(value);
        }
        System.out.println(array);
        System.out.printf("MinValue = %d\n", minValue(array));
        System.out.printf("MaxValue = %d\n", maxValue(array));
        System.out.printf("AverageValue = %d\n", averageValue(array));
    }
    public static int minValue(List<Integer> arr){
        int minVal = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < minVal){
                minVal = arr.get(i);
            }
        }
        return minVal;
    }

    public static int maxValue(List<Integer> arr){
        int maxVal = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > maxVal){
                maxVal = arr.get(i);
            }
        }
        return maxVal;
    }

    public static int averageValue(List<Integer> arr){
        int sum = 0;
        int average = 0;
        for (int i = 0; i < arr.size(); i++) {
                sum += arr.get(i);
        }
        average = sum / arr.size();
        return average;
    }
}
