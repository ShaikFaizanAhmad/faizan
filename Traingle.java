package JavaAssignments;

import java.util.Scanner;

public class AssigmentSix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Angle of first");
		int a =sc.nextInt();
		System.out.println("Enter the Angle of second");
		int b =sc.nextInt();
		System.out.println("Enter the Angle of third");
		int c =sc.nextInt();
		
		int sumofAngle= a+b+c;
		if(sumofAngle<180){
			System.out.println("The Triangle is valid");
		}else{
			System.out.println("The Triangle is not valid");
		}
		
		

	}

}