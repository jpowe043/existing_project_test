public class Q3_SquareArray{
	
	public static void main(String[] args){
	
		createArray(12);
		
	}
	
	public static int[] createArray(int size){
		
		size = size+1;
		
		int[] square;
		square = new int[size];
		
		for(int i = 0; i< square.length; i++){
			
			square[i] = i*i;
			System.out.println("The square of " + i + " is: " + (i*i));
		
		}
		
		return square;
		
	}
	
	
}