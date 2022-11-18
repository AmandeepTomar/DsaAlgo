# LinkedList in java

### What is linked list?

- it is type of linear data structure of nodes. node contains data address of next node.
- N1->N2->N3
- N1 = (data , address of N2).

### Why linked list required ?

- Dynamic data structure, We can expand and minimize at runtime.
- No memory wastage.
- In case of insertion / deletion no shift required.

### Types of LinkedList

- Singly Linked-List (N1->N2->NULL)
- Doubly Linked-List (N1<->N2<->NULL)
- Circular Linked-List (N1<->N2<->N3->)
- Circular Doubly Linked-List

### What is Node?
- Node has two foelds 
  - Data 
  - Address of Next node.
- Implementation 
```java
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next= null;
    }
}

```
### Insertion At Singly Linked-List.
- At beginning 
- At Middle 
- At End.

Now We have a Singly Linked, So we have start point is HEAD and last point is TAIL. 
HEAD is starting point 
TAIL that is pointing null is called last node.

#### Insert At beginning that is HEAD.
- We need to insert at the beginning of the node.
- STEPS 
  1.create newNode = New Node(data);
  2. tempNode = headNode;
  3. headNode = newNode;
  1. 

```java

class Implementation{
    
    void insertAtHead(Node head, int data){
        Node temp=new Node(data);
        temp.next = head;
        head = temp;
    }
}
```