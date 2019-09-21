package stack;

public class StackByArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating a stack of size 5...");
		StackByArray stack_obj = new StackByArray(5);
		
		System.out.println("Pushing 6 values in the Stack...\n");
		for(int i=0 ; i<=5 ; i++) {
			stack_obj.push(i*10);
		}
		
		System.out.println("\nPeeking value from stack:");
		stack_obj.peekOperation();
		
		System.out.println("Poping 6 values from the Stack...");
		for(int i = 0 ; i <= 5 ; i++) {
			stack_obj.pop();
		}
		
		//Deleting the entire stack
		System.out.println("\nDeleting the entire stack...");
		stack_obj.deleteStack();
		System.out.println("Is Stack Empty: "+stack_obj.isEmptyStack());
	}

}
