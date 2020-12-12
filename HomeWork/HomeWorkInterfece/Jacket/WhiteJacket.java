package HomeWork.HomeWorkInterfece.Jacket;

public class WhiteJacket implements Jacket {
    @Override
    public void put()
    {
        System.out.print("Wearing white jacket. ");
    }

    @Override
    public void take()
    {
        System.out.print("White jacket removed. ");
    }
}
