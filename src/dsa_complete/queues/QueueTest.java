package dsa_complete.queues;

public class QueueTest {

	public static void main(String[] args) {
    Queue queue=new Queue(6);
    queue.enque(10);
    queue.enque(12);
    queue.enque(13);
    queue.enque(14);
    queue.enque(15);
    queue.enque(16);
    System.out.println(queue.getLength());
    System.out.println(queue.getFirst().value);
    System.out.println(queue.getLast().value);
    queue.printQueue();
    queue.deque();
    System.out.println();
    queue.printQueue();
    System.out.println("\n"+queue.getLast().value);
    queue.deque();
    queue.printQueue();
    System.out.println("\n"+queue.getLast().value);
	}
}
