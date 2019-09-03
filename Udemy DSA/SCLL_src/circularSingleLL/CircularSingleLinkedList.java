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
		if(existsCircularSingleLinkedList()) {
			for(int i=0; i<getSize(); i++) {
				System.out.println(tempNode.getValue());
				if(i!=getSize()-1)
					System.out.println(" -> ");
				tempNode=tempNode.getNext();
				return;
			}
		}
		System.out.println("Circular Single LL Does not exist!!!");
		
	}
	
	
}
