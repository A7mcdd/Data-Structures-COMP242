package Labs.Lab_03_DoubleLinkedList;

public class WordList extends LinkedList<String>{
    int length;

    WordList(int length){
        this.length = length;
    }

    public void insertSorted(String data) {
        Node<String> temp = head;
        while ((temp != null) && (temp.data.compareTo(data) < 0) ){
            temp = temp.next;
        }
        if (temp == null){
            insertLast(data);
            return;
        }
        if (temp.data.compareToIgnoreCase(data)==0){ //if data is repeated
            return;
        }
        Node<String> node = new Node<>(data);

        if (temp.prev!=null){
            temp.prev.next = node;
            node.prev=temp.prev;
        }else{
            head = node;
        }
        temp.prev=node;
        node.next=temp;
        count++;

    }

}
