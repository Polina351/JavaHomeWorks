package Seminar4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ReversList {
/**
 * 1. Пусть дан LinkedList с несколькими элементами.
 * Реализуйте метод, который вернет “перевернутый” список.
 */

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        int size = 10;
        fillList(list, size);
        System.out.println(list);
        System.out.println(reversList(list));
    }

    private static void fillList(List<Integer> list, int size){
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            int value = random.nextInt(1, 10);
            list.add(value);
        }
    }

    private static List<Integer> reversList(List<Integer> list){
        List<Integer> resList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            resList.add(list.get(i));
        }
        return resList;
    }
}
