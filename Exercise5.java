import java.util.Scanner;

public class Exercise5 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your weight (kg)");
        double weight = scan.nextDouble();
        System.out.println("Input your height (mc)");
        double height = scan.nextDouble();
        double h = (height/100);
        double bmi = weight /(h*h);
        System.out.println("Your bmi is: "+ bmi);
        String status = " ";
        if(bmi >= 30)
            status = "Very fat";
        else if (bmi >=25)status = "fat";
        else if (bmi >=23)status = "Overweight";
        else if (bmi >=18) status = "normal";
        else status = "Too skinny";
        System.out.print("Your are : " + status);
    }
}
