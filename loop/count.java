package loop;

import java.util.*;

public class count {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanobj = new Scanner(System.in);
        int n = scanobj.nextInt();
        int r ;
        while (n > 0) {
            r=n%10;
            n=n/10;
            count++;
        }

    }
}

// Count Digits in a Number

// Write a program to count the total number of digits in a number.

// Example:

// Input: 12345

// Output: 5