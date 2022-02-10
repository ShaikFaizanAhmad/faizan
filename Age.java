package JavaAssignments;

import java.util.Scanner;

public class AssignmentFive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of Ram");
		int ar =sc.nextInt();
		System.out.println("Enter the age of Sulabh");
		int as =sc.nextInt();
		System.out.println("Enter the age of Ajay");
		int aa =sc.nextInt();
		
		if(ar<=as && ar<=aa){
			System.out.println("Youngest of all is : Ram");
		}
		else if(as<=ar && ar<=aa){
			System.out.println("Youngest of all is : Sulabh");
		}
		else{
			System.out.println("Youngest of all is : Ajay");	
		}
		
		

	}

}