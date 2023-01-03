package Seminar3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RemoveEvenNumbers {
    /**Пусть дан произвольный список целых чисел,
    удалить из него четные числа
     */

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        int size = 10;
        fillArrayList(array,size);
        System.out.println(array);
        removeEvenNum(array);
        System.out.println(array);
    }
    public static void fillArrayList(List<Integer> arr, int size){
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            int value = random.nextInt(1, 10);
            arr.add(value);
        }
    }
    public static void removeEvenNum(List<Integer> arr){
        for (int j = 0; j < arr.size();) {
            if (arr.get(j) % 2 == 0) {
                arr.remove(j);
            }
            else{
                j++;
            }
        }
    }
}
