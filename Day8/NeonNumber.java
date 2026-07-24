package Day8;

import java.util.Scanner;

public class NeonNumber {
    public static int square(int n ){
        return n * n;
    }

    public static int sumDigits(int n ){
        int sum = 0;
        while( n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 0, square = 0, sumOfDigits = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();

        square = square(n);
        
        sumOfDigits = sumDigits(square);

        if(n == sumOfDigits){
            System.out.println("Entered number " + n + " is Neon number");
        } else {
            System.out.println("Not an neon number");
        }
        sc.close();
    }
}
