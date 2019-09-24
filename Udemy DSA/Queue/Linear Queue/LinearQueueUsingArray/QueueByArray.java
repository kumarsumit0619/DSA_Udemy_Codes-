package queue;

public class QueueByArray {
	int[] arr;
	int topOfQueue, beginningOfQueue;

	//constructor or creating queue
	public QueueByArray(int size) {
		this.arr = new int[size];
		this.topOfQueue = -1;
		this.beginningOfQueue = -1;
		System.out.println("Successfully created an empty queue of size:  " +size);
	}
	
	//enQueue function
	public void enQueue(int value) {
		if(isQueueFull()) {
			System.out.println("Queue overflow error!!!");
		}
		else if(isQueueEmpty()) {
			beginningOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted "+value+" in the Empty queue");
		}
		else {	//if the queue already has some elements in it then no need to initialize beginning index
			topOfQueue++;
			arr[topOfQueue] = value;
			System.out.println("Successfully inserted "+value+" in the queue");
		}
		printQueue();
	}//end of method
	
	//print Queue method
	public void printQueue() {
		if(!isQueueEmpty()) {
			System.out.println("Queue Now...");
			for(int i = beginningOfQueue ; i <= topOfQueue ; i++) {
				System.out.println(arr[i]+"  ");
			}
			System.out.println();
		}
		else {
			System.out.println("Queue is Empty!!!");
		}
	}//end of method
	
	//isQueueEmpty function
	public boolean isQueueEmpty() {
		if(beginningOfQueue == -1  || beginningOfQueue == arr.length)
			return true;
		else 
			return false;
	}
	
	//isQueueFull function
	public boolean isQueueFull() {
		if(topOfQueue == arr.length-1)
			return true;
		else
			return false;
	}
	
	//peek operation function
	public void peekOperation() {
		if(isQueueEmpty()) {
			System.out.println("The Queue is Empty!!!");
		}
		else {
			System.out.println(arr[beginningOfQueue]);
		}
	}
	
	//dequeue function
	public void deQueue() {
		if(isQueueEmpty()) 
			System.out.println("The Queue is Empty, No element to Dequeue!!!");
			else {
				System.out.println("Dequeuing position "+(beginningOfQueue+1)+ " element from Queue: "+arr[beginningOfQueue]);
				beginningOfQueue++;
			}
		}
	
	//delete entire Queue function
	public void deleteQueue() {
		arr = null;
		System.out.println("Queue is successfully Deleted!!!");
	}
}

