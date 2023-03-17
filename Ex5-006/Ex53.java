import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("r = ");
        float r = input.nextFloat();
        System.out.println("h = ");
        float h = input.nextFloat();
        double re = (3.14 * r * r * h);
        System.out.println("ทรงกระบอก : " + re);
    }
}