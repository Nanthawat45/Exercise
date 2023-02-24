import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ค่ารัศมีของวงกลม :");
        float r = input.nextInt();
        double area = r * r * 3.14;
        System.out.println("พื้นที่รูปวงกลม : " + area);
    }
}
