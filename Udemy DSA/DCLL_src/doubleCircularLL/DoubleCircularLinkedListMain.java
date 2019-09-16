package doubleCircularLL;

public class DoubleCircularLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleCircularLinkedList DCLL_obj = new DoubleCircularLinkedList();
		
		DCLL_obj.createDoubleCircularLinkedList(5);
		DCLL_obj.traverseDoubleCircularLinkedList();
		
		DCLL_obj.insertInDoubleCircularLinkedList(10,1);
		DCLL_obj.traverseDoubleCircularLinkedList();
		
		DCLL_obj.insertInDoubleCircularLinkedList(20,2);
		DCLL_obj.traverseDoubleCircularLinkedList();

		DCLL_obj.insertInDoubleCircularLinkedList(30,3);
		DCLL_obj.traverseDoubleCircularLinkedList();

		DCLL_obj.insertInDoubleCircularLinkedList(40,4);
		DCLL_obj.traverseDoubleCircularLinkedList();

		System.out.println("List Now: ");
		DCLL_obj.traverseDoubleCircularLinkedList();
		
		DCLL_obj.traverseCircularLinkedListInReverseOrder();
		DCLL_obj.printHeadUsingTail();
		
		System.out.println("\nSearching the node having value 40: ");
		DCLL_obj.searchNode(40);
		
		System.out.println("\nSearching the node having value 400: ");
		DCLL_obj.searchNode(400);
		
		System.out.println("\n\nDeleting the node having location = 0: ");
		System.out.println("Before Deletion...");
		DCLL_obj.traverseDoubleCircularLinkedList();
		DCLL_obj.deletionOfNode(0);
		System.out.println("After Deletion...");
		DCLL_obj.traverseDoubleCircularLinkedList();
		
		System.out.println("\n\nDeleting the node having location = 3: ");
		System.out.println("Before Deletion...");
		DCLL_obj.traverseDoubleCircularLinkedList();
		DCLL_obj.deletionOfNode(3);
		System.out.println("After Deletion...");
		DCLL_obj.traverseDoubleCircularLinkedList();
		
		System.out.println("\n\nDeleting the node having location = 20: ");
		System.out.println("Before Deletion...");
		DCLL_obj.traverseDoubleCircularLinkedList();
		DCLL_obj.deletionOfNode(20);
		System.out.println("After Deletion...");
		DCLL_obj.traverseDoubleCircularLinkedList();
		
		DCLL_obj.deleteDoubleCircularLinkedList();
		DCLL_obj.traverseDoubleCircularLinkedList();
	}
}
