package array;

public class SingleDimensionArray {

	int[] arr=null;
	
	//constructor
	public SingleDimensionArray(int sizeOfArray)
	{
		arr=new int[sizeOfArray];
		for(int i=0;i<arr.length;i++)
			arr[i]=Integer.MIN_VALUE;
	}
	
	// Print or traverse the array
	public void traverseArray()
	{
		try {
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
		}
		catch(Exception e) {
			System.out.println("Array no longer exists!");
		}
	}
	
	//Insert value in the array
	public void insert(int location,int valueToBeInserted) {
		try {
			if(arr[location]==Integer.MIN_VALUE) {
				arr[location]=valueToBeInserted;
			System.out.println("Successfully inserted "+valueToBeInserted+ " at location:"+location);
			}
			else
				System.out.println("The cell is already occupied by another value.");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index to access array!");
		}
	}
	
	//Accessing a perticular element in an array
	public void accessingCell(int CellNumber)
	{
		try {
			System.out.println(arr[CellNumber]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid cell number to access array!");
		}
	}
	
	//Search for an element in a given array
	public void searchInAnArray(int valueToSearch)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==valueToSearch) {
				System.out.println("Value found");
				System.out.println("Index of "+valueToSearch+ " is: "+i);
				return;
			}
		}
		System.out.println(valueToSearch+" is not found!!");
	}
	
	//delete value from given array
	public void deleteValueFromArray(int deleteValueFromThisCell) {
		try {
			arr[deleteValueFromThisCell]=Integer.MIN_VALUE;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("can't Delete the value as cell# provided is not in the range of array!");
		}
	}
	
}//end of class
