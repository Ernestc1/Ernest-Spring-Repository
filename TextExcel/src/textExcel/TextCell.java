package textExcel;

public class TextCell implements Cell {
	private String text;
	public TextCell(String cellText){
		text = cellText;
	}
	@Override
	public String abbreviatedCellText() {
		return (text + "                   ").substring(0, 10);
	}

	@Override
	public String fullCellText() {
		return text;
	}
}
