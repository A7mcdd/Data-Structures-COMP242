/*
Q3: Anagrams
 * Print all permutations of a word using recursion.
 * Idea: fix first letter, anagram the rightmost n-1, rotate, repeat n times.
*/

package Labs.Lab_01_Recursion;

public class Act3 {

    public static void main(String[] args) {
        String word = "cat";
        anagram(new StringBuilder(word),word.length());
    }

    public static void anagram(StringBuilder word, int size){
        if (size == 1){return;}

        for (int i = 0; i < size; i++) {
            anagram(word,size-1);
            if (size == 2){
                System.out.println(word);
            }
            rotate(word,size);
        }
    }

    public static void rotate (StringBuilder word, int size){
        int start = word.length() - size;
        char first = word.charAt(start);
        word.deleteCharAt(start);
        word.append(first);
    }

}
