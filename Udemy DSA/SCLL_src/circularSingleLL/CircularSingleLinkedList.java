package circularSingleLL;

public class CircularSingleLinkedList {
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
		this.head=head;
	}
	
	public void setTail(Node tail) {
		this.tail=tail;
	}
	
	public void setSize(int size) {
		this.size=size;
	}
	
	//finding CSLL exists or not
	public boolean existsCircularSingleLinkedList() {
			return (head!=null);
	}
	
	//create CSLL
	public Node createCircularSingleLinkedList(int nodeValue) {
		
		//head=new Node();
		
		Node node_obj=new Node();
		node_obj.setValue(nodeValue);
		node_obj.setNext(node_obj);
		head=node_obj;
		tail=node_obj;
		size=1;
		return head;
	}
	
	//traversing/printing the CSLL
	public void traverseCircularSingleLinkedList() {
		
		Node tempNode=head;
		if(existsCircularSingleLinkedList()) 
		{
			for(int i=0; i<getSize(); i++) 
			{
				System.out.print(tempNode.getValue());
				if(i!=getSize()-1)
					System.out.print(" -> ");
				tempNode=tempNode.getNext();
			}
			System.out.println("\n");
		}
		else
		{
			System.out.println("\nCircular Single LL Does not exist!!!");
		}
		
	}//fn ends
	
	//inserting a node in the CSLL
	public void insertInLinkedList(int nodeValue, int location)
	{
		Node node_obj = new Node();
		node_obj.setValue(nodeValue);
		System.out.println("Inserting a new node at location: " + location);
		if(!existsCircularSingleLinkedList())
		{
			System.out.println("The CS Linked List does not Exist!!!");
			return;  //CSLL DNE
		}
		else if(location == 0)                  //Insert at 1st position
		{
			node_obj.setNext(head);
			head = node_obj;
			tail.setNext(node_obj);       //updating tail
		}
		else if(location >= size) 				//Insert at last position
		{
			//node_obj.setNext(head);
			tail.setNext(node_obj);
			tail=node_obj;
			tail.setNext(head);
		}
		else									//Insert at specified position
		{
			Node tempNode = head;
			int index = 0;
			while(index < location-1)
			{
				tempNode = tempNode.getNext();
				index++;
			}
			node_obj.setNext(tempNode.getNext());
			tempNode.setNext(node_obj);
		}
		size++;
	}
	
	//Traverse CSLL using tail from tail to head
	void printHeadUsingTail()
	{
		if(existsCircularSingleLinkedList())
		{
			System.out.print("Printing Tail: ");
			System.out.println(tail.getValue()+"\n");
			
			System.out.print("Printing Head: ");
			System.out.println(head.getValue()+"\n");
			
			System.out.print("Printing Head Using Tail Reference: ");
			System.out.println(tail.getNext().getValue()+"\n");
		}
		else
		{
			System.out.println("CSLL DNE!!!");
		}
	}
	
	//Search given value in LinkedList
	boolean searchNode(int nodeValue)
	{
		if(existsCircularSingleLinkedList())
		{
			Node tempNode = head;
			for(int i = 0 ; i < size ; i++)
			{
				if(tempNode.getValue() == nodeValue)
				{
					System.out.println("Found the Node at Location: "+i+"\n");
					return true;
				}
				tempNode = tempNode.getNext();
			}
		}
		System.out.println("Node not found!!! ");
		return false;
	}
	
	//deletion of a Node when location is given
	void deletionOfNode(int location)
	{
		if(existsCircularSingleLinkedList())
		{
			//Node tempNode = head;
			if(location == 0)  				//deletion of 0th node
			{
				head = head.getNext();
				tail.setNext(head);
				setSize(getSize()-1);
				if(getSize() == 0)			// if there are no more nodes in this list
					{
					  tail.setNext(null);
					  tail = null;
					}
			}
			else if(location >= size)    	//deletion of last node
			{
				Node tempNode = head;
				for(int i = 0 ; i < size-1 ; i++)
				{
					tempNode = tempNode.getNext();
				}
				if(tempNode == head)		//if this is the only element in the list
				{
					tail.setNext(null);
					head = tail = null;
					setSize(getSize()-1);
					return;
				}
				tempNode.setNext(head); 
				tail = tempNode;
				setSize(getSize()-1);
			}
			else						//	deletion of any inside node
			{
				Node tempNode = head;
				for(int i = 0 ; i < location-1 ; i++)
				{
					tempNode = tempNode.getNext();	// we need to traverse till we find the location
				}
				tempNode.setNext(tempNode.getNext().getNext());
				setSize(getSize()-1);
			}
		}
		else
		{
			System.out.println("The CSLL DNE!!!");
			return;
		}
	}	//end of method
	
	//Delete Entire Linked List
	void deleteLinkedList()
	{
		System.out.println("\n\nDeleting Linked List...");
		head = null;
		if(tail==null)
		{	
			System.out.println("LL is already deleted , nothing to delete!!!");
			return;
		}
		else
		{
			tail.setNext(null);
			tail = null;
			System.out.println("LL deleted Successfully !!!");
		}
	}
}	//end of class
