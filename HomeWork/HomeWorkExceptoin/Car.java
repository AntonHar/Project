package HomeWorkExceptoin;

import java.sql.SQLOutput;

public class Car extends GeneratorUtil{

    public Car(){
        this.brand = generateBrand();
        this.speed = generateSpeed();
        this.price = generatePrice();
    }
    public Car(int speed,int price, String brand){
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    void getTotalInformation(){
        System.out.println("Total information: The car " + brand + " moves with speed " + speed +" and its value " + price + "$.");
        System.out.println();
    }

    int numberStart = (int) (Math.random() * 21);

    public int getNumberStart() {
        return numberStart;
    }

    public void setNumberStart(int numberStart) {
        this.numberStart = numberStart;
    }

    int start() throws Exception {

        if (numberStart %2 == 0){
            Exception ex = new Exception();
            throw ex;

        }
         if (numberStart %2 == 1)
        {
            System.out.println("A car " + brand + " started up.");
            System.out.println();
        }

        return numberStart;
    }

    void restart () {
        numberStart = numberStart -9;
        if (numberStart > 0 & numberStart < 20) {
                System.out.println("The engine restart was successful. Enjoy your journey.");
        } else {
                System.out.println("The restart failed. Contact The service center");
        }
    }



}

