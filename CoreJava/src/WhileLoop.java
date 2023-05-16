import java.util.Scanner;

/*
 * 
 * While Loop
 * 
 * -Entry controlled loop.
 * -No Semicolon after while
 * -If condition false at first then no execution
 * 
 * while(condition)
 * {
 * 	body of the loop
 * }
 * 
 * do/while loop
 * 
 * -Exit controlled loop
 * -Semicolon after while
 * -If condition false at first still minimum one time execution.
 * 
 * do
 * {
 * 	body of the loop
 * }while(condition);
 * 
 * */


public class WhileLoop {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N : ");
		n=sc.nextInt();
		do
		{
			sum=sum+n;
			n=n-1;
		}while(n<0);
		System.out.println("Sum : "+sum);
	}
}
