import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection;
        System.out.print("ระบุจำนวนลิตของน้ำ : ");
        float water = input.nextFloat();
        System.out.println("เลือกข้อใดข้อ1:");
        System.out.println("1.ลูกค้าทั่วไป");
        System.out.println("2.ธุรกิจเชิงพานิชย์");

        selection = input.nextInt();
        switch (selection) {
            case 1:
                System.out.println("ลูกค้าทั่วไป");
                System.out.println("จะต้องจ่ายเท่าไหร่ " + (100 + (water * 0.5)));
                break;
            case 2:
                System.out.println("ธุรกิจเชิงพานิชย์");
                System.out.println("จะต้องจ่ายเท่าไหร่ " + (100 + (water * 0.9)));
                break;
        }
        input.close();

    }
}