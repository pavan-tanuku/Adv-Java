package exceptions;

import java.util.Scanner;

public class Demo1 {
    static void main(String[] args) {
        int a = 10, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number into \"b:\" ");
        b = sc.nextInt();

        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;

        String str = null;

        try {
            c = a / b;
            System.out.println("No Exception..");
            System.out.println("The result is: " + c);
            System.out.println();
        } catch (ArithmeticException e) {
            System.out.println("This block is Arithmetic Exception.");
            System.err.println("The result is: " + e);
            System.out.println();
        }
        try {
            System.out.println("Accessing the array elements.");
            System.out.println("the element is: " + arr[2]);
            System.out.println();
            System.out.println("Accessing the null string");
            System.out.println("The length of the string str is: " + str.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This block is ArrayIndexOutOfBoundsException.");
            System.err.println("The exception message is: " + e);
            System.err.println("The exception message is: " + e.getMessage());
            System.out.println();
        }
        catch (Exception e) {
            System.out.println("This block is Super Exception.");
            System.err.println("The complete exception is: " + e);
            System.err.println("The exception message is: " + e.getMessage());
            System.out.println();
        }
        System.out.println("This is after all the catch block.");
    }
}
