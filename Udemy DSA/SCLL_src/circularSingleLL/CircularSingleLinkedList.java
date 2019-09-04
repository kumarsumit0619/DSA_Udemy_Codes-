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
				System.out.println(tempNode.getValue());
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
			
		}
	}
	
	
}
