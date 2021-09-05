public class LinkedList {

    Node head; // head of list

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public LinkedList insert(int data) {
        Node new_node = new Node(data);
        new_node.next = null;

        if (this.head == null) {
            this.head = new_node;
        } else {
            Node last = this.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }

        return this;
    }

    public LinkedList remove() {

        if (head.next == null) {
            head = null;
        } else {
            Node beforeLast = this.head;
            while (beforeLast.next.next != null) {
                beforeLast = beforeLast.next;
            }
            beforeLast.next = null;
        }

        return this;
    }

    public void push(int data) {

        Node nodeToPush =  new Node(data);
        if (head == null) {
            head = nodeToPush;
        } else {
            nodeToPush.next = head;
            head = nodeToPush;
        }
    }

    public int pop() {
        Node popedNode = head;
        head = head.next;

        return popedNode.data;
    }

    public int peek() {
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
