/*
Write a Recursive Function to print number from Given input down to 0.
*/


package Labs.Lab_01_Recursion;

import java.util.Scanner;

public class Act1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        PrintDown(num);
        sc.close();
    }

    public static void PrintDown (int n) {
        if (n == 0)
            System.out.println(n);
        else {
            System.out.println(n);
            PrintDown(n-1);
        }
    }
}
