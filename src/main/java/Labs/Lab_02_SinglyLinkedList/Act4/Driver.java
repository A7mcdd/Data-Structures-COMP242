package Labs.Lab_02_SinglyLinkedList.Act4;

public class Driver {
    public static void main(String[] args) {
        ListADT l = new ListADT();
        l.insertFirst("B");
        l.insertFirst("A");
        l.print();                              // A -> B
        l.insertAfter("A", "X");
        l.print();                              // A -> X -> B
        System.out.println(l.deleteAfter("A")); // X
        System.out.println(l.deleteFirst());    // A
        l.print();                              // B
        System.out.println(l.Size());           // 1
    }
}
