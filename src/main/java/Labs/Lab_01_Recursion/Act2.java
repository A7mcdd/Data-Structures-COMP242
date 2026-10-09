/*
Use a recursive function to write a program that performs the following tasks.
1. Find The Factorial Number for an input n.
2. Check If a Given Array Values Are Palindrome or not.
*/

package Labs.Lab_01_Recursion;

import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Enter a number to Find The Factorial Number for an input n.");
        int n = sc.nextInt();
        System.out.println("The Factorial for "+n+" is "+Factorial(n));

        int[] array = {1,2,3,4,3,2,1};
        if (isPalindrome(array,0,array.length-1)) {
            System.out.println("Array is Palindrome");
        }else {
            System.out.println("Array is not Palindrome");
        }
    }



    public static int Factorial(int n) {
        if (n<=1) {return 1;}
        return n * Factorial(n-1);
    }

    public static Boolean isPalindrome(int[] array,int first,int last){
        if (first >= last)
            return true;
        if (array[first] != array[last])
            return false;
        return isPalindrome(array,first+1,last-1);
    }

}
