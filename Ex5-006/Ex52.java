import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ใส่ค่า n : ");
        int n = input.nextInt();
        int i = 1 ;
        for(i = 1; i <= 100; i++){
            if(i % n == 0){
            System.out.println(i + " หารด้วย " + n + " ลงตัว ");
            }
            
        }
        System.out.println("End");
    }
}
