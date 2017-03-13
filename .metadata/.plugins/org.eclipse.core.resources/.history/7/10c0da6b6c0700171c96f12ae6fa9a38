package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private Cell [][] cellArray;
	private String cellName;
	public Spreadsheet(){
		cellArray = new EmptyCell[getRows()][getCols()];
	}

	@Override
	public String processCommand(String command)
	{
		
		return "";
	}
	public String inspectCell(){
		int colNumber = (int) cellName.charAt(0) - 'A';
    	int rowNumber = Integer.parseInt(cellName.substring(1))-1;
    	return cellArray[rowNumber][colNumber].fullCellText();
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
		String header = "  |";
		for(int i = 0; i < this.getCols(); i++){
			header += ((char) ('A' + i)) + "      |";
		}
		return null;
	}

}
