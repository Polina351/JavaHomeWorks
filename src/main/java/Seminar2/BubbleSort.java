package Seminar2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class BubbleSort {
    /**
     * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл
     */
    public static void main(String[] args) {
        int[] arr = {7, 5, 6, 4, 4, 9, 7, 8, 1};
        bubbleSortLogg(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] bubbleSortLogg(int[] array)
    {
        Logger logger = Logger.getLogger(BubbleSort.class.getName());
        FileHandler fh = null;
        try {
            fh = new FileHandler("log.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        boolean isSorted = false;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSorted = false;
                }
            }
            logger.info(Arrays.toString(array));
        }
        return array;
    }
}
