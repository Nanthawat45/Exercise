import java.util.Scanner;
public class Ex6{
    //Method
    /**
     * Check number type and print out
     * @param num
     */
    //1
    public void printType1(int num){
        if(num == 0){
            System.out.println(num + " is zero");
        }else if(num < 0){
            System.out.println(num + " is negative");
        }else{
            System.out.println(num + " is positive");
        }
    }

    //2
    public void printType2(int num) {
        if (num == 0) {
            System.out.println(num + "num is zero");
        }else if (num % 2 == 0) {
            System.out.println(num + "num is even");
        }else {
            System.out.println(num + "num is odd");
        }
    }

    //3
    public void CheckVowel(char c){
        if(c == 'a' || c == 'e' || c == 'A'){
            System.out.println("This character is a vowel.");
        }else{
            System.out.println("This character is not a vowel.");
        }
}

    //4
    public void CheckChar(char c){
        if (c >= 65 && c <= 90){
            System.out.println("This character is Uppercase");
        }else if (c >= 97 && c <= 122) {
            System.out.println("This character is Lowercase");
        }else{
            System.out.println("This character is Not a letter");
        }
}

    //5
    public void isPositive(int num, Scanner input){
        while(num <=0){
            System.out.println("Please, enter a positive number: ");
            num = input.nextInt();
        }
        System.out.println("Possitive");
    }

    //6
    public void isOdd(int num, Scanner input) {

        do {
            System.out.print("Please enter Odd Number : ");
            num = input.nextInt();
        } while (num % 2 == 0);
        System.out.println(num + " is Odd Number");
    }

    //7
    public void isDivideBy(int num, Scanner input) {
        System.out.print("ใส่ค่า N : ");
        int n = input.nextInt();
        System.out.print("ใส่ค่า X : ");
        int x = input.nextInt();
        String sum = "";
        for (int i = 1; i <= n; i++) {
            if (i % x == 0) {
                if (sum == "") {
                    sum = sum + i;
                } else {
                    sum = sum + "," + i;
                }
            }
        }
        System.out.println(sum);
    }

public static void main(String[] args){
    Ex6 ex = new Ex6();
    Scanner input = new Scanner(System.in);
    //System.out.println("Please enter a Number :");
    int num = input.nextInt();
        // ex.printType1(num);          // 1
        // ex.printType2(num);          // 2
        // ex.CheckVowel(0);            // 3
        // ex.CheckChar(0);             // 4 
        // ex.isPositive(num, input);   // 5
        // ex.isOdd(0,input);           // 6
        //ex.isDivideBy(num, input);    // 7
}


}