/*
Question 4
Write a recursive function to reverse a string. Write a recursive function to reverse the words
in a string, i.e., "cat is running" becomes "running is cat".
*/

package Labs.Lab_01_Recursion;

public class Act4 {

    public static void main(String[] args) {
        String word = "cat";
        System.out.println(reverse(word));

        String str = "cat is  running";
        System.out.println(reverseWord(str));
    }


    public static String reverse(String word){
        if (word.isEmpty()){
            return word;
        }

        return reverse(word.substring(1)) + word.charAt(0);
    }


    public static String reverseWord(String str){
        str = str.trim().replaceAll("\\s"," ");
        int space = str.indexOf(" ");

        //base case
        if (space == -1){return str;}

        return  reverseWord(str.substring(space+1)) +" "+ str.substring(0,space) ;
    }



}
