package textExcel;

import java.util.Arrays;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private Cell [][] cellArray;
	public Spreadsheet(){
		cellArray = new Cell[getRows()][getCols()];
		for (int i = 0; i<getRows(); i++){
			for(int j = 0; j<getCols(); j++){
				cellArray[i][j] = new EmptyCell();
			}
		}
	}

	@Override
	public String processCommand(String command)
	{
		/*Might use parts of this code
		 * String [] cellContent = command.split(" ");
		String location = cellContent[0];
		SpreadsheetLocation loc = new SpreadsheetLocation(location);
		int rowNumber = loc.getRow();
		int colNumber = loc.getCol();
		TextCell content = new TextCell(cellContent[2]);
		cellArray[rowNumber][colNumber] = content;
		return content.abbreviatedCellText();*/
		return "";
	}
	@Override
	public int getRows()
	{
		
		return 20;
	}

	@Override
	public int getCols()
	{
		
		return 12;
	}

	@Override
	public Cell getCell(Location loc)
	{
		
		return null;
	}

	@Override
	public String getGridText()
	{
		String spreadsheet = "";
		String letters = "   |";
		String rowNumber = "";
		for(int i = 0; i < this.getCols(); i++){
			letters += ((char) ('A' + i)) + "         |";
		}
		spreadsheet += letters + "\n";
		String rows = "";
		for(int i = 0; i < getRows(); i++){
			if(i < 9){
				rows = ((i+1) + "  |");
			}
			else{
				rows = ((i+1)+ " |");
			}
			for(int k = 0; k < cellArray[0].length; k++){
				rows += cellArray[i][k].abbreviatedCellText() + "|";
			}
			rowNumber = "\n";
			spreadsheet += rows + rowNumber;
		}
		return spreadsheet;
	}

}
