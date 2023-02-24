import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ใส่ค่าx :");
        float x = input.nextInt();
        double area = (x * x) + (2 * x) + 10;
        System.out.println("ผลคำตอบ : " + area);
    }
}
