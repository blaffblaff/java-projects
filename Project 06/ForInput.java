package org.Mont;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ForInput extends JFrame {
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForInput frame = new ForInput();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ForInput() {
		setTitle("For - Input");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 270);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite um n\u00FAmero : ");
		lblNewLabel.setBounds(10, 31, 100, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblDigiteUmNmero = new JLabel("Digite um n\u00FAmero : ");
		lblDigiteUmNmero.setBounds(10, 68, 100, 14);
		getContentPane().add(lblDigiteUmNmero);
		
		txtN1 = new JTextField();
		txtN1.setBounds(147, 28, 122, 20);
		getContentPane().add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setColumns(10);
		txtN2.setBounds(147, 65, 122, 20);
		getContentPane().add(txtN2);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int x,y;
				
				x = Integer.parseInt(txtN1.getText());
				y = Integer.parseInt(txtN2.getText());
				
				for(int z = x; z < y; z++) {
					JOptionPane.showMessageDialog(null,"Número atual : " + z + "\nNúmero a se chegar : " + y);
				}
				
				txtN1.setText("");
				txtN2.setText("");
				txtN1.requestFocus();
			}
		});
		btnCalc.setBounds(163, 147, 106, 35);
		getContentPane().add(btnCalc);
	}
}
