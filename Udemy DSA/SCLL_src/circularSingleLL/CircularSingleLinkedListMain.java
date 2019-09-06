package circularSingleLL;

public class CircularSingleLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularSingleLinkedList CSLL_obj = new CircularSingleLinkedList();
		CSLL_obj.createCircularSingleLinkedList(5);
		CSLL_obj.traverseCircularSingleLinkedList();
		
		CSLL_obj.insertInLinkedList(10, 1);
		CSLL_obj.traverseCircularSingleLinkedList();

		CSLL_obj.insertInLinkedList(20, 2);
		CSLL_obj.traverseCircularSingleLinkedList();

		CSLL_obj.insertInLinkedList(30, 3);
		CSLL_obj.traverseCircularSingleLinkedList();

		CSLL_obj.insertInLinkedList(40, 4);
		CSLL_obj.traverseCircularSingleLinkedList();
		
		System.out.println("Linked List Now: ");
		CSLL_obj.traverseCircularSingleLinkedList();
		
		CSLL_obj.insertInLinkedList(35, 4);
		CSLL_obj.traverseCircularSingleLinkedList();
		
		CSLL_obj.insertInLinkedList(1, 0);
		CSLL_obj.traverseCircularSingleLinkedList();
		
		CSLL_obj.insertInLinkedList(100, 10);
		CSLL_obj.traverseCircularSingleLinkedList();
		
		CSLL_obj.printHeadUsingTail();
		
		System.out.println("Searching the Node having value 40: ");
		CSLL_obj.searchNode(40);
		
		System.out.println("Searching the Node having value 200: ");
		CSLL_obj.searchNode(200);
		
		System.out.println("\n\nDeleting the node having location = 2: ");
		System.out.println("Before Deletion...");
		CSLL_obj.traverseCircularSingleLinkedList();
		CSLL_obj.deletionOfNode(0);
		System.out.println("After Deletion...");
		CSLL_obj.traverseCircularSingleLinkedList();
		
		System.out.println("\n\nDeleting the node having location = 15: ");
		System.out.println("Before Deletion...");
		CSLL_obj.traverseCircularSingleLinkedList();
		CSLL_obj.deletionOfNode(15);
		System.out.println("After Deletion...");
		CSLL_obj.traverseCircularSingleLinkedList();
		
		System.out.println("\n\nDeleting the node having location = 15: ");
		System.out.println("Before Deletion...");
		CSLL_obj.traverseCircularSingleLinkedList();
		CSLL_obj.deletionOfNode(15);
		System.out.println("After Deletion...");
		CSLL_obj.traverseCircularSingleLinkedList();
		
		CSLL_obj.deleteLinkedList();
		CSLL_obj.traverseCircularSingleLinkedList();
		

		
		
		
		


	}

}
