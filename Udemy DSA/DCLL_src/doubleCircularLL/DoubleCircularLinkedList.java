package doubleCircularLL;

//import doubleLL.Node;

public class DoubleCircularLinkedList {

	private Node head;
	private Node tail;
	private int size;
	
	//getters
		public Node getHead() {
			return head;
			}
		
		public Node getTail() {
			return tail;
			}
		
		public int getSize() {
			return size;
		    }
		//setters
		public void setHead(Node head) {
			this.head = head;
			}
		
		public void setTail(Node tail) {
			this.tail = tail;
			}
		
		public void setSize(int size) {
			this.size = size;
			}
		
		//DCLL exists or not
		boolean existsDoubleCircularLinkedList()
		{
			return (head!=null);
		}
		
		//create DCLL
		public Node createDoubleCircularLinkedList(int nodeValue)
		{
			Node node_obj = new Node();
			node_obj.setValue(nodeValue);
			head = node_obj;
			tail = node_obj;
			node_obj.setPrev(null);
			node_obj.setNext(node_obj);
			size = 1;
			return head;
		}
		//traversing DCLL
		public void traverseDoubleCircularLinkedList()
		{
			if(!existsDoubleCircularLinkedList())
			{
				System.out.println("DCLL does not Exists!!!");
				return;
			}
			else
			{
				Node tempNode = head;
				for(int i = 0; i < getSize() ; i++)
				{
					System.out.print(tempNode.getValue());
					if(i != getSize()-1)
						System.out.print(" <--> ");
					tempNode = tempNode.getNext();
				}
				System.out.println();
			}
		}
		
		//Insert a node in a DLL
		void insertInDoubleCircularLinkedList(int nodeValue , int location )
		{
			if(!existsDoubleCircularLinkedList())
			{
				System.out.println("DCLL does not Exists!!!");
				return;
			}
			else
			{
				Node tempNode = head;
				Node node_obj = new Node();
				node_obj.setValue(nodeValue);
				if(location == 0)					//insert at 1st node
				{
					node_obj.setPrev(null);
					node_obj.setNext(head);
					head.setPrev(node_obj);
					head = node_obj;
					
				}
				else if(location >= getSize()-1)		//insert at last node
				{
					node_obj.setNext(head);
					node_obj.setPrev(tail);
					head.setPrev(node_obj);
					tail.setNext(node_obj);
					tail = node_obj;
				}
				else								//insert at a specified node
				{
					//Node tempNode = head;
					int index = 0;
					while(index < location-1){  // loop till we reach specified node
						tempNode = tempNode.getNext();
						index++;
					}
					node_obj.setPrev(tempNode);
					node_obj.setNext(tempNode.getNext());
					tempNode.getNext().setPrev(node_obj);
					tempNode.setNext(node_obj);
				}
				size++;
			}
		}
		
		// Searching a specified value in linked list
		boolean searchNode(int nodeValue){
			if (existsDoubleCircularLinkedList()) {
				Node tempNode = head;
				traverseDoubleCircularLinkedList();
				for (int i = 0; i < size; i++) {
					if (tempNode.getValue() == nodeValue) {
						System.out.print("Found the node at location: " + i);
						return true;
					}
					tempNode = tempNode.getNext();
				}
			}
			System.out.print("Node not found!! ");
			return false;
		}
		
		// Traverse Linked List in reverse order
		void traverseCircularLinkedListInReverseOrder(){
			if(existsDoubleCircularLinkedList()){
				Node tempNode = tail;
				System.out.println("\nPrinting the DCLL in reverse order...");
				for(int i =0 ; i < size ; i++){
					System.out.print(tempNode.getValue());
					if(i != size-1)
						System.out.print(" <--> ");
					tempNode = tempNode.getPrev();
				}
				System.out.println();
			}
			else{
				System.out.println("DCLL DNE!!!");
			}
		}
		
		// Traverse Linked List
		void printHeadUsingTail(){
			if(existsDoubleCircularLinkedList()){
				System.out.println("\n\nPrinting Tail...");
				System.out.println(tail.getValue());

				System.out.println("\nPrinting Head using Head reference...");
				System.out.println(head.getValue());

				System.out.println("\nPrinting Head using Tail reference...");
				System.out.println(tail.getNext().getValue());
			}
			else{
				System.out.println("DCLL DNE!!!");
			}
		}
		
		// Deletes a node having a given value
				public void deletionOfNode(int location) {
					if (!existsDoubleCircularLinkedList()) {
						System.out.println("The linked list does not exist!!");// Linked List does not exists
						return;
					} else if (location == 0) { // we want to delete first element
						if (getSize() == 1) { // if this is the only node in this list
							head.setNext(null);
							head.setPrev(null);
							head = tail = null;
							setSize(getSize() - 1);
							return;
						}else {
							head = head.getNext();
							head.setPrev(null);
							tail.setNext(head);
							setSize(getSize() - 1);
						}
					} else if (location >= getSize()) { // If location is not in range or equal, then delete last node
						if (getSize() == 1) { // if this is the only element in the list
							head.setNext(null);
							head.setPrev(null);
							tail = head = null;
							setSize(getSize() - 1);
							return;
						}
						tail = tail.getPrev();
						tail.setNext(head);
						head.setPrev(tail);
						setSize(getSize() - 1);
					} else { // if any inside node is to be deleted
						Node tempNode = head;
						for (int i = 0; i < location - 1; i++) {
							tempNode = tempNode.getNext(); // we need to traverse till we find the location
						}
						tempNode.setNext(tempNode.getNext().getNext()); // delete the required node
						tempNode.getNext().setPrev(tempNode);
						setSize(getSize() - 1);
					} // end of else

				}// end of method
				
				//Deletion of linked list
				void deleteDoubleCircularLinkedList() {
					System.out.println("\n\nDeleting entire Linked List...");
					if (tail == null) {
						System.out.println("Linked List is already deleted, nothing to delete anymore !");
						return;
					}else {
						head.setPrev(null);
						tail.setNext(null);
						head = null;
						tail = null;
						System.out.println("Linked List deleted successfully !");
					}
				}//end of method
}
		
	

