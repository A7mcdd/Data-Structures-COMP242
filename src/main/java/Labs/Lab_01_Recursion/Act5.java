/*
Question 5
Write a recursive Java method that counts the number of occurrences of the character 'a' in a
string. Hint: a method signature that works is public static int countA (String s).
You can test your method in Eclipse. Consider using the charAt or startsWith methods
in String.
1. Prove that your method is correct.
2. Prove that your method terminates.
*/

//1. no 'a' returns 0, otherwise cont the first 'a' (+1) and recuse on the rest.
//2. each call works on a shorter string, so it must reach the base case (no 'a').

package Labs.Lab_01_Recursion;

public class Act5 {

    public static void main(String[] args) {
        String str = "ahmad";
        System.out.println(countA(str));
    }
    public static int countA(String s){
        int indexA = s.indexOf("a");

        //base case
        if (indexA==-1){return 0;}

        return countA(s.substring(indexA+1)) + 1;
    }

}
