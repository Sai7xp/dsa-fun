package DataStructures.LinkedLists;

/* 
 * https://takeuforward.org/plus/dsa/linked-list/fundamentals-doubly-ll/introduction-to-doubly-ll
 * 
 * Solve all the question from above link - includes almost all operations on doubly linked list
 */
class DLL {
    private Node head;

    DLL() {
        this.head = null;
    }

    private class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

    }

    public void insertAtFirst(int val) {
        if (this.head == null) {
            Node newNode = new Node(val);
            head = newNode;
            return;
        }

        Node newNode = new Node(val);
        newNode.next = this.head;
        this.head.prev = newNode;
        this.head = newNode;
    }

    public void insertAtLast(int val) {
        if (this.head == null) {
            Node newNode = new Node(val);
            head = newNode;
            return;
        }

        // go till the last node and then attach the new node
        Node last = this.head;
        while (last.next != null) {
            last = last.next;
        }

        Node newNode = new Node(val, last, null);
        last.next = newNode;
    }

    /*
     * Inserts a new node at given index
     */
    public void insertAtIndex(int index, int val) {
        if (index > getSize() || index < 0) {
            System.out.println("🔴 Invalid Index");
            return;
        }

        if (index == 0) {
            insertAtFirst(val);
            return;
        }

        // traverse till index-1 node
        Node prev = this.head;
        while (index > 1) {
            prev = prev.next;
            index--;
        }

        Node newNode = new Node(val, prev, prev.next);
        if (prev.next != null) {
            prev.next.prev = newNode;
        }
        prev.next = newNode;
    }

    public int getSize() {
        int size = 0;
        Node temp = this.head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    /*
     * Inserts new node(val) after the x element
     */
    public void insertAfter(int x, int val) {
        if (this.head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.value == x) {
                Node newNode = new Node(val, temp, temp.next);
                if (temp.next != null) {
                    temp.next.prev = newNode;
                }
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
        System.out.println(x + " is not present in the list");
    }

    public void display() {
        if (this.head == null) {
            System.out.println("DLL is empty");
            return;
        }
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END/NULL");
        System.out.println();
    }

    /*
     * 🌻 We can traverse back in reverse
     */
    public void displayReverse() {
        if (this.head == null) {
            System.out.println("DLL is empty");
            return;
        }
        System.out.println("Printing List in Reverse Order - DLL");
        // first reach the last node
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        // now temp is at the last node
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }
        System.out.println("START/NULL");
        System.out.println();
    }

    public void deleteFirst() {
        if (this.head == null) {
            System.out.println("Linked list is already empty");
            return;
        }
        this.head = this.head.next;
        if (this.head != null) { // what if there's only one element
            this.head.prev = null;
        }
    }

    public void deleteElement(int val) {
        if (this.head == null) {
            System.out.println("Linked list is already empty");
            return;
        }
        if (this.head.value == val) {
            deleteFirst();
            return;
        }

        Node temp = this.head;
        while (temp != null) {
            if (temp.value == val) {
                temp.prev.next = temp.next;
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("ℹ️ Element not found in the Linked List");
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.display();

        dll.insertAtLast(999);

        dll.insertAtFirst(40);
        dll.insertAtFirst(30);
        dll.insertAtFirst(20);
        dll.insertAtFirst(10);

        dll.display();
        dll.displayReverse();

        dll.insertAtFirst(0);
        dll.display();

        dll.insertAtLast(1000);
        dll.display();
        dll.displayReverse();

        System.out.println("------------ insert after specific element -------------");
        dll.insertAtLast(7676);
        dll.insertAfter(7676, 7677);

        dll.display();
        dll.displayReverse();

        System.out.println("------------ insert at index -------------");
        dll.insertAtIndex(1, 555);
        dll.display();
        dll.displayReverse();

        System.out.println("------------ Delete First Operation -------------");
        dll.deleteFirst();
        dll.display();
        dll.displayReverse();

        System.out.println("------------ Delete Element Operation -------------");
        dll.deleteElement(555);
        dll.deleteElement(7677);
        dll.deleteElement(40);
        dll.display();
        dll.displayReverse();
    }
}
