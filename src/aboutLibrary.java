//Maurice Hanns CSC 242 02-13-2018



import java.util.Scanner;

public class aboutLibrary {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Acme Library System.\n");
		
		for (int i = 1; i <= 5; i++)
			{
				System.out.println("Please enter the Library's Location. ");
				String Location = input.nextLine();
				
				System.out.println("Please enter the Library's Total Books. ");
				int TOTBk = input.nextInt();
				
				System.out.println("Please enter the Library's Staff Total. ");
				int StfTOT = input.nextInt();
				
				System.out.println("Please enter the Library's Yearly Expenses. ");
				double YrXP = input.nextDouble();
				input.nextLine();  //consume
			
				Library LibData = new Library(Location, TOTBk, StfTOT, YrXP);
				
				System.out.println("Location: " + LibData.Library_Location + "Total Books: " + LibData.Library_Total_Books  + 
						"Total Staff: " + LibData.Library_Staff_Total + "Total Expenses: " + LibData.Library_Yearly_Expense);
			
					}
			
	
	}

}
