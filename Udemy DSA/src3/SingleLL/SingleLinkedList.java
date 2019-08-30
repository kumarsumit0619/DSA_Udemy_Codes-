package SingleLL;

public class SingleLinkedList {
	
	private Node head;
	private Node tail;
	private int size; //size of SLL
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	//
	public boolean existsLinkedList() {
		return (head!=null);
	}
	
	//Creating single Linked List
	public Node createSingleLinkedList(int nodeValue){
		
		head=new Node();
		tail=new Node();  //was not there&&&&&&&
		Node node_obj=new Node();
		
		node_obj.setValue(nodeValue);
		node_obj.setNext(null);
		head=node_obj;
		tail=node_obj;
		size=1;
		return head;	
	}
	
	//Printing SLL
	void traverseLinkedList() {
		if(head==null) {   //list is empty
			System.out.println("SLL does not exist!!!!!!!");
			return;
			}
		
		Node tempNode = head;
		for(int i=0 ; i < getSize() ; i++) {
			System.out.print(tempNode.getValue());
			if(i != getSize()-1) {
				System.out.print(" -> ");
			}
			tempNode = tempNode.getNext();
		}
		System.out.println("\n");
	}
	
	//Inserting an element in a SLL
	public void insertInLinkedList(int nodeValue, int location) {
		Node node_obj=new Node();
		node_obj.setValue(nodeValue);
		
		if(head==null) {
			System.out.println("SLL does not exist!!!!!!!");
			return;
		}
		else if(location == 0)  //Insert at 1st position
		{
			node_obj.setNext(head);
			head=node_obj;
		}
		else if (location >= size) //Insert at last position
		{
			node_obj.setNext(null);
			tail.setNext(node_obj);
			tail=node_obj;
		}
		else                     //Insert at specified position
		{
		   Node tempNode = head;
		   int index = 0;
		   while(index < location - 1) { // loop till we reach specified node
			 tempNode=tempNode.getNext();
			 index++;
		   }   									//tempNode currently references to node after which we should insert new node
		   Node nextNode = tempNode.getNext();  //this is the immediate next node after new node
		   tempNode.setNext(node_obj);  		//update reference of tempNode to reference to new node
		   node_obj.setNext(nextNode);  		//update newly added nodes' next.
		}
		setSize(getSize()+1);
	}
	
	//Searching a node with given element/data value
	boolean searchNode(int nodeValue)
	{
		if(existsLinkedList()) 
		{
			Node tempNode=head;
			for(int i=0; i<getSize(); i++)
			{
				if(tempNode.getValue()==nodeValue)
				{
					System.out.println("Found the node at location: "+i+"\n");
					return true;
				}
				tempNode = tempNode.getNext();
			}
		}
		System.out.println("Node not Found!! \n");
		return false;
	}
	
	//Delete a node having a given value
	public void deletionOfNode(int location)
	{
		if(!existsLinkedList())
		{
			System.out.println("The Linked List Doesn't Exixts!!");
			return;
		}
		else if(location==0) // we want to delete first element
		{
			head=head.getNext();
			setSize(getSize()-1);
			if(getSize()==0) { // if there are no more nodes in this list
				tail=null;
			}
		}
		else if(location >=getSize())  //If location is not in range or equal, then delete last node
		{
			Node tempNode = head;
			for(int i=0; i<getSize()-1; i++) {
				tempNode = tempNode.getNext(); // temp Node points to 2nd last node at the end of the loop
			}
			if(tempNode == head) { // if this is the only element in SLL
				tail=head=null;
				setSize(getSize()-1);
				return;
			}
			tempNode.setNext(null);
			tail=tempNode;
			setSize(getSize()-1);
		}
		else { //if any inside node is to be deleted
			Node tempNode=head;
			for(int i=0; i<location-1; i++)
			{
				tempNode=tempNode.getNext();  // we need to traverse till we find the location
			}
			tempNode.setNext(tempNode.getNext().getNext()); // delete the required node
			setSize(getSize()-1);
		}//end of else
	}//end of method
	
	//Delete Entire SLL
	void deleteLinkedList() {
		System.out.println("\nDelete Linked List...");
		head=null;
		tail=null;
		System.out.println("SLL Deleted Successfully!!!");
	}
	
}//end of class
