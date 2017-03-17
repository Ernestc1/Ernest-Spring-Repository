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
    	colNumber = (int)cellName.charAt(0) - (int)'A';
    	rowNumber = Integer.parseInt(cellName.substring(1))-1;
    }

}
