package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;
// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
		Spreadsheet sprsheet = new Spreadsheet();
		TextCell test = new TextCell("hello my name is jared");
		System.out.println(test.abbreviatedCellText());
		System.out.println(test.fullCellText());
		Scanner input = new Scanner(System.in);
		String command = input.nextLine();
		System.out.print(sprsheet.getGridText());
		while (!command.equals("quit")){
			command = input.nextLine();
			sprsheet.processCommand(command);
		}
		input.close();
	    // Add your command loop here
	}
}
