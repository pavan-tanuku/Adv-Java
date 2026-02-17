package InterfaceTopic;

interface Arithmetic {
    int add(int a, int b);
}

public class Example3 {
    static void main(String[] args) {
        Arithmetic a = (i, j) -> (i+j);
        int res1 = a.add(1,2);
        System.out.println("with one statement: " + res1);

        Arithmetic b = (x, y) -> {
            System.out.println("This is more than 1 statement");
            return (x+y);
        };
        int res2 = b.add(2,3);
        System.out.println(res2);
    }
}
