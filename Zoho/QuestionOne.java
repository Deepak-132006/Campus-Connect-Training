// Write a program to give the following output for the given input.
// Eg 1: Input: a1b10
//        Output: abbbbbbbbbb
// Eg: 2: Input: b3c6d15
//           Output: bbbccccccddddddddddddddd
// The number varies from 1 to 99.

package Zoho;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder result = new StringBuilder();
        int i = 0;
        while( i < str.length()){
            char ch = str.charAt(i);
            i++;

            StringBuilder num = new StringBuilder();
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                num.append(str.charAt(i));
                i++;
            }
            int count = Integer.parseInt(num.toString());

            for(int j = 0; j < count; j++){
                result.append(ch);
            }

        }
        System.out.println(result);
    }
}