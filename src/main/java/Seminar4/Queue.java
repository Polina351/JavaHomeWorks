package Seminar4;


public class Queue {
    public Node head;
    public Queue() { head = null;}

    public class Node {
        public int data;
        public Node next;

        public Node (int data) {
            this.data = data;
            next = null;
        }
    }

    public void enqueue (int data) {
        Node newNode = new Node(data);
        Node currentNode = head;

        if (head == null) {
            head = newNode;
        }else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
    public int dequeue() {
        if (head != null) {
            int result = head.data;
            head = head.next;
            return result;
        }else {
            throw new ArrayIndexOutOfBoundsException("Пустая очередь");
        }
    }
    public int first () {
        return head.data;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(7);
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(9);
        queue.enqueue(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println();
        System.out.println(queue.first());

    }
}
