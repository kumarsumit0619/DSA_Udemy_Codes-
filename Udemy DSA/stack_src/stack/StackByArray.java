package stack;

public class StackByArray {
	
	int[] arr;
	int topOfStack;  //keeps track of the cell which is last occupied in Array, this will help in insertion/deletion
	
	//Create an empty stack using array
	public StackByArray(int size) {
		this.arr = new int[size];
		this.topOfStack = -1;
		System.out.println("Successfully created an empty stack of size: "+size);
		System.out.println();
	}

	//push function, push an element in a stack
	public void push(int value) {
		if(isFullStack())
			System.out.println("Stack Overflow error");
		else 
		{
			arr[topOfStack + 1] = value;
			topOfStack++;
			System.out.println("Successfully inserted value " + value + " in the stack");
		}
	}//end of method
	
	//peek Operation
	public void peekOperation() {
		if(!isEmptyStack())
			System.out.println("Top of Stack: " +arr[topOfStack]);
		else {
			System.out.println("The Stack is Empty!!!");
		}
		System.out.println("\n");
	}
	
	//pop an element out
	public void pop() {
		if(isEmptyStack())
			System.out.println("Stack underflow Error!!!");
		else
		{
			System.out.println("Poping/deleting value from Stack: "+ arr[topOfStack]);
			topOfStack--;
		}
	}
	
	public void deleteStack() {
		arr = null;System.out.println("Stack is successfully Deleted");
	}
	
	//isEmptyStack function
	public boolean isEmptyStack() {
		if(topOfStack == -1)
			return true;
		else
			return false;
	}
	
	//isFullStack function
	public boolean isFullStack() {
		if(topOfStack == arr.length-1) {
			//System.out.println("Stack is Full !!!");
			return true;
		}
		else
			return false;
	}
}
