import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        String answers ="";
        for(int i = 1 ; i <= 100 ; i = i + 1){
            if(i % 3 == 0){
            if ( answers=="") {
                answers = answers+i;
            }
            else{
                 answers = answers + ","+ i;
            }
        }
        System.out.println(answers);
    }
}
}
