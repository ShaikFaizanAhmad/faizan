package assignment;
import java.util.Scanner;
public class pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter the integer");
		
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		
		if(num%2==0)
			System.out.println("this number is even");
		else
			System.out.println("this number is odd");
	}

} 
