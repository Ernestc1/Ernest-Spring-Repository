package textExcel;

public class FormulaCell extends RealCell{
	private String formula;
	public FormulaCell (String input){
		super(input);
	}
	public String abbreviatedCellText(){
		getDoubleValue();
		return ("               ").substring(0, 10);
	}
	public String fullCellText(){
		return super.fullCellText();
	}
	public double getDoubleValue(){
		formula.substring(1, formula.length()-1);
		double result = 0.0;
		String [] splitFormula = formula.split(" ");
		for(int i = 0; i < splitFormula.length; i++){
			if(splitFormula[i + 2].equals(("*"))){
				double firstNum = Double.parseDouble(splitFormula[i + 1]);
				double secondNum = Double.parseDouble(splitFormula[i + 3]);
				result = firstNum * secondNum;
			} else if (splitFormula[i + 2].equals(("+"))){
				double firstNum = Double.parseDouble(splitFormula[i + 1]);
				double secondNum = Double.parseDouble(splitFormula[i + 3]);
				result = firstNum + secondNum;
			} 
		}
		
		return 0.0;
	}
	
}
