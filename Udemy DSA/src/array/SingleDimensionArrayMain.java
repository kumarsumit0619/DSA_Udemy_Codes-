package array;

public class SingleDimensionArrayMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating a blank array of size 10..");
		SingleDimensionArray sda=new SingleDimensionArray(10);
		
		System.out.println("Printing the Array..");
		sda.traverseArray();
		System.out.println();
		
		System.out.println("Inserting new values in the array..");
		sda.insert(0,0);
		sda.insert(1, 10);
		sda.insert(2, 20);
		sda.insert(3, 30);
		sda.insert(4, 40);
		sda.insert(5, 50);
		sda.insert(6, 60);
		sda.insert(7, 70);
		sda.insert(8, 80);
		sda.insert(1, 100);
		sda.insert(12, 120);
		System.out.println();
		
		System.out.println("Accessing cell #1..");
		sda.accessingCell(1);
		System.out.println();
		
		System.out.println("Searching 30 in the array");
		sda.searchInAnArray(30);
		System.out.println();
		
		System.out.println("Searching 400 in the array");
		sda.searchInAnArray(400);
		System.out.println();
		
		System.out.println("Deleting value from cell#3 of array..");
		System.out.println("Before Deleting: ");
		sda.traverseArray();
		sda.deleteValueFromArray(3);
		System.out.println();
		System.out.println("After Deleting");
		sda.traverseArray();
		System.out.println();
		
	}//end of main

}//end of class
