/*
 * Lab 03 - Q2: Words grouped by length.
 * Read a paragraph from a file and store the distinct words in doubly linked
 * lists, one list per word length, each sorted in ascending order (case
 * insensitive). Print the lists from the longest word length to the shortest.
 */

package Labs.Lab_03_DoubleLinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordsDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/main/java/Labs/Lab_03_DoubleLinkedList/input.txt"));
        LinkedList<WordList> lists = new LinkedList<>();
        int max=0;

        while (sc.hasNext()){
            String word = sc.next();

            Node<WordList> temp = lists.head;
            while (temp != null && temp.data.length != word.length()){
                temp = temp.next;
            }

            if (temp == null){
                lists.insertLast(new WordList(word.length()));
                temp = lists.tail;
            }

            temp.data.insertSorted(word);

            if (word.length()>max){
                max = word.length();
            }

        }
        sc.close();

        for (int len = max; len >= 1 ; len--) {
            Node<WordList> temp = lists.head;
            while (temp!=null && temp.data.length!=len){
                temp=temp.next;
            }
            if (temp != null) {
                System.out.print(len + ": ");
                temp.data.printList();
                System.out.println();
            }
        }
    }
}
