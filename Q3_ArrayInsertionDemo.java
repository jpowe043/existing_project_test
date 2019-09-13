public class Q3_ArrayInsertionDemo{

	public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
		
		int[] newArray;;
		newArray = new int[(beforeArray.length)+1];
		for(int i = 0; i < newArray.length; i++){
			
			if(i == indexToInsert){
				newArray[i] = valueToInsert;
			}
			else if(i < indexToInsert){
				newArray[i] = beforeArray[i];
			}
			else if(i > indexToInsert){
				newArray[i] = beforeArray[i-1];
			}
			
		}
		return newArray;
		
	}

	public static void main(String[] args){
		
		int[] firstArray, secondArray;
		firstArray = new int[]{1,3,4,7,9,6};
		int index, value;
		index = 3;
		value = 15;
		secondArray = insertIntoArray(firstArray, index, value);
		
		System.out.println("Array before insertion:");
		
		for(int j = 0; j< firstArray.length; j++){
			
			System.out.println(firstArray[j]);
			
		}
		
		System.out.println("Array after insertion of " + index+ " at position " + value + ":");
		
		for(int k = 0; k< secondArray.length; k++){
			
			System.out.println(secondArray[k]);
			
		}
	}

}