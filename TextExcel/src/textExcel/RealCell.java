package textExcel;

public class RealCell implements Cell {
	private String i;
	public RealCell(String input){
		i = input;
	}
	public String getNumber(){
		return i;
	}

	@Override
	public String abbreviatedCellText() {
		return (i + "                   ").substring(0, 10);
	}

	@Override
	public String fullCellText() {
		return i;
	}
	public double getDoubleValue(){
		return Double.parseDouble(i);
	}

}
