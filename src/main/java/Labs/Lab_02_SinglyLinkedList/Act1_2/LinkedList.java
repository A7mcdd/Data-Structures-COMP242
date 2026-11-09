/*
Question 1
Write a program to create a Linked List and different functionality related to the following
operations:
1. Traversing Linked List.
2. Searching in Linked List.
3. Insertion in Linked List.
4. Deletion from Linked List.
*/

package Labs.Lab_02_SinglyLinkedList.Act1_2;

public class LinkedList <T> {
    private Node<T> head,tail;
    private int count;

    public LinkedList(){}

    public void addFirst(T data) {
        Node<T> node = new Node<T>(data);
        if (count == 0){
            head = node;
            tail = node;
        }else {
            node.next = head;
            head = node;
        }
        count++;
    }

    public void addLast(T data) {
        Node<T> node = new Node<T>(data);
        if (count == 0){
            head = node;
            tail = node;
        }else {
            tail.next= node;
            tail = node;
        }
        count++;
    }


    public void addAtIndex(int index,T data){
        if (index<0){return;}
        if (index == 0) {addFirst(data);}
        else if (index >= count) {addLast(data);}
        else {
            Node<T> node = new Node<T>(data);
            Node<T> temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            count++;
        }

    }


    public void removeFirst(){
        if (count!=0){
            head = head.next;
            if (count==1){
                tail = null;
            }
            count--;
        }
    }


    public void removeLast(){
        if (count!=0){
            if (count>1){
                Node<T> temp = head;
                for (int i = 0; i < count-2; i++) {
                    temp = temp.next;
                }
                tail = temp;
                tail.next = null;
            }else {
                head = null;
                tail = null;
            }
            count--;
        }
    }

    public void remove (int index){
        if (index == 0){removeFirst();}
        else if (index == count-1) {removeLast();}
        else if (index>0 && index<count){
            Node<T> temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            count--;
        }
    }

    public void traversList(){
        Node<T> current = head;
        while (current!=null){
            System.out.print(current.data);
            if (current.next!=null){
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public Node<T> searchList(T data){
        Node<T> current = head;
        while (current!=null && !current.data.equals(data)){
            current = current.next;
        }
        return current;
    }

    public int size(){return count;}
    public boolean isEmpty(){return count==0;}

    /*
    Question 2
    Write a program which creates two ordered list, based on an integer key, and then merges
    them together.
    */

    public LinkedList<Integer> mergeList(LinkedList<Integer> l1, LinkedList<Integer> l2){
        LinkedList<Integer> result = new LinkedList<Integer>();
        Node<Integer> p1 = l1.head;
        Node<Integer> p2 = l2.head;
        while ((p1 != null) && (p2 != null)){
            if (p1.data > p2.data){
                result.addLast(p2.data);
                p2 = p2.next;
            }else {
                result.addLast(p1.data);
                p1 = p1.next;
            }
        }

        while (p1!=null){
            result.addLast(p1.data);
            p1 =  p1.next;
        }
        while (p2!=null) {
            result.addLast(p2.data);
            p2 = p2.next;
        }

        return result;
    }



    public Node<T> getHead() {return head;}
    public Node<T> getTail() {return tail;}
    public int getCount() {return count;}



    /*
     * Extra 1: Swap adjacent elements
     * Write a method that swaps every two adjacent nodes' elements in a linked list.
     * Example: 1 -> 2 -> 3 -> 4 -> 5  becomes  2 -> 1 -> 4 -> 3 -> 5
     */

    public void elementSwap(){
        Node<T> temp = head;

        while (temp !=null && temp.next != null){
            T dtemp = temp.data;
            temp.data= temp.next.data;
            temp.next.data = dtemp;
            temp = temp.next.next;
        }

    }

    /*
     * Extra 2: Disjoint ordered lists
     * Given two ordered linked lists of integers, write a recursive method
     * that returns true if they have no element in common, false otherwise.
     */


    public static boolean areDisjoint(Node<Integer> l1,Node<Integer> l2){

        if (l1 == null || l2 == null){
            return true;
        }
        if (l1.data.equals(l2.data)) {
            return false;
        }
        if (l1.data<l2.data){
            return areDisjoint(l1.next,l2);
        } else {
            return areDisjoint(l1,l2.next);
        }

    }
}
