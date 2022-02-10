package assignment;
import java.util.Scanner;
public class profitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int cprice ,sprice ,profit,loss;
		System.out.println("enter the cost price");
		cprice=scan.nextInt();
		
		System.out.println("enter the selling price");
		sprice=scan.nextInt();
		
		if(cprice<sprice)
		{
			profit=sprice-cprice;
			System.out.println("total profit is: " +profit);
		}
		else
		{
			loss=cprice-sprice;
			System.out.println("Total loss is:" +loss );
		}
	}
