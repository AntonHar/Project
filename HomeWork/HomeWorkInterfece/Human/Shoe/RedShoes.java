package HomeWork.HomeWorkInterfece.Shoe;

public class RedShoes implements Shoes{
    @Override
    public void put()
    {
        System.out.print("Wearing red shoes. ");
    }

    @Override
    public void take()
    {
        System.out.print("Red shoes removed. ");
    }
}
