package textExcel;
import java.util.*;
//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
    @Override
    public int getRow()
    {
    	Scanner rows = new Scanner(System.in);
    	int numberOfRows = rows.nextInt();
        return numberOfRows;
    }

    @Override
    public int getCol()
    {
        Scanner cols = new Scanner(System.in);
        int numberOfCols = cols.nextInt();
        return numberOfCols;
    }
    
    public SpreadsheetLocation(String cellName)
    {
    	
        // TODO: Fill this out with your own code
    }

}
