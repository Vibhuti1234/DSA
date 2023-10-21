package dsa_complete.stack;

public class StackTest {
public static void main(String[] args) {
	Stack stack=new Stack(5);
	stack.printStack();
	System.out.println();
	stack.push(6);
	stack.push(8);
	stack.push(10);
	stack.push(19);
	stack.printStack();
	stack.pop();
	System.out.println();
	stack.printStack();	
	stack.pop();
	stack.pop();
	System.out.println();
	stack.printStack();
}
}
