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
    	if(cellName.charAt(0) > 'a'){
    		colNumber = cellName.charAt(0) - 'a';
    	}else{
    	colNumber = cellName.charAt(0) - 'A';
    	}
    	rowNumber = Integer.parseInt(cellName.substring(1))-1;
    }

}
