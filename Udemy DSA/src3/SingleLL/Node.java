package SingleLL;

public class Node {
	
	private int value;
	private Node next;
	
	public Node()
	{
		value=0;
		next=null;
	}
	
	public Node(int value,Node next) {
		this.value=value;
		this.next=next;
	}
	
	public void setValue(int value) {
		this.value=value;
	}
	
	public void setNext(Node next) {
		this.next=next;
	}
	
	public int getValue() {
		return(value);
	}
	
	public Node getNext() {
		return(next);
	}
}
