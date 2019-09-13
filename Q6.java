import java.util.Scanner;

public class Q6{
	
	public static void main(String[] args){
		
		double[] grades;
		grades = new double[10];
		System.out.println("Enter 10 students' grades: ");
		Scanner scanGrades = new Scanner(System.in);
		
		System.out.println("Input the first grade");
		grades[0] = scanGrades.nextDouble();
		
		System.out.println("Input the second grade");
		grades[1] = scanGrades.nextDouble();
		
		System.out.println("Input the third grade");
		grades[2] = scanGrades.nextDouble();
		
		System.out.println("Input the fourth grade");
		grades[3] = scanGrades.nextDouble();
		
		System.out.println("Input the fifth grade");
		grades[4] = scanGrades.nextDouble();
		
		System.out.println("Input the sixth grade");
		grades[5] = scanGrades.nextDouble();
		
		System.out.println("Input the seventh grade");
		grades[6] = scanGrades.nextDouble();
		
		System.out.println("Input the eigth grade");
		grades[7] = scanGrades.nextDouble();
		
		System.out.println("Input the ninth grade");
		grades[8] = scanGrades.nextDouble();
		
		System.out.println("Input the tenth grade");
		grades[9] = scanGrades.nextDouble();
		
		System.out.println("The average of the grades is: " + calculateAverage(grades));
		
		System.out.println("The median of the grades is:" + calculateMedian(grades));
		
		System.out.println("The number of failing grades is: " + calculateNumberFailed(grades));
		
		System.out.println("The number of passing grades is: " + calculateNumberPassed(grades));
		
		

	}

	public static double calculateAverage(double[] notes){
		double average;
		average = 0;
		
		for(int i = 0; i < notes.length; i++){
			
			average = average + notes[i];
			
		}
		average = average/notes.length;
		
		return average;
	}

	public static double calculateMedian(double[] notes){
		double median, temp;
		int tempI;
		
		for(int i = 0; i<notes.length-1; i++){
			
			tempI = i;
			
			for(int j = i+1; j < notes.length; j++){
				
				
				if(notes[j] < notes[tempI]){
					
					tempI = j;
					
				}
				
			}
			
			temp = notes[tempI];
			notes[tempI] = notes[i];
			notes[i] = temp;
		}
		
		median = (notes[4]+notes[5])/2;
		return median;
	}

	public static int calculateNumberFailed(double[] notes){
		int failed;
		failed = 0;
		
		for(int i = 0; i< notes.length; i++){
			
			if(notes[i] < 50.0){
				
				failed++;
				
			}
			
		}
		return failed;
	}

	public static int calculateNumberPassed(double[] notes){
		int passed;
		passed = 0;
		
		for(int i = 0; i< notes.length; i++){
			
			if(notes[i] >= 50.0){
				
				passed++;
				
			}
			
		}
		return passed;
	}

}