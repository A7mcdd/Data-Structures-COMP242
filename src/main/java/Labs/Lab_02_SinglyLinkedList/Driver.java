package Labs.Lab_02_SinglyLinkedList;

public class Driver {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addFirst(0);
        list.addAtIndex(2, 99);
        list.traversList();      // 0 -> 1 -> 99 -> 2
        list.remove(2);
        list.removeLast();
        list.removeFirst();
        list.traversList();      // 1
        System.out.println(list.searchList(1) != null);   // true
        System.out.println(list.size());                  // 1
    }
}
