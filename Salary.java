package JavaAssignments;

import java.util.Scanner;

public class AssignmentEight {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Salary");
		float bSalary =sc.nextFloat();
		double hra=0;
		double da=0;
		
		if(bSalary<1500 && bSalary>0){
			hra = bSalary*0.1;
			da = bSalary*0.9;
			
			double sum = (bSalary+hra+da);
			
			System.out.println("The Gross salary is :"+ sum);
		}else if(bSalary>1500){
			hra = 500;
			da = bSalary*0.98;
			
			double sum = (bSalary+hra+da);
			
			System.out.println("The Gross salary is :"+ sum);
		}else{
			System.out.println("Enter a valid input above value 0");
		}
		
		

	}

}