package model;

public class CouterModel {
	private String value;

	public CouterModel() {
		this.value = "";
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public void isOne() {
		this.value = "ONE";
	}
	
	public void isTwo() {
		this.value = "TWO";
	}
	public void isThree() {
		this.value = "THREE";
	}
	public void isFour() {
		this.value = "FOUR";
	}
}
