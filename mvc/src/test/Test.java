package test;

import javax.swing.UIManager;
import view.Couterview;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			Couterview couterview = new Couterview();
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
}
