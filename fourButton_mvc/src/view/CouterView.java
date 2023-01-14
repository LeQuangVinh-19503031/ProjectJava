package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CouterListener;
import model.CouterModel;

public class CouterView extends JFrame{
	private CouterModel couterModel;
	private JButton jButton1, jButton2, jButton3, jButton4;
	private JLabel jLabel;
	public CouterView() {
		this.couterModel = new CouterModel();
		this.init();
		this.setVisible(true);
	}
	
	public void init() {
		
		this.setTitle("Choose One In Four");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener action = new CouterListener(this);
		
		jButton1 = new JButton("ONE");
		jButton1.addActionListener(action);
		jButton2 = new JButton("TWO");
		jButton2.addActionListener(action);
		jButton3 = new JButton("THREE");
		jButton3.addActionListener(action);
		jButton4 = new JButton("FOUR");
		jButton4.addActionListener(action);
		jLabel = new JLabel("THE LAST SELECTION: ", JLabel.CENTER);
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(2,2));
		jPanel.add(jButton1);
		jPanel.add(jButton2);
		jPanel.add(jButton3);
		jPanel.add(jButton4);
		
		JPanel jPanel2 = new JPanel();
		jPanel2.setLayout(new BorderLayout());
		jPanel2.add(jPanel, BorderLayout.CENTER);
		jPanel2.add(jLabel, BorderLayout.SOUTH);
		
		this.add(jPanel2);
	}
	
	public void updateToONE() {
		this.couterModel.isOne();
		this.jLabel.setText("THE LAST SELECTION: "+this.couterModel.getValue());
	}
	public void updateToTWO() {
		this.couterModel.isTwo();
		this.jLabel.setText("THE LAST SELECTION: "+this.couterModel.getValue());
	}
	public void updateToTHREE() {
		this.couterModel.isThree();
		this.jLabel.setText("THE LAST SELECTION: "+this.couterModel.getValue());
	}
	public void updateToFOUR() {
		this.couterModel.isFour();
		this.jLabel.setText("THE LAST SELECTION: "+this.couterModel.getValue());
	}
	
}
