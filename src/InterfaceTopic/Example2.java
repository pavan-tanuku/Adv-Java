package InterfaceTopic;

@FunctionalInterface
interface FunctionalInterfaceDemo {
    void show(int i, int j);
}

//class Run implements FunctionalInterfaceDemo {
//    @Override
//    public void show() {
//        System.out.println("Showing..");
//    }
//}

public class Example2 {
    static void main(String[] args) {
        // using the separate class Run to execute show()
//        FunctionalInterfaceDemo d = new Run();
//        d.show();
    // using Anonymous inner class to execute the show();
        FunctionalInterfaceDemo d = new FunctionalInterfaceDemo()
        {
            @Override
            // we even don't declare the data type of local variables
            public void show(int i, int j) {
                System.out.println("Showing.." + "i: " + i + ",j: " + j);
            }
        };
        d.show(1, 2);

        // using the lambda expression
        FunctionalInterfaceDemo d1 = (i, j) -> {
            System.out.println("This is lambda expression.." + "i: " + i + ",j: " + j);
        };
        d1.show(1, 3);
    }
}
