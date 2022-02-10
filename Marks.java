
package JavaAssignments;

import java.util.Scanner;

public class AssignmentTen {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks of first subject out of 100");
		float firstSub =sc.nextFloat();
		System.out.println("Enter the Marks of second subject out of 100");
		float secondSub =sc.nextFloat();
		System.out.println("Enter the Marks of third subject out of 100");
		float thirdSub =sc.nextFloat();
		System.out.println("Enter the Marks of fourth subject out of 100");
		float fourthSub =sc.nextFloat();
		System.out.println("Enter the Marks of fifth subject out of 100");
		float fifthSub =sc.nextFloat();
		
		double sum =firstSub+secondSub+thirdSub+fourthSub+fifthSub;
		double percentage = (sum/500)*100;
		
		
		if(percentage>=60){
			System.out.println("The Division obtained is First Class");
		}else if(percentage<=59 && percentage>=50){
			System.out.println("The Division obtained is Second Class");
		}
		else if(percentage<=49 && percentage>=40){
			System.out.println("The Division obtained is Third Class");
		}
		else if(percentage<40){
			System.out.println("The Division obtained is Fsil");
		}
		
		

	}

}