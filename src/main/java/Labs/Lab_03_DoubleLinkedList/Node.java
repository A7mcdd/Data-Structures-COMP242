package Labs.Lab_03_DoubleLinkedList;

public class Node <T> {
    T data;
    Node<T> prev,next;
    Node(){}
    Node(T data){ this.data = data;}
}
