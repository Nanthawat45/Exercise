import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ใส่ค่า x : ");
        int x = input.nextInt();
        System.out.println("ใส่ค่า y : ");
        int y = input.nextInt();
        System.out.println("ใส่ค่า z : ");
        int z = input.nextInt();
        if(x>y){
            if(x>z){
            System.out.println(x + " is greater than " + y + "and" + z);
            }else{
                System.out.println(x + " is greater than " + y + "but" + x + "is less than" +z);
            }
        }
    }
}
