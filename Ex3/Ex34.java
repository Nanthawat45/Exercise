import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        System.out.print("Enter the number : ");
        int numberO = input.nextInt();
        System.out.print("Enter the number : ");
        int numberT = input.nextInt();
        int max;
        if (number > numberO) {
            if (number > numberT) {
                max = number;
            } else {
                max = numberT;
            }

        } else {
            if (numberO > numberT) {
                max = numberO;
            } else {
                max = numberT;
            }
        }
        System.out.println("Maximum number is : " + max);
    }

}