package Labs.Lab_02_SinglyLinkedList.Act1_2;

public class Driver {
    public static void main(String[] args) {
        // Q1
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addFirst(0);
        list.addAtIndex(2, 99);
        list.traversList(); // 0 -> 1 -> 99 -> 2
        list.remove(2);
        list.removeLast();
        list.removeFirst();
        list.traversList(); // 1
        System.out.println(list.searchList(1) != null); // true
        System.out.println(list.size()); // 1

        // Q2: merge
        LinkedList<Integer> a = new LinkedList<>();
        a.addLast(1); a.addLast(3); a.addLast(5);
        LinkedList<Integer> b = new LinkedList<>();
        b.addLast(2); b.addLast(4); b.addLast(6); b.addLast(8);
        a.mergeList(a, b).traversList(); // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 8

        // Extra 1: elementSwap
        LinkedList<Integer> s = new LinkedList<>();
        for (int i = 1; i <= 5; i++) s.addLast(i);
        s.elementSwap();
        s.traversList(); // 2 -> 1 -> 4 -> 3 -> 5

        // Extra 2: areDisjoint
        LinkedList<Integer> x = new LinkedList<>();
        x.addLast(1); x.addLast(3); x.addLast(5);
        LinkedList<Integer> y = new LinkedList<>();
        y.addLast(2); y.addLast(4); y.addLast(6);
        LinkedList<Integer> z = new LinkedList<>();
        z.addLast(2); z.addLast(3); z.addLast(6);
        System.out.println(LinkedList.areDisjoint(x.getHead(), y.getHead())); // true
        System.out.println(LinkedList.areDisjoint(x.getHead(), z.getHead())); // false
        System.out.println(LinkedList.areDisjoint(x.getHead(), null)); // true
    }
}