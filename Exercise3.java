import java.util.Scanner;

public class Exercise3 {
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
        System.out.println("Input first number:");
        int N1 = input.nextInt();
        System.out.println("Input second number:");
        int N2 = input.nextInt();
        System.out.println("Input third number: ");
        int N3 = input.nextInt();
        System.out.println("Input fourth number: ");
        int N4 = input.nextInt();
        System.out.println("Enter fifth number: ");
        int N5 = input.nextInt();
        input.close();
        double average = (N1+N2+N3+N4+N5)/5;
        System.out.println("Average of " +N1+","+N2+","+N3+","+N4+" and "+N5+" is "+average);
    }
}
