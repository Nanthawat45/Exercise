import java.util.Scanner;

public class Ex59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ชื่อ ");
        String name = scan.next();
        System.out.println("ปีเกิด ");
        int birthday_year = scan.nextInt();
        while (birthday_year >= 2566) {
            System.out.println("ท่านระบุข้อมูลผิด");
            System.out.println("ปีเกิด ");
            birthday_year = scan.nextInt();
        }
        birthday_year++;

        int sum = 2566 - birthday_year;
        System.out.println("ชื่อ : " + name);
        System.out.println("อายุ : " + sum);
    }
}