package Enumeration;

enum Status {
    Running, Pending, Failed, Successful
}

public class Demo {
    static void main(String[] args) {
        Status e = Status.Pending;
        System.out.println(e);
        System.out.println("Iterating Enum using values() and Enhanced for loop");
        // getting ordinal of all and values() return an array
        Status[] ss = Status.values();
        for(Status s: ss) {
            System.out.println(s + " " + s.ordinal());
        }
        System.out.println();
        System.out.println("Enum Using \"switch\"");
        // switch
        switch (e) {
            case Running -> System.out.println("All Good");
            case Pending -> System.out.println("Please wait!");
            case Failed -> System.out.println("Try again");
            case Successful -> System.out.println("Done");
        }
    }
}
