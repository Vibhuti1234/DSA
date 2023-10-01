package dsa_complete.doublylinkedlist;
public class DoublyLinkedListTest {
public static void main(String[] args) {
	DoublyLinkedList list=new DoublyLinkedList(5);
	System.out.println(list.getTail().value);
	System.out.println(list.getHead().value);
	list.printList();
	list.append(10);
	list.append(14);
	list.append(18);
	list.append(19);
	list.append(20);
	list.append(23);
	System.out.println();
	list.printList();
	System.out.println();
	System.out.println(list.getTail().value);
	System.out.println(list.getHead().value);
	list.removeLast();
	list.printList();
	list.prepend(8);
	System.out.println();
	list.printList();
	System.out.println();
	System.out.println(list.getTail().value);
	System.out.println(list.getHead().value);
	list.removeFirst();
	list.printList();
	System.out.println("\n"+list.getLength());
	System.out.println(list.get(4).value);
	boolean isInserted=list.insert(2, 23);
	if(isInserted) {
		list.printList();
	}
	boolean isSetted=list.set(2, 24);
	System.out.println();
	if(isSetted) {
		list.printList();
	}
	list.remove(5);
	System.out.println();
	list.printList();


}
}
