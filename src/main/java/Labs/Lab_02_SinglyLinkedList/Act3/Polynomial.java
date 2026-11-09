/*
Q3: Imagine an effective dynamic structure for storing polynomials. Write operations for
addition, subtraction, and multiplication of polynomials.
*/

package Labs.Lab_02_SinglyLinkedList.Act3;

public class Polynomial {
    Term head,tail;

    public void addTerm(int coef,int exp){
        Term t = new Term(coef,exp);
        if (head==null){
            head = t;
            tail = t;
        }else{
            tail.next = t;
            tail = t;
        }
    }


    public static Polynomial add(Polynomial a, Polynomial b){
        Polynomial result = new Polynomial();
        Term p1 = a.head;
        Term p2 = b.head;
        while ((p1 != null) && (p2 !=null)){
            if (p1.exp > p2.exp){
                result.addTerm(p1.coef,p1.exp);
                p1 = p1.next;
            } else if (p1.exp < p2.exp) {
                result.addTerm(p2.coef,p2.exp);
                p2 = p2.next;
            } else {
                result.addTerm(p1.coef+ p2.coef, p1.exp);
                p1 = p1.next;
                p2 = p2.next;
            }
        }

        while (p1 !=null){
            result.addTerm(p1.coef,p1.exp);
            p1 = p1.next;
        }
        while (p2 !=null){
            result.addTerm(p2.coef,p2.exp);
            p2 = p2.next;
        }

        return result;
    }

    public static Polynomial subtract(Polynomial a, Polynomial b){
        Polynomial result = new Polynomial();
        Term p1 = a.head;
        Term p2 = b.head;
        while ((p1 != null) && (p2 !=null)){
            if (p1.exp > p2.exp){
                result.addTerm(p1.coef,p1.exp);
                p1 = p1.next;
            } else if (p1.exp < p2.exp) {
                result.addTerm(-p2.coef,p2.exp);
                p2 = p2.next;
            } else {
                result.addTerm(p1.coef- p2.coef, p1.exp);
                p1 = p1.next;
                p2 = p2.next;
            }
        }

        while (p1 !=null){
            result.addTerm(p1.coef,p1.exp);
            p1 = p1.next;
        }
        while (p2 !=null){
            result.addTerm(-p2.coef,p2.exp);
            p2 = p2.next;
        }

        return result;
    }


    public static Polynomial multiply(Polynomial a, Polynomial b){
        Polynomial result = new Polynomial();
        for (Term p1 = a.head; p1 != null ; p1 = p1.next){
            for (Term p2 = b.head; p2 != null; p2 = p2.next){
                result.addTerm(p1.coef*p2.coef, p1.exp + p2.exp);
            }
        }
        return result;
    }

    public void print(){
        for (Term t = head; t!=null; t=t.next) {
            System.out.print(t.coef+"x^"+t.exp);
            if (t.next!=null){
                System.out.print(" + ");
            }
        }
        System.out.println();
    }

}
