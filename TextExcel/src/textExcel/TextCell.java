package textExcel;

public class TextCell implements Cell {
	private String text;
	public TextCell(String cellText){
		cellText = text;
	}
	@Override
	public String abbreviatedCellText() {
		
		return ( + "              ").substring(0, 9);
	}

	@Override
	public String fullCellText() {
		
		return ;
	}
}
