package Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class AbundantNumber {

    public static ArrayList<Integer> remainder(int num) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        int n = 0, sum = 0;
        
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        ArrayList<Integer> divisors = remainder(n);

        for (int num : divisors){
            sum += num;
        }
        if(sum > n){
            System.out.println("Entered number " + n + " is Abundant number");
        } else {
            System.out.println("Not an Abundant number");
        }
        sc.close();
    }
    
}
