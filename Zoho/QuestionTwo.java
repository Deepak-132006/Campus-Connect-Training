// Write a program to sort the elements in odd positions in descending order and elements in ascending order
// Eg 1: Input: 13,2 4,15,12,10,5
//         Output: 13,2,12,10,5,15,4
// Eg 2: Input: 1,2,3,4,5,6,7,8,9
//         Output: 9,2,7,4,5,6,3,8,1

package Zoho;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        System.out.print("\nEnter the numbers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            if( i % 2 == 0){
                odd.add(numbers[i]);
            } else {
                even.add(numbers[i]);
            }
        }

        odd.sort(Collections.reverseOrder());
        Collections.sort(even);

        int oddIndex = 0;
        int evenIndex = 0;

        for(int i = 0; i < size; i++){
            if(i % 2 == 0){
                numbers[i] = odd.get(oddIndex++);
            } else {
                numbers[i] = even.get(evenIndex++);
            }
        }

        System.out.println("Output:");
        for(int num : numbers){
            System.out.print(num + " ");
        }
    }
}
