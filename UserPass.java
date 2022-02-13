
// Java program for the ATM-MACHINE

import java.util.Scanner;
public class UserPass
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		String[] password = {"aaa,100","bbb,100"};
		int[] accountNumber = {987654321,987654320};

		System.out.println("\n================================");
        System.out.println("\tATM - MACHINE");
		System.out.println("================================");
		System.out.println("\n\tUser verification");
		System.out.println("\t-----------------");


		while(true)
		{
			try{

				System.out.print("\nEnter account number: ");
				int account = input.nextInt();

				System.out.print("\nEnter password: ");
				String pin = input.next();																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																								

				if (((account==accountNumber[0])&&(pin.compareTo(password[0])==0))||
				((account==accountNumber[1])&&(pin.compareTo(password[1])==0)))
				{
					System.out.println("\n-------------------------");
					System.out.println("Your welcome");
					System.out.println("----------------------------");

				}else {
					System.out.println("\n------------------------------------------------------");
					System.out.println("Incorrect account number or password, try again!");
					System.out.println("------------------------------------------------------\n\n");
				}

			}catch(Exception e){
			System.out.println("\n------------------------------------------------------");
			System.out.println("Incorrect account number or password, try again!");
			System.out.println("------------------------------------------------------\n\n");
			}


		}

	}
}