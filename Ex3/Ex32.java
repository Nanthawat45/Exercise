import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter the number : ");
            number = input.nextInt();
        } while (number <= 0);
        System.out.println("Your number is : " + number);
        System.out.println(" ---------------------------- ");

    }

}