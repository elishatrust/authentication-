
/*	Authenticate username & password	*/

import java.util.Scanner;
public class Authentication
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);

		int []accountNumber = {100100,100200,100300,100400,100500};
		String []password = {"2020-aaa","2020-bbb","2020-ccc","2020-ddd","2020-eee"};
		
		boolean ok = true;

		System.out.println("\n\tLogin\n\t-----");

		System.out.println("\nEnter account number: ");
		int accNo = input.nextInt();

		System.out.println("\nEnter password: ");
		String pwd = input.next();

		if (((accNo==accountNumber[0]).compareTo(pwd==password[0])==0||
			(accNo==accountNumber[1]).compareTo(pwd==password[1])==0||
			(accNo==accountNumber[2]).compareTo(pwd==password[2])==0||
			(accNo==accountNumber[3]).compareTo(pwd==password[3])==0||
			(accNo==accountNumber[4]).compareTo(pwd==password[4]))==ok) 
		{
			System.out.println("\nIncorrect AccountNumber OR Password");
		}else{	
			System.out.println("\nLogin successfully!");
			
		}
	}
}