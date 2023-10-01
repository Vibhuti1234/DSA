package dsa_complete.doublylinkedlist;

public class DoublyLinkedList {
	Node head;
	Node tail;
	int length;

	public DoublyLinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;

		}
	}

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public int getLength() {
		return length;
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			tail = newNode;
			head = newNode;

		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		length++;
	}

	public Node removeLast() {
		if (length == 0) {
			return null;
		}
		Node temp = tail;
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			tail = tail.prev;
			tail.next = null;
			temp.prev = null;
		}
		length--;
		return temp;
	}

	public void prepend(int value) {
		Node newNode=new Node(value);
		if (length==0) {
			tail=newNode;
			head=newNode;
		}
		else {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		length++;
	}

	public Node removeFirst() {
     if (length==0) {
    	 return null;
		
	}
		Node temp=head;

     if (length==1) {
    	 head=null;
    	 tail=null;
		
	}
     else {
		head=head.next;
		head.prev=null;
		temp.next=null;

}
     length--;
     return temp;
}

	public Node get(int index) {
		if(index<0 || index >=length||length==0) return null;
		if (length==1) {
			return head;
		}
		else {
			Node temp=head;
			int i=0;
			while (index>i) {
				temp=temp.next;	
				i++;
			}
			return temp;
		}
		
			
		}
	public boolean insert(int index,int value) {
		if (index==0) {
			prepend(value);
			return true;
			
		}
		if (index==length) {
			append(value);
			return true;
		}
		Node temp=get(index);
		if(temp==null) {
			return false;
		}
		Node newNode=new Node(value);
		newNode.next=temp;
		newNode.prev=temp.prev;
		temp.prev.next=newNode;
		temp.prev=newNode;
		temp=null;
		length++;
		return true;
		}
	public boolean set(int index,int value) {
		Node temp=get(index);
		if(temp==null) {
			return false;
		}
		temp.value=value;
		return true;
		}

	public Node remove(int index) {
		if (index==0) {
			return removeFirst();
			
		}
		if (index==length-1) {
			return removeLast();
			
		}
		Node temp=get(index);
		if (temp==null) {
			return null;
		}
		else {
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
			temp=null;
			length--;
			return temp;
		}
		
	}
	}
