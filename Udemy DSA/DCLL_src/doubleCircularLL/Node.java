package doubleCircularLL;

public class Node {

	private Node next;
	private Node prev;
	private int value;
	
	public Node()
	{
		
	}
	
	//getters
	public Node getNext()
	{
		return next;
	}
	
	public Node getPrev()
	{
		return prev;
	}
	
	public int getValue()
	{
		return value;
	}
	
	
	//setters
	public void setNext(Node next)
	{
		this.next= next;
	}
	
	public void setPrev(Node prev)
	{
		this.prev= prev;
	}
	
	public void setValue(int value)
	{
		this.value= value;
	}
	
}
