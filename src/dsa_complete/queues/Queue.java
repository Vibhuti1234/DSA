package dsa_complete.queues;

import dsa_complete.stack.Node;

public class Queue {
Node first;
Node last;
int length;
public Queue(int value) {
	Node node=new Node(value);
	first=node;
	last=node;
	length++;
}
public void printQueue() {
		Node temp=first;
		while (temp!=null) {
			System.out.print(" "+temp.value);
			temp=temp.next;
			
	}
		

}
public Node getFirst() {
	return first;
}
public Node getLast() {
	return last;
}
public int getLength() {
	return length;
}
public void enque(int value) {
Node node =new Node(value);
if(length==0) {
	first=node;
	last=node;
}
else {
	Node temp=first;
	first=node;
	node.next=temp;
}
length++;

}
public Node deque() {
if(length==0) {
	return null;
}
else {
	Node temp=first;
	while (temp.next!=last) {
		temp=temp.next;
	}
	last=temp;
	temp.next=null;
	length--;
	return first;
}
}
}
