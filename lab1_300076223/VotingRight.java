import java.util.Scanner;

public class VotingRight{
	
	public static void main(String[] args){
		
		System.out.print("How old are you? ");
		Scanner scanAge = new Scanner(System.in);
		int age = scanAge.nextInt();
		
		if(age < 18){
			
			System.out.println("You will allowed to vote in " + (18-age) + " years.");
			
		}
		else{
			
			System.out.println("You have the right to vote!");
			
		}
		
	}
	
}