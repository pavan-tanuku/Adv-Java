package InterfaceTopic;

interface Car {

    String engine = "All-TYPE";

    void move();
    void stop();
}
interface XUV extends Car{
    void race();
}

class Cars implements XUV{

    @Override
    public void move() {
        System.out.println("The car is moving");
    }
    @Override
    public void stop() {
        System.out.println("The car has been stop");
    }

    @Override
    public void race() {
        System.out.println("This is a racing car");
    }
}
public class Example1 {
    static void main(String[] args) {
        Cars c = new Cars();
        c.move();
        c.race();
        c.stop();
        System.out.println(Car.engine);
    }
}
