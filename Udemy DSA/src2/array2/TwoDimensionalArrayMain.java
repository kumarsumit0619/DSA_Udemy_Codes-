package array2;

public class TwoDimensionalArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating a blank arra of size 5X5...");
		TwoDimensionalArray tda=new TwoDimensionalArray(5,5);
		tda.traverseArray();
		
		tda.insertValueInTheArray(0, 2, 1000000001);
		tda.traverseArray();
		
		tda.insertValueInTheArray(0, 2, 1000000002);
		tda.traverseArray();
		
		tda.accessingSingleCell(0, 2);
		tda.accessingSingleCell(6, 2);
		tda.accessingSingleCell(2, 2);
		
		tda.searchingSingleValue(10);
		tda.searchingSingleValue(-2147483648);
		tda.searchingSingleValue(1000000001);
		
		tda.deleteValueFromArray(0, 2);
		tda.traverseArray();
		
		tda.deleteThisArray();
		tda.traverseArray();
	}

}