import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ค่าความกว้างของสี่เหลี่ยมผืนผ้า :");
        float w = input.nextInt();
        System.out.println("ค่าความกว้างของสี่เหลี่ยมผืนผ้า :");
        float l = input.nextInt();
        float area = w * l;
        System.out.println("พื้นที่สี่เหลี่ยมผืนผ้า : " + area);
    }
}
