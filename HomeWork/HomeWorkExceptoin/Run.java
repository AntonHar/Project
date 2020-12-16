package HomeWorkExceptoin;

public class Run {
    public static <ex> void main(String[] args) throws Exception {

       Car audi = new Car(200,30000,"MAZWRATI");
       /* audi.speed = 250;
        audi.price = 20000;*/
        audi.getTotalInformation();

        try {
            audi.start();
        } catch (Exception ex) {
            System.out.println("Perform a restart of the engine");
            System.out.println();
            audi.setNumberStart(audi.getNumberStart() + 1);
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
            car1.setNumberStart(car1.getNumberStart() - 1);
            car1.start();
            System.out.println();
        }

        Car car2 = new Car();
        car2.getTotalInformation();
        System.out.println();

        try {
            car2.start();
        } catch (Exception ex) {
            System.out.println("Perform a restart of the engine");
            car2.restart();
        }
    }
}