package DataStructures.LinkedLists;

import java.util.*;

// Each Node of a Singly LinkedList
// class Node {
// int val;
// Node next;
// }

class LL {
    private Node head; // Head of the Linked List
    private int size; // this should be private otherwise data integrity will not be there, it should
                      // be decreased or increased only on modifying the linked list

    LL() {
        this.size = 0;
        this.head = null;
    }

    private class Node {
        int value;
        Node next;

        Node(int val) {
            this.value = val;
            this.next = null;
        }

        Node(int val, Node nextNode) {
            this.value = val;
            this.next = nextNode;
        }
    }

    /*
     * Inserts the data at the beginning of the List
     */
    public void insertAtFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = this.head;
        this.head = newNode;

        this.size += 1;
    }

    /*
     * Inserts data at the end
     */
    public void insertAtEnd(int val) {
        /*
         * Note: If we maintain separate variable which holds the pointer to tail of the
         * linked list, insert At End Operation becomes very easy, otherwise we have to
         * traverse the whole LL till the end and insert new node at the end.
         * 1. If tail is NULL then new Node becomes both head and tail
         * 2. If tail is NOT NULL then simply do,
         * this.tail.next = newNode;
         * this.tail = newNode; // new node becomes the tail
         */
        Node newNode = new Node(val);

        if (this.head == null) {
            this.head = newNode;
            this.size++;
            return;
        }
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        this.size++;
    }

    /*
     * Inserts new node at a given index,
     */
    public void insertAt(int index, int val) {
        if (index > this.size || index < 0) {
            System.out.println("Index out of bounds. Index: " + index + " Size: " + this.size);
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            insertAtFirst(val);
            return;
        }

        // if (index == this.size) {
        // insertAtEnd(val);
        // return;
        // }

        Node leftNode = this.head;
        while (index > 1) {
            leftNode = leftNode.next;
            index--;
        }
        Node newNode = new Node(val, leftNode.next);
        leftNode.next = newNode;
        this.size++;
    }

    /*
     * Display the elements of a Linked List
     */
    public void display() {
        if (this.head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        var temp = this.head;
        // System.out.println("Values from start to end: ");
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL/END");
    }

    public void displayRecur() {
        displayRecurHelper(this.head);
    }

    private void displayRecurHelper(Node head) {
        if (head == null) {
            System.out.println("ENDDDD");
            return;
        }
        System.out.print(head.value + " -> ");
        displayRecurHelper(head.next);
    }

    public void reverseList() {
        System.out.println("REVERSING THE LIST USING RECURSION");
        this.head = reverseListHelper(this.head, null);
    }

    private Node reverseListHelper(Node head, Node prevNode) {
        if (head == null) {
            return prevNode;
        }
        Node next = head.next;
        head.next = prevNode;

        // next becomes the head for remaining list
        // and curr head will be the prevNode in next recursive call
        return reverseListHelper(next, head);
    }

    private Node reverseListHelper2(Node head, Node prevNode) {
        if (head == null) {
            return prevNode;
        }
        Node next = head.next;
        head.next = prevNode;
        prevNode = head;
        head = next;

        /*
         * since we are not doing anything to head and prevNode after this recursive
         * call we have assigned new values to them(modified the values),
         * otherwise if we want the same state even after coming back from recursive
         * call.
         * 
         * To understand this print natural numbers from 5 to 1 using recursion
         * and observe diff between
         * n = n - 1, printN(n), sout(n)
         * printN(n - 1), sout(n)
         * 
         * we need to do this - return reverseListHelper(next, head);
         */
        return reverseListHelper(head, prevNode);
    }

    /*
     * Returns the size of the LL
     */
    public int size() {
        return this.size;
    }

    /*
     * Deletes first element from the list
     */
    public int deleteFirst() {
        if (this.head == null) {
            System.out.println("LL is empty. No elements to delte");
            throw new NoSuchElementException();
        }
        int deletedValue = this.head.value;
        this.head = this.head.next;
        this.size--;
        return deletedValue;
    }

    /*
     * Deletes the last element
     */
    public int deleteLast() {
        if (this.head == null) {
            System.out.println("LL is empty. No elements to delete");
            throw new NoSuchElementException();
        }

        if (this.size == 1) { // if head.next == null then the size is 1
            return deleteFirst();
        }

        /*
         * assume that we don't have size variable
         * in that case we need to run while(temp.next.next != null){}
         */

        // Node temp = this.head;
        // go till second last node,
        // for (int i = 0; i < this.size - 2; i++) {
        // temp = temp.next;
        // }
        Node temp = getNode(this.size - 2);
        int deletedValue = temp.next.value;
        temp.next = null;
        this.size--;

        return deletedValue;
    }

    public int deleteAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            return deleteFirst();
        }

        // TIP: If the index is last we can use deleteLast(); directly

        // 1 -> 2 -> 3 -> 4 ; delete node at index 2;
        // first reach till index 1 and then change it's next

        Node prevNode = getNode(index - 1); // previous node of delete node
        // for (int i = 0; i < index - 1; i++) {
        // temp = temp.next;
        // }
        // above for loop also works
        int deletedNodeVal = prevNode.next.value;
        prevNode.next = prevNode.next.next;
        this.size--;
        return deletedNodeVal;
    }

    /*
     * Deletes given element if exists (first occurrence)
     */
    public void delete(int value) {
        if (this.head == null) {
            System.out.println("Can't perform delete. Linked list is empty");
            return;
        }
        if (this.head.value == value) {
            this.size--;
            this.head = this.head.next;
            return;
        }

        Node prev = null;
        Node curr = this.head;
        while (curr != null) {
            if (curr.value == value) {
                prev.next = curr.next;
                this.size--;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        System.out.println(value + " does not exists");
    }

    private Node getNode(int index) {
        Node node = this.head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    /* 
     * 
     */
    public boolean contains(int key) {
        Node temp = this.head;
        while (temp != null) {
            if (temp.value == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    /*
     * Advanced methods (interview purpose)
     */

    // Insert using recursion
    public void insertAtIndexRecur(int index, int val) {
        if (index > this.size || index < 0) {
            System.out.println("Index out of bounds. Index: " + index + " Size: " + this.size);
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            insertAtFirst(val);
            return;
        }
        Node temp = head;
        insertRecurHelper(temp, index, val);
    }

    private void insertRecurHelper(Node temp, int index, int val) {
        if (index == 1) {
            // now the temp points to the node at (index-1)
            Node newNode = new Node(val, temp.next);
            temp.next = newNode;
            this.size++;
            return;
        }
        index--;
        temp = temp.next;
        insertRecurHelper(temp, index, val);
    }

}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // list.clear();

        list.add(3);
        list.add(1, 23);
        list.add(4);
        list.size();

        list.removeLast();

        list.get(0);

        list.contains(3);
        list.indexOf(1);

        // our Custom Linked List
        System.out.println("My Custom Singly Linked List");
        LL myList = new LL();
        myList.display();

        // myList.insertAtFirst(12);
        // myList.insertAtFirst(13);
        // myList.insertAtFirst(14);
        // myList.insertAtFirst(19);
        // myList.insertAtFirst(1);

        // myList.insertAtEnd(99);
        // myList.insertAtEnd(100);
        // myList.insertAtFirst(0);
        myList.insertAtEnd(1);
        myList.insertAtEnd(3);
        myList.insertAtEnd(5);
        myList.insertAtEnd(7);
        myList.display();
        myList.displayRecur();

        myList.reverseList();
        myList.display();
        myList.displayRecur();

        // at specific index
        // myList.insertAt(2, 4);

        // myList.display();

        // myList.insertAt(5, 90);
        // myList.insertAt(0, -1);
        // myList.display();

        // System.out.println("Contains 1 ? " + myList.contains(1));
        // System.out.println("Contains 776 ? " + myList.contains(776));

        // System.out.println(myList.deleteFirst());
        // System.out.println(myList.deleteFirst());

        // myList.display();

        // System.out.println("Removed : " + myList.deleteLast());
        // System.out.println("Removed: " + myList.deleteLast());

        // myList.insertAtEnd(776);

        // myList.display();

        // System.out.println("Removed: " + myList.deleteAt(0));
        // System.out.println("Removed: " + myList.deleteAt(1));
        // myList.display();
        // System.out.println("Contains 776 ? " + myList.contains(776));

        // System.out.println("Removed: " + myList.deleteAt(myList.size() - 1));
        // myList.display();

        // myList.insertAtEnd(89);
        // myList.insertAtFirst(98);
        // myList.display();

        // myList.delete(89);
        // myList.deleteAt(myList.size() - 1);
        // myList.display();

        // myList.delete(98);
        // myList.display();
        // myList.delete(98);

        // myList.insertAt(0, 200);
        // myList.insertAt(1, 201);
        // myList.insertAt(2, 202);
        // myList.display();

        // myList.insertAt(2, 786);
        // myList.display();

        // myList.insertAtIndexRecur(3, 7676);
        // myList.display();
    }
}