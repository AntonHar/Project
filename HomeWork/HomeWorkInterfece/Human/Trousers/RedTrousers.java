package HomeWork.HomeWorkInterfece.Trousers;

public class RedTrousers implements Trousers{

    @Override
    public void put()
    {
        System.out.print("Wearing red trousers. ");
    }

    @Override
    public void take()
    {
        System.out.print("Red trousers removed. ");
    }
}
