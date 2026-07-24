package Day8;

import java.util.Scanner;

public class SpyNumber {
    public static int digitsSum(int n){
        int sum = 0;
        while( n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static int digitsProduct(int n ){
        int product = 1;
        while( n != 0){
            product *= n % 10;
            n /= 10;
        }
        return product;
    }
    public static void main(String[] args) {
        int n = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        n = sc.nextInt();

        if(digitsProduct(n) == digitsSum(n)){
            System.out.println("Entered number " + n + " is Spy number");
        } else {
            System.out.println("Not a Spy number");
        }
        sc.close();
    }
}
