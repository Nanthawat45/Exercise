import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ค่าA : ");
        float a = input.nextInt();
        System.out.println("ค่าB : ");
        float b = input.nextInt();
        if (a > b) {
            System.out.println(a + " มากกว่า " + b);
        } else if (a < b) {
            System.out.println(b + " มากกว่า " + a);
        } else {
            System.out.println(a + " เท่ากับ " + b);
        }
    }
}