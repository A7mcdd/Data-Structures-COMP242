/*
Question 1
Write a program to create a Linked List and different functionality related to the following
operations:
1. Traversing Linked List.
2. Searching in Linked List.
3. Insertion in Linked List.
4. Deletion from Linked List.
*/

package Labs.Lab_02_SinglyLinkedList;

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
}
