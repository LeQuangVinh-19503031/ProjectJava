package test;

import javax.swing.UIManager;

import view.CouterView;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			CouterView couterview = new CouterView();
		}catch (Exception e) {
			e.getStackTrace();
		};
	}
}
