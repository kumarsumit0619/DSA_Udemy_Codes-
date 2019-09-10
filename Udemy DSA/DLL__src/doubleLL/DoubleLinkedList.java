package doubleLL;

public class DoubleLinkedList {

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
	
	//checking DLL
	public boolean existsDoubleLinkedList() {
		return (head!=null);
	}
	
	//create DLL
	public Node createDoubleLinkedList(int nodeValue) {
		
		Node node_obj = new Node();
		node_obj.setValue(nodeValue);
		head = node_obj;
		tail = node_obj;
		node_obj.setPrev(null);
		node_obj.setNext(null);
		size = 1;
		return head;
		
	}
	
	//traverse DLL
	public void traverseDoubleLinkedList() {
		if(existsDoubleLinkedList())
		{
			//Node node_obj = new Node():
			Node tempNode = head;
			for(int i=0 ; i < getSize() ; i++)
			{
				System.out.print(tempNode.getValue());
				if(i != getSize()-1)
					System.out.print(" <--> ");
				tempNode = tempNode.getNext();
			}
			System.out.println("\n");
		}
		else
		{
			System.out.println("\nDouble Linked List Does not Exist!!!");
		}
	}
	
	//traverse DLL in reverse order
	public void traverseDoubleLinkedListInReverseOrder(){
		if(!existsDoubleLinkedList())
		{
			System.out.println("DLL Does Not Exists!!! ");
			return;
		}
		else
		{
			Node tempNode = tail;
			for(int i = 0 ; i < getSize(); i++)
			{
				System.out.print(tempNode.getValue());
				if(i != getSize()-1)
					System.out.print(" <--> ");
				tempNode = tempNode.getPrev();
			}
			System.out.println("\n");
		}
	}
	
	//Insert a node in a DLL
	public void insertInDoubleLikedList(int nodeValue , int location) {
		Node node_obj = new Node();
		node_obj.setValue(nodeValue);
		Node tempNode = head;
		if(!existsDoubleLinkedList()) {
			System.out.println("\nDouble Linked List Does not Exist!!!");
			return;
		}
		else if(location == 0)   			//insert at 1st node
			{
				node_obj.setPrev(null);
				node_obj.setNext(head);
				head.setPrev(node_obj);
				head = node_obj;
			}
		else if(location >=size)		//insert at last node			
			{
				node_obj.setPrev(tail);
				node_obj.setNext(null);
				tail.setNext(node_obj);
				tail = node_obj;
			}
		else							//insert at a specified node
			{
				for(int i = 0 ; i <= location-2 ; i++)
				{
					tempNode = tempNode.getNext();
				}
				node_obj.setPrev(tempNode);
				node_obj.setNext(tempNode.getNext());
				tempNode.setNext(node_obj);
				node_obj.getNext().setPrev(node_obj);
			}
		size++ ;	
	 }
	
	//Searching a node with a given node value
	boolean searchNode(int nodeValue){
		if(existsDoubleLinkedList())
		{
			Node tempNode = head;
			for(int i = 0 ; i < getSize() ; i++)
			{
				if(tempNode.getValue() == nodeValue)
				{
					System.out.println("Found the element at location = "+i);
					return true;
				}
				tempNode = tempNode.getNext();
			}
		}
		System.out.println("Node Not Found!!!");
		return false;
	}
	
	//Deletion of node at a given location
	public void deletionOfNode(int location)
	{
		if(existsDoubleLinkedList())
		{
			if(location == 0)
			{
				if(getSize() == 1)
				{
					head = tail = null;
				}
				else
				{
					head = head.getNext();
					head.setPrev(null);
				}
			}
			else if(location >= getSize())
			{
				Node tempNode = tail.getPrev();
				if(tempNode == head)
				{
					head = tail = null;
				}
				tempNode.setNext(null);
				tail = tempNode;
			}
			else
			{
				Node tempNode = head;
				for(int i = 0 ; i < location-1 ; i++)
				{
					tempNode = tempNode.getNext();
				}
				tempNode.setNext(tempNode.getNext().getNext());
				tempNode.getNext().setPrev(tempNode);
			}
			setSize(getSize()-1);
		}
		else
		{
			System.out.println("\nLinkedList DNE!!!");
		}
	}// end of method
	
	//delete whole linked list
		void deleteLinkedList() {
			System.out.println("\n\nDeleting Linked List...");
			Node tempNode = head;
			for (int i = 0 ; i < size; i++)
			{
				tempNode.setPrev(null);
				tempNode = tempNode.getNext();
			}
			
			head = null;
			tail = null;
			System.out.println("Linked List deleted successfully!!!");
		 }
	
	
	
}//DoubleLL class Ends
