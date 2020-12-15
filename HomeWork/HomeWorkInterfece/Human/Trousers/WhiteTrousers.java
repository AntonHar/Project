package HomeWork.HomeWorkInterfece.Trousers;

public class WhiteTrousers implements Trousers {
    @Override
    public void put()
    {
        System.out.print("Wearing white trousers. ");
    }

    @Override
    public void take()
    {
        System.out.print("White trousers removed. ");
    }
}

