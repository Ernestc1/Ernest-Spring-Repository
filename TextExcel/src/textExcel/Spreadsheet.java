package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private Cell [][] cellArray;
	public Spreadsheet(){
		cellArray = new Cell[getRows()][getCols()];
		for(int i = 0; i < cellArray.length; i++){
			for(int j = 0; j < cellArray[0].length;j++){
				cellArray[i][j] = new EmptyCell();
			}
		}
	}

	@Override
	public String processCommand(String command)
	{
		
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
		
		return null;
	}

}
