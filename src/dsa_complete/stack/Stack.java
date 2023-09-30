package dsa_complete.stack;

public class Stack {
Node top;
int length;
public Stack(int value) {
	Node node =new Node(value);
	top =node;
   length=1;
}
public void printStack() {
	Node temp=top;
	while (temp!=null) {
		System.out.print(" "+temp.value);
		temp=temp.next;
		
	}
}
public Node getTop() {
	return top;
}
public int getLength() {
	return length;
}
public void push(int value) {
	Node newNode=new Node(value);
	if(length==0) {
		top=newNode;
	}
	else {
		newNode.next=top;
		top=newNode;
	}
	length++;
	
}
public Node pop() {
	if(length==0) {
		return null;
	}
	else {
		Node temp=top;
		top=top.next;
		temp.next=null;
		length--;
		return top;
	}
	
}

}
