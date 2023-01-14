package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CouterView;

public class CouterListener implements ActionListener{

	private CouterView couterView;
	
	public CouterListener(CouterView couterView) {
		this.couterView = couterView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		
		if(src.equals("ONE"))
			this.couterView.updateToONE();
		else if(src.equals("TWO"))
			this.couterView.updateToTWO();
		else if(src.equals("THREE"))
			this.couterView.updateToTHREE();
		else if(src.equals("FOUR"))
			this.couterView.updateToFOUR();
	}
	
}
