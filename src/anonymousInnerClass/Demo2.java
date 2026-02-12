package anonymousInnerClass;

abstract class UsingAbstractClass {
    abstract void display();
}

public class Demo2 {
    static void main(String[] args) {
        UsingAbstractClass p = new UsingAbstractClass() {
            void display() {
                System.out.println("This is abstract anonymous inner class");
            }
        };

        p.display();
    }
}
