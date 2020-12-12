package HomeWork.HomeWorkInterfece.Jacket;

public class RedJacket implements Jacket{
    @Override
    public void put()
    {
        System.out.print("Wearing red jacket. ");
    }

    @Override
    public void take()
    {
        System.out.print("Red jacket removed. ");
    }
}
