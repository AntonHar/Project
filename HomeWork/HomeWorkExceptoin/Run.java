package HomeWorkExceptoin;

public class Run {
    public static <ex> void main(String[] args) throws Exception {

       Car audi = new Car(100,200,"Audi");
        audi.speed = 250;
        audi.price = 20000;
        audi.getTotalInformation();
        System.out.println();

        try {
            audi.start();
        } catch (Exception ex) {
            System.out.println("Perform a restart of the engine");
            System.out.println();
            audi.setNumberStart(audi.getNumberStart() +1);
            audi.start();
            System.out.println();
        }

        Car car1 = new Car();
        car1.getTotalInformation();
        System.out.println();

        try {
            car1.start();
        } catch (Exception ex) {
            System.out.println("Perform a restart of the engine");
            System.out.println();
            audi.setNumberStart(audi.getNumberStart() - 2);
            audi.start();
            System.out.println();
        }


    }
}