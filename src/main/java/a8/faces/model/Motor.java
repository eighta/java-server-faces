package a8.faces.model;

public class Motor {

	private Integer value;
	
	public Motor(){
		this.value=24;
	}
	
	public String getErrorProblem() {
		return "no problem";
	}
	
	public boolean getError() {
		return !(((Integer)value ) > 10); 
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
