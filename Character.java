package assignment;

import java.util.Scanner;

public class FindChar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=scan.next().charAt(0);
		int n=ch;
		if(n>=65 && n<=90)
		{
			System.out.println("Entered Character is Capital alphabet");
		}
		else if(n>=96 && n<=122)
		{
			System.out.println("Entered Character is Small alphabet");
		}
		else if(n>= 48 && n<=57)
		{
			System.out.println("Entered Character is Number");
		}
		else
		{
			System.out.println("Entered Character is Special Symbol");
		}