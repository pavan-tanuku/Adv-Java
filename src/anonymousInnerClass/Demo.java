package anonymousInnerClass;

class Parent {
    void display() {
        System.out.println("In Parent class");
    }
}

public class Demo {
    static void main(String[] args) {
        Parent p = new Parent(){
            // anonymous inner class
            void display() {
                System.out.println("In anonymous class");
            }
        };

        p.display();
    }
}
