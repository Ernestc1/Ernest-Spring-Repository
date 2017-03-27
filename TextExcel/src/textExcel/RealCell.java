package textExcel;

public class RealCell implements Cell {
	private String number;
	public RealCell(String input){
		number = input;
	}
	public String getNumber(){
		return number;
	}

	@Override
	public String abbreviatedCellText() {
		return (number + "                   ").substring(0, 10);
	}

	@Override
	public String fullCellText() {
		return number;
	}
	public double getDoubleValue(){
		return Double.parseDouble(number);
	}

}
