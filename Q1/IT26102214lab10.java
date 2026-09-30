import java.util.Scanner;
public class IT26102214lab10{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		char grade; 
		System.out.println();
		System.out.println("Enter the mark (0- 100):");
		int mark = input.nextInt();
		
		assert (mark >= 0 && mark <=100) : ("INvalid mark");
		 
		System.out.println();
		System.out.println("mark is validated");
		if (mark>=75){
			grade ='A';
		}
		else if (mark >=60){
			grade='B';
		}
		else if ( mark >= 50){
			grade ='C';
		}
		else if(mark >= 40){
			grade= 'D';
		}
		else{
			grade = 'F';
		}
		assert((grade=='A' && mark >= 75) ||
               (grade=='B' && mark >=60&& mark <75)||
			   (grade =='C' && mark >=50 &&mark <60)||
			   (grade=='D' && mark >=40 && mark <50)||
			   (grade =='F' && mark< 40)) :" incorrect grade assigned";
			   
			   
		System.out.print("The grade for the entered mark is :"+grade);
		

	}
}
		
		
		
 