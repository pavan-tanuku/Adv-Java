package innerClass;

class Outer {
    public String name;

    public void show() {
        System.out.println("in outer class");
    }

    class Inner {
        public int age;

        public void show() {
            System.out.println("in inner class");
        }
    }
}

public class Example1 {
    static void main(String[] args) {
        Outer o = new Outer();
        o.show();
        Outer.Inner i = o.new Inner();
        i.show();
    }
}
