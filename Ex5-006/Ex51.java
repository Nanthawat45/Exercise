import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ใส่ตัวเลขที่ 1 : ");
        float num1 = input.nextInt();
        System.out.println("ใส่ตัวเลขที่ 2 : ");
        float num2 = input.nextInt();
        System.out.println("ใส่ตัวเลขที่ 3 : ");
        float num3 = input.nextInt();
        System.out.println("ใส่ตัวเลขที่ 4 : ");
        float num4 = input.nextInt();
        System.out.println("ใส่ตัวเลขที่ 5 : ");
        float num5 = input.nextInt();
        float max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        if (max < num4) {
            max = num4;
        }
        if (max < num5) {
            max = num5;
        }
        System.out.println("The maximum value is" + max);
    }
}