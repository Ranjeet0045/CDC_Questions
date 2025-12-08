package Linked_list;

public class Design_linked_list {
        class MyLinkedList {

        public class Node{
            int val;
            Node next;

            public Node(int val) {
                this.val = val;
                this.next = null;
            }

            public Node(int val,Node next){
                this.val = val;
                this.next = next;
            }
        }

        private Node head;
        private Node tail;
        private int size;

        public MyLinkedList() {
            head = null;
            tail = null;
            size = 0;
        }
        
        public int get(int index) {
            Node temp = head;
            int count = 0;
            
            if (index < 0 || index >= size) return -1;

            while(count != index){
                temp = temp.next;
                count++;
            }
            return temp.val;
        }
        
        public void addAtHead(int val) {
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
            size++;
        }
        
        public void addAtTail(int val) {
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        
        public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        Node newNode = new Node(val);
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }
        
        public void deleteAtIndex(int index) {
            
            if (index < 0 || index >= size) return;

            if (index == 0) {
                head = head.next;
                if (head == null) tail = null;
                size--;
                return;
            }
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }

            prev.next = prev.next.next;
            if (index == size - 1) {
            tail = prev;
            }
            size--;
        }
    }

    public static void main(String[] args) {

        Design_linked_list outer = new Design_linked_list();
        MyLinkedList list = outer.new MyLinkedList();

        list.addAtTail(4);
        list.addAtTail(5);
        list.addAtTail(1);
        list.addAtTail(9);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        list.deleteAtIndex(1);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}
