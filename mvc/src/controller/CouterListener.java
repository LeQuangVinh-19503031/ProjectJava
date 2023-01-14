package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Couterview;

public class CouterListener implements ActionListener {

	private Couterview ctv;

	public CouterListener(Couterview ctv) {
		this.ctv = ctv;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		
		if(src.equals("Up"))
			this.ctv.increment();
		else if(src.equals("Down"))
			this.ctv.decrement();
		else if(src.equals("Reset"))
			this.ctv.reset();
	}
	
}
