package SingleLL;

public class SingleLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleLinkedList SLL_obj=new SingleLinkedList();
		SLL_obj.createSingleLinkedList(5);
		SLL_obj.traverseLinkedList();
		
		SLL_obj.insertInLinkedList(10 , 1);
		SLL_obj.traverseLinkedList();
		
		SLL_obj.insertInLinkedList(20 , 2);
		SLL_obj.traverseLinkedList();
		
		SLL_obj.insertInLinkedList(30 , 2);
		SLL_obj.traverseLinkedList();
		
		SLL_obj.insertInLinkedList(40 , 1);
		SLL_obj.traverseLinkedList();
		
		System.out.println("Searching the node having value 40...");
		SLL_obj.searchNode(40);
		
		System.out.println("Searching the node having value 500..");
		SLL_obj.searchNode(500);
		
		System.out.println("\nDeleting the node having location = 0: ");
		System.out.println("Before Deletion:");
		SLL_obj.traverseLinkedList();
		System.out.println("After Deletion:");
		SLL_obj.deletionOfNode(0);
		SLL_obj.traverseLinkedList();
		System.out.println();
		
		System.out.println("\n\nDeleting the node having location = 2: ");
		System.out.println("Before Deletion:");
		SLL_obj.traverseLinkedList();
		SLL_obj.deletionOfNode(2);
		System.out.println("After Deletion:");
		SLL_obj.traverseLinkedList();
		System.out.println();
		
	
		System.out.println("\n\nDeleting the node having location = 100: ");
		System.out.println("Before Deletion:");
		SLL_obj.traverseLinkedList();
		SLL_obj.deletionOfNode(100);
		System.out.println("After Deletion:");
		SLL_obj.traverseLinkedList();
		System.out.println();
		
		SLL_obj.deleteLinkedList();
		SLL_obj.traverseLinkedList();

	}

}
