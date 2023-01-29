import java.util.Scanner;

public class Exercise1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number 1");
        int a = input.nextInt();
        System.out.println("Number 2");
        int b = input.nextInt();
        input.close();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
    }
}