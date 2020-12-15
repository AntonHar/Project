package HomeWorkExceptoin;

public class Car extends GeneratorUtil{
    int speed1;
    int price1;
    String brand1;

    public Car(int speed1, int price1, String brand1){
        this.brand1 = brand;
        this.speed1 =speed;
        this.price1 = price;
    }

    public Car(){
        this.brand = getBrand();
        this.speed = getSpeed();
        this.price = getPrice();
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


}