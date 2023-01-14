package model;

public class CouterModel {
	private int value;

	public CouterModel() {
		this.value = 0;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void incresment() {
		this.value += 1;
	}
	
	public void decrement() {
		this.value -= 1;
	}
	
	public void reset() {
		this.value = 0;
	}
	
	
	
}
