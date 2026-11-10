/*
 * Lab 03 - Q1: Doubly Linked List.
 * Build a doubly linked list (each node has next and prev) that supports:
 * insert after a given object, delete a given object, insert at the front,
 * insert at the end, delete the first element, and display the elements.
 */

package Labs.Lab_03_DoubleLinkedList;

public class LinkedList <T> {
    Node<T> head,tail;
    int count;

    LinkedList(){}

    public void insertAfter(T data, T obj){
        if(count!=0) {
            Node<T> temp = head;
            while (!temp.data.equals(obj) && temp.next!=null) {
                temp = temp.next;
            }
            if (temp.data.equals(obj)) {
                Node<T> node = new Node<T>(data);

                node.prev = temp;
                node.next = temp.next;
                if (temp.next!=null) {
                    temp.next.prev = node;
                }else{
                    tail = node;
                }
                temp.next = node;
                count++;
            }
        }
    }

    public void delete(T obj){
        Node<T> temp = head;
        while (temp!=null && !temp.data.equals(obj)){
            temp = temp.next;
        }
        if (temp == null){return;} // list empty or the obj not found
        if (temp.next!=null) {
            temp.next.prev = temp.prev;
        }else{
            tail = temp.prev;
        }
        if (temp.prev!=null){
            temp.prev.next = temp.next;
        }else{
            head = temp.next;
        }
        count--;
    }



    public void insertFirst(T data){
        Node<T> node = new Node<>(data);
        if (count != 0){
            node.next = head;
            head.prev = node;
            head = node;
        }else{
            head = node;
            tail = node;
        }
        count++;
    }

    public void insertLast(T data){
        Node<T> node = new Node<>(data);
        if (count != 0){
            tail.next = node;
            node.prev = tail;
            tail = node;
        }else{
            head = node;
            tail = node;
        }
        count++;
    }

    public void deleteFirst(){
        if (count != 0){
            if (head.next!=null){
                head = head.next;
                head.prev = null;
            }else {
                head = null;
                tail = null;
            }
            count--;
        }
    }

    public void deleteLast(){
        if (count != 0){
            if (head.next!=null){
                tail = tail.prev;
                tail.next=null;
            }else {
                head = null;
                tail = null;
            }
            count--;
        }
    }

    public void printList(){
        Node<T> temp = head;
        while (temp!=null){
            System.out.print(temp.data);
            if (temp.next!=null){
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
    }



}
