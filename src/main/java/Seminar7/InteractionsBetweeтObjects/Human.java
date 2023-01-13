package Seminar7.InteractionsBetweeтObjects;

public class Human {
    String name;
    boolean hangry;
    String status;

    public Human(String name, boolean hangry) {
        this.name = name;
        this.hangry = hangry;
        if (this.hangry){
            this.status = "Голодный";
        }else this.status = "Сытый";
    }

    @Override
    public String toString() {
        return String.format("%s - %s", name, status);
    }
}
