package Seminar6;

import java.util.*;

public class Program {
    public static void main(String[] args) {
    Set<Laptop> setLaptop = createLaptopSet();
    Map<Integer, String> parametrNum = new HashMap();
    Map filter = new HashMap();
    fillMapParametr(parametrNum);
    filter(parametrNum, filter);


    }
    public static Set<Laptop> createLaptopSet(){
        Laptop lt1 = new Laptop("Lenovo", "AD56987", 589_641, "Black", 8, 512);
        Laptop lt2 = new Laptop("Lenovo", "AD56988", 862_658, "Grey", 8, 512);
        Laptop lt3 = new Laptop("Lenovo", "AC86246", 628_854, "Black", 16, 1024);
        Laptop lt4 = new Laptop("Samsung", "SH452686", 596_584, "Black", 8, 512);
        Laptop lt5 = new Laptop("Samsung", "SD458962", 126_656, "Grey", 16, 512);
        Laptop lt6 = new Laptop("Samsung", "SD458963", 965_125, "Blue", 16, 1024);
        Laptop lt7 = new Laptop("Samsung", "SD585632", 526_745, "Black", 8, 512);
        Laptop lt8 = new Laptop("Apple", "A85632R", 635_856, "Pink", 16, 512);
        Laptop lt9 = new Laptop("Apple", "A88563R", 412_536, "Grey", 16, 1024);
        Laptop lt10 = new Laptop("Apple", "A82365R", 758_236, "Grey", 8, 512);
        Laptop lt11 = new Laptop("Apple", "A85324R", 425_523, "Blue", 8, 512);
        Laptop lt12 = new Laptop("HP", "HP452367B", 183_729, "Grey", 16, 1024);
        Laptop lt13 = new Laptop("HP", "HP452367B", 718_283, "Blue", 8, 512);

        Set<Laptop> setLaptop = new HashSet<>(Arrays.asList(lt1, lt2, lt3, lt4, lt5, lt6, lt7, lt8, lt9, lt10, lt11, lt12, lt13));

        System.out.println(setLaptop);
        return setLaptop;
    }

    public static void filter(Map<Integer, String> parametrNum, Map filter ){


        boolean flag = true;
        while (flag){
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            System.out.println("1 - Производитель\n2 - Цвет\n3 - RAM\n4 - SSD\n5-Применить фильтр");
            Scanner input = new Scanner(System.in);
            int paramertNumber = input.nextInt();
            if (paramertNumber == 3){
                System.out.println("Введите значение RAM(8 16)");
                int ramValue = input.nextInt();
                filter.put(parametrNum.get(paramertNumber), ramValue );
            }
            if (paramertNumber == 4){
                System.out.println("Введите значение SSD(512 1024)");
                int ssdValue = input.nextInt();
                filter.put(parametrNum.get(paramertNumber), ssdValue );
            }
            if (paramertNumber == 2) {
                System.out.print("Введите цвет(Pink, Grey, Blue,  Black): ");
                String colour = input.next();
                filter.put(parametrNum.get(paramertNumber), colour );
            }
            if (paramertNumber == 1) {
                System.out.print("Введите производителя(Lenovo, Samsung, Apple, HP): ");
                String brend = input.next();
                filter.put(parametrNum.get(paramertNumber), brend);
            }
            if (paramertNumber == 5) {
                flag = false;
            }
            else{
                System.out.println("Неверное значение");
            }
            System.out.println(filter);
        }
    }

    private static void fillMapParametr(Map<Integer, String> map){
        map.put(1, "brend");
        map.put(2, "colour");
        map.put(3, "RAM");
        map.put(4, "SSD");
    }

}
