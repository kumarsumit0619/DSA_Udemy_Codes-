package doubleLL;

public class DoubleLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				DoubleLinkedList DLL_obj = new DoubleLinkedList();
				
				DLL_obj.createDoubleLinkedList(5);
				DLL_obj.traverseDoubleLinkedList();
				
				DLL_obj.insertInDoubleLikedList(10, 1);
				DLL_obj.traverseDoubleLinkedList();

				DLL_obj.insertInDoubleLikedList(20, 2);
				DLL_obj.traverseDoubleLinkedList();

				DLL_obj.insertInDoubleLikedList(30, 3);
				DLL_obj.traverseDoubleLinkedList();

				DLL_obj.insertInDoubleLikedList(40, 4);
				DLL_obj.traverseDoubleLinkedList();
				
				System.out.println("\nSearching the node having value 40: ");
				DLL_obj.searchNode(40);
				
				System.out.println("\nSearching the node having value 400: ");
				DLL_obj.searchNode(400);
				
				System.out.println("\n\nDouble Linked List in order: ");
				DLL_obj.traverseDoubleLinkedList();
				System.out.println("\n\nDouble Linked List in reverse order: ");
				DLL_obj.traverseDoubleLinkedListInReverseOrder();
				
				System.out.println("\n\n Deleting the node at location = 2: ");
				System.out.println("List Before Deletion: ");
				DLL_obj.traverseDoubleLinkedList();
				DLL_obj.deletionOfNode(2);
				System.out.println("List after Deletion: ");
				DLL_obj.traverseDoubleLinkedList();
				
				System.out.println("\n\n Deleting the node at location = 1: ");
				System.out.println("List Before Deletion: ");
				DLL_obj.traverseDoubleLinkedList();
				DLL_obj.deletionOfNode(1);
				System.out.println("List after Deletion: ");
				DLL_obj.traverseDoubleLinkedList();
				
				DLL_obj.deleteLinkedList();
				DLL_obj.traverseDoubleLinkedList();			
	}
}
