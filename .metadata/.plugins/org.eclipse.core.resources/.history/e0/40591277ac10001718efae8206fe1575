package textExcel;

public class ValueCell extends RealCell{

	public ValueCell(String input) {
		super(input);
	}
	public String abbreviatedCellText(){
		String val = getNumber();
		double decimal = Double.parseDouble(val);
		val = decimal + "";
		if(val.indexOf(".") == -1){
			val += ".0";
		}
		return (val + "             ").substring(0, 10);
	}
	public String fullCellText(){
		return super.fullCellText();
	}
	public double getDoubleValue(){
		String value = getNumber();
		double number = Double.parseDouble(value);
		return number;
	}

}
