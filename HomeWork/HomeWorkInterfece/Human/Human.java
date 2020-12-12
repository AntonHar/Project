package HomeWork.HomeWorkInterfece.Human;

import HomeWork.HomeWorkInterfece.Jacket.Jacket;
import HomeWork.HomeWorkInterfece.Jacket.RedJacket;
import HomeWork.HomeWorkInterfece.Jacket.WhiteJacket;
import HomeWork.HomeWorkInterfece.Shoe.RedShoes;
import HomeWork.HomeWorkInterfece.Shoe.Shoes;
import HomeWork.HomeWorkInterfece.Shoe.WhiteShoes;
import HomeWork.HomeWorkInterfece.Trousers.RedTrousers;
import HomeWork.HomeWorkInterfece.Trousers.Trousers;
import HomeWork.HomeWorkInterfece.Trousers.WhiteTrousers;

public class Human {
    private String name;
    private Jacket jacket;
    private Shoes shoes;
    private Trousers trousers;

    public Human() {
        this.name = name;
        this.jacket = jacket;
        this.shoes = shoes;
        this.trousers = trousers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public Trousers getTrousers() {
        return trousers;
    }

    public void setTrousers(Trousers trousers) {
        this.trousers = trousers;
    }

    public void put()
    {
        jacket.put();
        trousers.put();
        shoes.put();
        System.out.println();
    }
    public void take()
    {
        jacket.take();
        trousers.take();
        shoes.take();
        System.out.println();
    }

    public static void main(String[] args) {
        RedShoes redShoes = new RedShoes();
        WhiteShoes whiteShoes = new WhiteShoes();
        RedJacket redJacket = new RedJacket();
        WhiteJacket whiteJacket = new WhiteJacket();
        RedTrousers redTrousers = new RedTrousers();
        WhiteTrousers whiteTrousers = new WhiteTrousers();

        Human Human1 = new Human();
        Human1.name = "Tony.";
        Human1.shoes = whiteShoes;
        Human1.trousers = redTrousers;
        Human1.jacket = whiteJacket;
        System.out.println(Human1.name);
        Human1.put();
        Human1.take();
        System.out.println();

        Human Human2 = new Human();
        Human2.name = "Hercules.";
        Human2.shoes = redShoes;
        Human2.trousers = whiteTrousers;
        Human2.jacket = redJacket;
        System.out.println(Human2.name);
        Human2.put();
        Human2.take();
        System.out.println();


    }
}
