package Seminar9;

public class Main {
    public static void main(String[] args) {
        ReversArrayList arrayList = new ReversArrayList();


        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
        arrayList.add("8");
        arrayList.add("9");
        arrayList.add("10");
        arrayList.add("11");
        arrayList.add("12");
        arrayList.add("13");
        arrayList.add("14");
        arrayList.add("15");

        System.out.println(arrayList);
        arrayList.add("16");
        System.out.println(arrayList);
        System.out.println("Размер массива:" + arrayList.size());

    }
}
