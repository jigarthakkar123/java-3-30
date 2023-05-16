import java.util.Scanner;

/*
 * Exception:An abnormal situation that arises during the run time of a program is 
 * called Exception.
 * 1. try
 * 2. catch
 * 3. throw
 * 4. throws
 * 5. finally
 * 
 * */

public class ExceptionDemo {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Start Code");
		try {
			System.out.print("Enter A : ");
			a=scanner.nextInt();
			System.out.print("Enter B : ");
			b=scanner.nextInt();
			
			c=a/b;
			System.out.println("Division : "+c);
		}catch(Exception e) {
			System.out.println("Exception Caught : "+e);
		}
		System.out.println("End Code");
	}
}
