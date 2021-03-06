package textExcel;

public class PercentCell extends RealCell{

	public PercentCell(String percent) {
		super(percent);
	}
	public String abbreviatedCellText() {
		String number = getNumber();
		if (number.indexOf(".") != -1){
			number = number.substring(0, number.indexOf(".")) + "%                    ";
		}
		return number.substring(0,10);
	}
	public String fullCellText() {
		return getDoubleValue() + "";
	}
	public double getDoubleValue(){
		String number = getNumber();
		double percent = Double.parseDouble(number.substring(0,number.length()-1));
		return percent/100;
	}


}
