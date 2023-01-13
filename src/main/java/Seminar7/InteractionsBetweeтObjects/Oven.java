package Seminar7.InteractionsBetweeтObjects;

import java.security.KeyStore;

public class Oven {
    boolean serviceable;

    public Oven(boolean serviceable) {
        this.serviceable = serviceable;
    }

    static void cookFood(Oven oven, Human human ){
        if(oven.serviceable){
            System.out.printf("Еда для %s приготовлена", human.name);
            human.hangry = false;
            human.status = "Cытый";
        }else {
            System.out.printf("%s, необходим ремонт плиты", human.name);
        }
    }


}
