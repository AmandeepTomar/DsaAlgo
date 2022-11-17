package linkedlist;

public class LinkedListPractice {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node head = n1;
        Node tail = n1;
        Node newHead = insertAtBeginning(head, 5);
        printAndTraverseNode(newHead);
       Node head1 = insertAtBeginning(newHead, 2);
       printAndTraverseNode(head1);

        Node head2=insertAtBeginning(head1, 1);
        printAndTraverseNode(head2);

    }

    private static Node insertAtBeginning(Node head, int data) {
        Node tempNode = new Node(data);
        tempNode.next = head;
        head = tempNode;
        System.out.println("After insert At beginning " + head.toString());
        return head;
    }

    private static Node insertAtTail(Node tail, int data) {
        Node temp = new Node(data);
        tail.next = new Node(data);
        tail = temp;
        System.out.println("After Inserting at end" + tail.toString());
        return tail;
    }

    private static void printAndTraverseNode(Node head) {
        if (head == null) {
            System.out.print("null");
            return;
        }
        System.out.print(head.data + "-->");
        printAndTraverseNode(head.next);
    }
}
