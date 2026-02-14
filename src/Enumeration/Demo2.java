package Enumeration;

enum Laptop {
    IDEA_PAD(80_000), MACBOOK(), PAVILION(60_000), ALIEN(1_20_000);
    // instance variable
    private int price;
    // constructor
    // public constructor is not allowed

    private Laptop() {
        price = 1_00_000;
        System.out.println("In Laptop: " + this.name());
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("In laptop: " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Demo2 {
    public static void main(String[] args) {
//        Laptop lap = Laptop.IDEA_PAD;
//        System.out.println("Laptop: " + lap);
//        System.out.println("Tha price is: " + lap.getPrice());

        for(Laptop l: Laptop.values()) {
            System.out.println(l + ": " + l.getPrice());
        }
    }
}
