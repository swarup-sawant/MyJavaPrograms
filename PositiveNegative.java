import java.util.*;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(num + " is a Positive number.. ");
        } else if (num < 0 ){
            System.out.println(num + " is a Negative number...");
        } else {
            System.out.println("It is a Zero...");
        }

        sc.close();
    }    
}
