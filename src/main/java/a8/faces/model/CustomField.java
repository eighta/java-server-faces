package a8.faces.model;

public class CustomField {
	private String txt;
	private Integer number;
	private CustomField(Integer number, String txt) {
		this.number=number;
		this.txt=txt;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
	public static CustomField of(Integer number, String txt) {
		return new CustomField(number,txt);
	}
}
