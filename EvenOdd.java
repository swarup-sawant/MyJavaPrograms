import java.util.*;

class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is a Even number..");
        } else {
            System.out.println(num + " it is Odd number..");
        }

        sc.close();
    }
}