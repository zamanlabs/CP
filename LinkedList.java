public class LinkedList{
    public int data;
    public LinkedList next, head , prev;
    public LinkedList(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    @Override
    public void addLast(int data){
        Linkedlist temp = new Linkedlist(data);
        Linkedlist current = head;
        if(head == null){
            head = temp;
        } else {
            while(current.next != null){
                current = current.next;
            }
            current.next = temp;
            temp.prev = current;
        }
    }
    @Override
    public void removeLast() {
        LinkedList temp = null;
        LinkedList current = head;
        while(current.next.next == null){
            current = current.next;
        }
        current.next = temp;

    }

    @Override
    public void removeFirst(){
        head = head.next;
    }

    public void unoReverse(){
        LinkedList current = head;
        LinkedList prev = null;
        LinkedList next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    
    public void kthFromLast(int k){
        LinkedList current = head;
        int l = this.length();
        for(int i = 1; i < l - k + 1; i++){
            current = current.next;
        }
         for(int i = l-1; i>=k-1; i--){
            current = current.prev;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;   
    }
    
    public int length(){
        LinkedList current = head;
        int l = 0;
        while(current != null){
            l++;
            current = current.next;
        }
        return l;

    }

}
