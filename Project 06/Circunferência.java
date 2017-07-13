package org.Mont;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Circunferência extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
	double C,r,d;
	final double pi = 3.14;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Circunferência frame = new Circunferência();
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
	public Circunferência() {
		setTitle("Circunfer\u00EAncia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCircunferencia = new JButton("Calcular circunfer\u00EAncia");
		btnCircunferencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				r = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da circunferência : "));
				
				C = 2 * pi * r;
				
				JOptionPane.showMessageDialog(null,"A Circunferência equivale á : " + String.format("%.2f", C));
				
			}
		});
		btnCircunferencia.setBounds(59, 34, 189, 44);
		contentPane.add(btnCircunferencia);
		
		JButton btnRaio = new JButton("Calcular raio");
		btnRaio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C = Double.parseDouble(JOptionPane.showInputDialog("Qual o tamanho da circunferência ? "));
				
				r = C / 2 * pi;
				
				JOptionPane.showMessageDialog(null,"O raio da circunferência equivale á : " + String.format("%.2f", r));
			}
		});
		btnRaio.setBounds(59, 114, 189, 44);
		contentPane.add(btnRaio);
		
		JButton btnDiametro = new JButton("Calcular di\u00E2metro");
		btnDiametro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r = Double.parseDouble(JOptionPane.showInputDialog("Qual o tamanho do raio da circunferência ? "));
				
				d = 2 * r;
				
				JOptionPane.showMessageDialog(null,"O diâmetro da circunferência equivale á : " + d);
				
				
			}
		});
		btnDiametro.setBounds(59, 195, 189, 44);
		contentPane.add(btnDiametro);
	}
}
