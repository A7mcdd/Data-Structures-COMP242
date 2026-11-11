package Labs.Lab_03_DoubleLinkedList;

public class Node <T>{
    public T data;
    public Node<T> prev,next;
    Node(){}
    Node(T data){ this.data = data;}
}
