package InterfaceTopic;

@FunctionalInterface
interface FunctionalInterfaceDemo {
    void show();
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
            public void show() {
                System.out.println("Showing..");
            }
        };

        d.show();
    }
}
