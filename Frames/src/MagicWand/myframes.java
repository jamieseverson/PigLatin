//copyright David Marshal and Deitel Java
package MagicWand;

import java.util.Scanner; //program uses class Scanner
import javax.swing.JOptionPane;
import java.util.Random;
public class myframes 
{
	public static void main(String[] args)
	{
	//create a Scanner to obtain input from the command window
	Scanner input = new Scanner(System.in);

	int number1; //first number to add
	int number2; //second number to add
	int sum1; //sum of number 1 and number 2
	
	System.out.print("Enter first integer to multiply:"); //prompt
	number1 = input.nextInt(); // read first number from user	
	
	System.out.print("Enter second integer to multiply:"); //prompt
	number2 = input.nextInt(); //read second number from user
	
	sum1 = number1 * number2; //multiply numbers, then store total in sum
	
		System.out.printf("Sum is %d%n", sum1); //display sum
		
	int number3;
	int number4;
	int quotient;
	
	System.out.print("Enter an integer to divide:"); //prompt
	number3 = input.nextInt(); // read first number from user	
	
	System.out.print("Enter next integer to divide by:"); //prompt
	number4 = input.nextInt(); //read second number from user
	
	quotient = number3 / number4;
	
	System.out.printf("Sum is %d%n", quotient); //display quotient
	
	
	String name = JOptionPane.showInputDialog("What is your name?");
	
	String message = 		
			String.format("Welcome, %s, to my code!", name);
		
			{JOptionPane.showMessageDialog(null, message);
		
			
//loop statements
		int x = 1;
		int i;
		int count = 0;
		
		Scanner myScanner;
		myScanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println ("loop 1: number of x's is " + count++);
			x = myScanner.nextInt();
			if ( x > 10 )
			{ break; }
			System.out.println("skip this when I type a number over 10");
			//count = count + 1
		}
		
		do {
			System.out.println ("loop 2: number of x's is " + count);
			x = myScanner.nextInt();
				if ( x > 10 )
				{ break; }
			count = count + 1;
		}while ( x == 1);
		
		System.out.println ("count is " + count);
		myScanner.nextLine();
		
		Random myRandomgenerator = new Random();
		int pick = 0;
			
		for (i = 1; i < 10; i++);
		{
			System.out.println(i + " times through this loop");
			pick = myRandomgenerator.nextInt(10) + 3;
				// 10 is range, 3 is the starting point
			System.out.println ("a number between 3 and 13 is:" + pick);
			myScanner.nextLine();
		
		
		myScanner.close();
		
		
			}
			}
	}
}
		
		
				


					
// end class

