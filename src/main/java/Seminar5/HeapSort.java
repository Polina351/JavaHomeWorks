package Seminar5;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {15, 12, 1, 53, 100, 27, 81};
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void heapSort(int[] arr){
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapIfy(arr, i, n);
        }
        for (int i = n -1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapIfy(arr, 0, i);
        }
    }
    private static void heapIfy(int[] arr, int i, int n) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int largest = i;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (i != largest){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapIfy(arr, largest, n);
        }
    }
}
