//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class WordPrinterRunner
{
	public static void main( String args[] )
	{
	WordPrinter printWord = new WordPrinter();
   	Scanner keyboard = new Scanner(System.in);
   	String choice="";
		do{
			out.print("\nEnter the word to display :: ");
			String word = keyboard.next();
	
			out.print("Enter the times to display :: ");
 			int times = keyboard.nextInt();			
			
			printWord.printWord(word,times);

			System.out.print("\nDo you want to enter more sample input? ");
			choice=keyboard.next();			
		}while(choice.equals("Y")||choice.equals("y"));		
	}
}