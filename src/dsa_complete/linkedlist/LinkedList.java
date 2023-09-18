package dsa_complete.linkedlist;

public class LinkedList {
	private Node head;
    private Node tail;
   private  int length;

    public void getHead() {
        System.out.println("Head is "+head);
    }

    public void getTail() {
        System.out.println("Tail is "+tail);
    }

    public void getLength() {
        System.out.println("Length is "+length);
    }

    public LinkedList(int data) {
        Node newNode=new Node(data);
        head=newNode;
        tail=newNode;
        length=1;
    }

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
    }


    public void append(int data) {
        Node newNode=new Node(data);
        if (length==0){
            head =newNode;
            length++;
        }
        else{
            tail.next=newNode;
            length++;
        }
        tail=newNode;
    }

    public Node removeLast() {
    	  if (head == null)
              return null;
    
          if (head.next == null) {
              return null;
          }
    
          // Find the second last node
          Node second_last = head;
          while (second_last.next.next != null)
              second_last = second_last.next;
    
          // Change next of second last
          second_last.next = null;
            length--;
          return head;
               }

	public void prepend(int data) {
       Node newNode=new Node(data);
      newNode.next=head;
      head=newNode;
      length++;
       
	}

	public Node get(int index) {
    		if(index<0||index>=length) {
    			return null;
    		}Node temp=head;
    		for (int i = 0; i < index; i++) {
				temp=temp.next;
			}
    		return temp;
	}

	public Node removeFirst() {
		if(length==0) {
			return null;
		}
		Node temp=head;
		head=head.next;
		temp.next=null;
		length--;
		if(length==0) {
			tail=null;
		}
		return head;
		
	}

	public boolean set(int index, int data) {
		Node temp=get(index);
		if (temp!=null) {
			temp.data=data;
			return true;
		}
		return false;
	}

	public boolean insert(int index, int data) {
		if(index==0) {
			prepend(data);
			return true;
		}
		if(index==length) {
			append(data);
			return true;
		}
		Node newNode=new Node(data);
		Node temp=get(index-1);
		newNode.next=temp.next;
		temp.next=newNode;
		length++;
		return true;
		
	}

	public Node remove(int index) {
		if (index<0||index>=length) {
			return null;
		}
		if(index==0) {
			return removeFirst();
		}
		if (index==(length-1)) {
			return removeLast();
		}
		Node temp=get(index);
		Node prev=get(index-1);
		prev.next=temp.next;
		temp.next=null;
		length--;
		return temp;
		
	}
	public void reverseLinkedList() {
		Node temp=head;
		head=tail;
		tail=head;
		Node after=temp.next;
		Node before=null;
		for (int i = 0; i < length; i++) {
			after=temp.next;
			temp.next=before;
			before=temp;
			temp=after;
		}
	}



}
