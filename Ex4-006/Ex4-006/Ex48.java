import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        do {
            sum = sum + n;
            n = n + 1;
        } while (n <= 10);
        System.out.println("แสดงผลรวม " + sum);
    }
}
