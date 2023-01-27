package Seminar9;

import java.util.Arrays;

public class ReversArrayList {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private String[] array = new String[INIT_SIZE];
    private int pointer = INIT_SIZE - 1;


    public void add(String item) {
        if(pointer == 0)
            resize(array.length*2);
        array[pointer--] = item;
    }


    public String get (int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }


    private void resize(int newLength) {
        String[] newArray = new String[newLength];
        System.arraycopy(array, 1, newArray,array.length+1, array.length-1);
        pointer = array.length;
        array = newArray;

    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
