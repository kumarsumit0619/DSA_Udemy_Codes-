package queue;

public class QueueByArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating an Empty Queue...");
		QueueByArray queue_obj = new QueueByArray(5);
		
		System.out.println("Enqueuing 6 values in the queue...");
		for(int i = 1 ; i <= 6 ; i++) {
			queue_obj.enQueue(i * 10 );
		}
		
		System.out.println("Peek value from queue...");
		queue_obj.peekOperation();
		
		System.out.println("\nDequeue 6 values from Queue...\n");
		for(int i = 0 ; i<=5 ; i++) {
			queue_obj.deQueue();
		}
		
		System.out.println("\nDeleting the entire Queue...");
		queue_obj.deleteQueue();	
	}
}
