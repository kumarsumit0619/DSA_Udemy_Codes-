package array2;

public class TwoDimensionalArray {
	int [][]arr=null;
	
	//constructor
	public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
		this.arr=new int[numberOfRows][numberOfColumns];
		for(int row=0;row<numberOfRows;row++)
		{
			for(int col=0; col<numberOfColumns; col++)
			{
				arr[row][col]=Integer.MIN_VALUE;
			}
		}
	}
	
	//Print or traverse the array
	public void traverseArray() {
		try {
			System.out.println("Printing the array now...");
			for(int row=0;row<arr.length;row++)
			{
				for(int col=0; col<arr[0].length; col++)
				{
					System.out.print(arr[row][col]+" ");
				}
				System.out.println();
			}
			System.out.println("\n");
			}
		catch(Exception e) {
			System.out.println("Array Does not Exists!");
		}
	}
	
	//Inserting value in the Array
	public void insertValueInTheArray(int row, int col, int valueToBeInserted) {
		try {
			if(arr[row][col]==Integer.MIN_VALUE) {
				arr[row][col]=valueToBeInserted;
				System.out.println("Successfully inserted "+valueToBeInserted+" at location "+row+"X"+col);
			}
			else
				System.out.println("This cell is already occupied by another value");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index to access array!");
		}
	}
	
	//Accessing a single value from a given array
	public void accessingSingleCell(int row,int col) {
		System.out.println("\nAccessing Row# "+row+ " ,Col# " +col+"...");
		try {
			System.out.println("cell value is: "+arr[row][col]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array!");
		}
		System.out.println();	
	}
	
	//Searching a given value from an array
	public void searchingSingleValue(int value) {
		 System.out.println("\nSearching value "+value+ " in the array");
		 for(int row=0;row<arr.length;row++)
			{
				for(int col=0; col<arr[0].length; col++)
				{
					if(arr[row][col]==value) {
						System.out.println("value is found at location Row:" +row+ " & Col:" +col+ "\n\n");
						return;
					}
				}
			}
		 System.out.println("Value is not found in Array\n");
	}
	
	//Deleting a value from an array
	public void deleteValueFromArray(int deleteValueFromThisRow, int deleteValueFromThisCell) {
		System.out.println("Deleting value from Row# "+deleteValueFromThisRow+" & Cell# "+deleteValueFromThisCell+"...");
		try {
			System.out.println("Successfully Deleted: "+arr[deleteValueFromThisRow][deleteValueFromThisCell]);
			arr[deleteValueFromThisRow][deleteValueFromThisCell]=Integer.MIN_VALUE;
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println();
			System.out.println("Cant Delete the vlaue as cell# provided is not in the range of array!");
		}
	}
	
	//delete the entire array
	public void deleteThisArray() {
		arr=null;
		System.out.println("Array has been successfully deleted");
	}
}//class ends
