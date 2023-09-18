package dsa_complete.linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list =new LinkedList(4);
       // list.printList();
        list.getTail();
        list.getHead();
        list.getLength();
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(99);
       // list.printList();
        //list.removeLast();
       // list.printList();
        list.prepend(77);
        list.printList();
        System.out.println("\nfetching the element at index 2 : "+list.get(2).data);
        list.removeFirst();
        list.printList();
        list.set(4,8);
        System.out.println();
        list.insert(3,11);
        list.printList();
        list.insert(2, 12);
        System.out.println();
        list.printList();
        list.remove(4);
        System.out.println();
        list.printList();
        list.reverseLinkedList();
        System.out.println();
        list.printList();
	}
}
