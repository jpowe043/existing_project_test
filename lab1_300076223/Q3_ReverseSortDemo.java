public class Q3_ReverseSortDemo {
	public static void main(String[] args){
		char[] unorderedLetters;
		unorderedLetters = new char[]{'b', 'm', 'z', 'a', 'u'};
		reverseSort(unorderedLetters);
		for (int i = 0 ; i < unorderedLetters.length; i++ )
			System.out.print(unorderedLetters[i]);
	}

	public static void reverseSort(char[] values){

		char tempChar;
		int tempInt;

		for(int i = 0; i < values.length - 1; i++){
			
			tempInt = i;
			
			for(int j = i+1; j<values.length; j++){
				
				if(values[j] > values[tempInt]){
					
					tempInt = j;
					
				}
				
			}
			
			tempChar = values[tempInt];
			values[tempInt] = values[i];
			values[i] = tempChar;

			
		}
		
		
		
	}

}