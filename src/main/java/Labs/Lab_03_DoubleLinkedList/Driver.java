package Labs.Lab_03_DoubleLinkedList;

public class Driver {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.insertAfter(5, 1); // empty list: nothing should happen
        list.printList();
        System.out.println();

        list.insertFirst(20);
        list.insertFirst(10);
        list.insertLast(40);
        list.printList(); // 10 -> 20 -> 40
        System.out.println();

        list.insertAfter(30, 20); // middle
        list.insertAfter(50, 40); // after tail
        list.insertLast(60); // checks tail was updated
        list.printList(); // 10 -> 20 -> 30 -> 40 -> 50 -> 60
        System.out.println();

        list.deleteFirst();
        list.deleteLast();
        list.printList(); // 20 -> 30 -> 40 -> 50
        System.out.println();

        list.delete(30); // middle
        list.printList(); // 20 -> 40 -> 50
        System.out.println();

        list.delete(20); // head
        list.delete(50); // tail
        list.printList(); // 40
        System.out.println();

        list.delete(99); // not found: nothing should happen
        list.delete(40); // only element
        list.printList(); // empty
        System.out.println();

        list.insertFirst(7); // list still works after being emptied
        list.printList(); // 7
        System.out.println();
    }
}