/*
Q4: Implement the List ADT using arrays.
Elements are stored in an Object[]. Operations: createList(n), insertFirst(obj),
insertAfter(obj, p), deleteFirst(), deleteAfter(p), isEmpty(), size().
*/

package Labs.Lab_02_SinglyLinkedList.Act4;

public class ListADT {
    Object[] data;
    int count;

    public ListADT(){
        data = new Object[10];
    }

    public  ListADT(int n){
        data = new Object[Math.max(n,10)];
        count=n;
    }

    public void grow(){
        if (count==data.length){
            Object[] bigger = new Object[data.length*2];
            for (int i = 0; i < count; i++) {
                bigger[i] = data[i];
            }
            data = bigger;
        }
    }

    public void insertFirst(Object obj){
        grow();
        for (int i = count; i > 0; i--) {
            data[i] = data[i-1];
        }
        data[0] = obj;
        count++;
    }

    public void insertAfter(Object bef, Object obj){
        int pos = indexOf(bef);
        if (pos==-1){return;}

        grow();
        for (int i = count; i > pos+1; i--) {
            data[i] = data[i-1];
        }
        data[pos+1]=obj;
        count++;
    }

    public int indexOf(Object obj){
        for (int i = 0; i < count; i++) {
            if (obj.equals(data[i])){
                return i;
            }
        }
        return -1;
    }

    public Object deleteFirst() {
        if (isEmpty()){return null;}

        Object first = data[0];
        for (int i = 0; i < count-1; i++) {
            data[i] = data[i+1];
        }
        data[count-1] = null;
        count--;
        return first;
    }

    public Object deleteAfter(Object bef){
        int pos = indexOf(bef);
        if (pos == -1 || pos == count -1){
            return null;
        }

        Object ret = data[pos+1];
        for (int i = pos; i < count; i++) {
            data[i]=data[i+1];
        }
        data[count-1]=null;
        count--;

        return ret;
    }

    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.print(data[i]);
            if (i<count-1){
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public boolean isEmpty(){return count==0;}

    public int Size(){return count;}




}
