package JavaAssignments;

import java.util.Scanner;

public class AssignmentThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items listed");
		int a =sc.nextInt();
		int totalExpense=0;
		for(int i=0;i<a;i++){
			System.out.println("Enter the price of items listed");
			int b =sc.nextInt();
			System.out.println("Enter the Quantity of items listed");
			int c =sc.nextInt();
			int totalExpensePerItem= b*c;
			totalExpense += totalExpensePerItem;
		}
		if(totalExpense>5000){
			 totalExpense= totalExpense-(totalExpense*10/100);
		}
		System.out.println("The Final Expenses are "+ totalExpense);
		

	}

}