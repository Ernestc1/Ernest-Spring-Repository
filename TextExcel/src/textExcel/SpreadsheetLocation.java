package textExcel;
import java.util.*;
//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int rowNumber;
	private int colNumber;
    @Override
    public int getRow()
    {
    	
    	return rowNumber;
    }

    @Override
    public int getCol()
    {
    	
        return colNumber;
    }
    
    public SpreadsheetLocation(String cellName)
    {
    	Scanner loc = new Scanner (System.in);
    	cellName = loc.nextLine();
    	colNumber = cellName.charAt(0) - 'A';
    	rowNumber = (int) cellName.substring(1);
    	
    }

}
