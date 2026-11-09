package Labs.Lab_02_SinglyLinkedList.Act3;

public class Driver {
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial();
        p1.addTerm(3, 2);
        p1.addTerm(5, 1);
        p1.addTerm(2, 0);

        Polynomial p2 = new Polynomial();
        p2.addTerm(4, 1);
        p2.addTerm(1, 0);

        System.out.print("P1 = ");
        p1.print();

        System.out.print("P2 = ");
        p2.print();

        System.out.print("P1 + P2 = ");
        Polynomial.add(p1, p2).print();

        System.out.print("P1 - P2 = ");
        Polynomial.subtract(p1, p2).print();

        System.out.print("P1 * P2 = ");
        Polynomial.multiply(p1, p2).print();
    }
}
