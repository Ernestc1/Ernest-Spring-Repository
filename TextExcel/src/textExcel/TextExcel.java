package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;
// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
		Spreadsheet sprsheet = new Spreadsheet();
		TextCell test = new TextCell("hello");
		System.out.println(test.abbreviatedCellText());
		System.out.println(test.fullCellText());
		RealCell testt = new RealCell("123456");
		System.out.println(testt.abbreviatedCellText());
		ValueCell testtt = new ValueCell("12345");
		System.out.println(testtt.abbreviatedCellText());
		PercentCell testPercent = new PercentCell("11.25%");
		System.out.println(testPercent.abbreviatedCellText());
		System.out.println(testPercent.fullCellText());
		Scanner input = new Scanner(System.in);
		String command = input.nextLine();
		while (!command.equals("quit")){
			command = input.nextLine();
			sprsheet.processCommand(command);
		}
		input.close();
	    // Add your command loop here
	}
}
