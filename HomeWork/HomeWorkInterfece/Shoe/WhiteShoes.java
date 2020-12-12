package HomeWork.HomeWorkInterfece.Shoe;

public class WhiteShoes implements Shoes{
    @Override
    public void put()
    {
        System.out.print("Wearing white shoes. ");
    }

    @Override
    public void take()
    {
        System.out.print("White shoes removed. ");
    }
}
