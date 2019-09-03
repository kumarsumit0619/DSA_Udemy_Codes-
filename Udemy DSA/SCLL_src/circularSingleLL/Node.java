package circularSingleLL;

public class Node {
	
	private int value;
	private Node next;
	
	public Node(){
		int value=0;
		Node next=null;
	}
	
	public void setValue(int value) {
		this.value=value;
	}
	
	public void setNext(Node next) {
		this.next=next;
	}
	
	public int getValue() {
		return value;
	}
	
	public Node getNext() {
		return next;
	}

}
