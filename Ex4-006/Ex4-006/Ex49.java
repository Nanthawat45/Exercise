import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("จำนวนที่ต้องการตวรจสอบ : ");
        float x = input.nextInt();
        if (x > 0) {
            System.out.println(" Positive number ");
        } else if (x < 0) {
            System.out.println(" Negative number ");
        } else {
            System.out.println(" Zero ");
        }
    }
}
