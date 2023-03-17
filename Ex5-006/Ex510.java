import java.util.Scanner;

public class Ex510 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ความกว้างรูป 1 : ");
        double width1 = scan.nextDouble();
        System.out.println("ความยาวรูป 1 ");
        double long1 = scan.nextDouble();
        System.out.println("ความกว้างรูป 2 : ");
        double width2 = scan.nextDouble();
        System.out.println("ความยาวรูป 2: ");
        double long2 = scan.nextDouble();

        double area1 = width1 * long1;
        double area2 = width2 * long2;
        if (area1 > area2) {
            System.out.println("พื้นที่สี่เหลียม 1 > พื้นที่สี่เหลียม 2");
            System.out.println("พื้นที่สี่เหลียม 1 : " + area1);
            System.out.println("พื้นที่สี่เหลียม 2 : " + area2);
        } else if (area1 == area2) {
            System.out.println("พื้นที่สี่เหลียม 1 > พื้นที่สี่เหลียม 2");
            System.out.println("พื้นที่สี่เหลียม 1 : " + area1);
            System.out.println("พื้นที่สี่เหลียม 2 : " + area2);
        } else {
            System.out.println("พื้นที่สี่เหลียม 2 > พื้นที่สี่เหลียม 1");
            System.out.println("พื้นที่สี่เหลียม 1 : " + area1);
            System.out.println("พื้นที่สี่เหลียม 2 : " + area2);
        }
    }
}