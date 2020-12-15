package HomeWorkExceptoin;

import java.util.Random;

public class GeneratorUtil {

    static String brand;
    static int speed;
    static int price;

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        GeneratorUtil.brand = brand;
    }

    public static int getSpeed() {
        return speed;
    }

    public static void setSpeed(int speed) {
        GeneratorUtil.speed = speed;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        GeneratorUtil.price = price;
    }

    static String  generateBrand()
    {
        String[] brendList = new String[]{"Audi", "Bentli", "Porche", "Volvo","Ferrari", "Maserati", "BMW", "Ford", "Mustang"};
        Random randomBrend = new Random();
        int randomIdx;
        randomIdx = randomBrend.nextInt(brendList.length);
        brand = brendList[randomIdx];
        return brand;
    }

    static int generateSpeed()
    {
        Random randomSpeed = new Random();
        speed = randomSpeed.nextInt(301) + 100;
        return  speed;
    }

    static int generatePrice()
    {
        Random randomPrice = new Random();
        price = randomPrice.nextInt(301) + 100;
        return  price;
    }
}
