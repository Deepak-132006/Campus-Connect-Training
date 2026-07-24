package Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class BetrothedNumber {

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
        int a = 0, b = 0, sum = 0, divisorSum = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first value: ");
        a = sc.nextInt();

        System.out.print("Enter the second value: ");
        b = sc.nextInt();

        ArrayList<Integer> divisors = remainder(a);
        ArrayList<Integer> remainderDivisors = remainder(b);

        for (int num : divisors) {
            sum += num;
        }

        for (int num : remainderDivisors) {
            divisorSum += num;
        }

        if (a + 1 == divisorSum && b + 1 == sum) {
            System.out.println("Entered number " + a + " and "+ b + " is Betrothed Number");
        } else {
            System.out.println("Not an Betrothed number");
        }
    }
}
