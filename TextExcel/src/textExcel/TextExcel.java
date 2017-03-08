package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;
// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String command = input.nextLine();
		Spreadsheet sprsheet = new Spreadsheet();
		System.out.print(sprsheet.getGridText());
		while (!command.equals("quit")){
			command = input.nextLine();
			sprsheet.processCommand(command);
		}
		input.close();
		Cell tester = new TextCell ("hello");
		System.out.println(tester.abbreviatedCellText());
		System.out.println(tester.fullCellText());
	    // Add your command loop here
	}
}
