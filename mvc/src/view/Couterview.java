package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CouterListener;
import model.CouterModel;

public class Couterview extends JFrame {
	
	private CouterModel couterModel;
	private JButton jButton_Up, jButton_Down;
	private JLabel jLabel_Value;
	
	public Couterview() {
		this.couterModel = new CouterModel();
		this.init();
		this.setVisible(true);
	}
	
	public void init() {
		this.setTitle("Couter");
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener action = new CouterListener(this);
		
		jButton_Up = new JButton("Up");
		jButton_Up.setFont(new Font("Time New Romas", Font.BOLD, 20));
		jButton_Up.addActionListener(action);
		
		jButton_Down = new JButton("Down");
		jButton_Down.setFont(new Font("Time New Romas", Font.BOLD, 20));
		jButton_Down.addActionListener(action);
		
		JButton jButton_Reset = new JButton("Reset");
		jButton_Reset.setFont(new Font("SansSerif", Font.BOLD, 20));
		jButton_Reset.addActionListener(action);
		
		jLabel_Value = new JLabel(couterModel.getValue()+"", JLabel.CENTER);
		jLabel_Value.setFont(new Font("Time New Romas", Font.BOLD, 20));
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.setBackground(Color.DARK_GRAY);
		jPanel.add(jButton_Up, BorderLayout.NORTH);
		jPanel.add(jButton_Down, BorderLayout.SOUTH);
		jPanel.add(jButton_Reset, BorderLayout.EAST);
		jPanel.add(jLabel_Value, BorderLayout.CENTER);
		this.add(jPanel);
	}
	
	public void increment() {
		this.couterModel.incresment();
		this.jLabel_Value.setText(""+this.couterModel.getValue());
	}
	
	public void decrement() {
		this.couterModel.decrement();
		this.jLabel_Value.setText(""+this.couterModel.getValue());
	}
	
	public void reset() {
		this.couterModel.reset();
		this.jLabel_Value.setText(""+this.couterModel.getValue());
	}
	
	
}
