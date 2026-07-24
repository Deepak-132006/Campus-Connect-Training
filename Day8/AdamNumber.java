package Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class AdamNumber {
    public static void main(String[] args) {
        int n = 0;
        System.out.print("Enter the N value: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <= n; i++) {

            int square = i * i;
            // 144
            int reversedSquare = reverse(square);
            // 441

            int reversedNum = reverse(i);
            // 21
            int reversedNumSquare = reversedNum * reversedNum;
            // 441

            if (reversedSquare == reversedNumSquare) {
                result.add(i);
            }
        }
        System.out.println(result);

    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
