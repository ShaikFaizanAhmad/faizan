package assignment;
import java.util.Scanner;
public class absoluteValue {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a value");
		int num=scan.nextInt();
		if(num<0)
		{
			System.out.println("The absolute value for"+num +"is"+(-num));
		}
		else
		{
			System.out.println("The absolute value for"+num +"is"+num);
		}
		
	}

}
