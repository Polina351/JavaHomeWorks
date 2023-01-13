package Seminar6;

public class Laptop {
    String brend;
    String model;
    int seriesNumber;
    String colour;
    int RAM;
    int SSD;

    public Laptop(String brend, String model,int seriesNumber, String colour, int RAM, int SSD) {
        this.brend = brend;
        this.model = model;
        this.seriesNumber = seriesNumber;
        this.colour = colour;
        this.RAM = RAM;
        this.SSD = SSD;
    }

    @Override
    public String toString() {
        String res = String.format("brend:%s model:%s colour:%s RAM:%d SSD:%d\n",brend, model, colour, RAM, SSD);
        return res;
    }


}
