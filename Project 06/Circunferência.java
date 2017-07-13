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

public class Circunfer�ncia extends JFrame {

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
					Circunfer�ncia frame = new Circunfer�ncia();
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
	public Circunfer�ncia() {
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
				r = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da circunfer�ncia : "));
				
				C = 2 * pi * r;
				
				JOptionPane.showMessageDialog(null,"A Circunfer�ncia equivale � : " + String.format("%.2f", C));
				
			}
		});
		btnCircunferencia.setBounds(59, 34, 189, 44);
		contentPane.add(btnCircunferencia);
		
		JButton btnRaio = new JButton("Calcular raio");
		btnRaio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C = Double.parseDouble(JOptionPane.showInputDialog("Qual o tamanho da circunfer�ncia ? "));
				
				r = C / 2 * pi;
				
				JOptionPane.showMessageDialog(null,"O raio da circunfer�ncia equivale � : " + String.format("%.2f", r));
			}
		});
		btnRaio.setBounds(59, 114, 189, 44);
		contentPane.add(btnRaio);
		
		JButton btnDiametro = new JButton("Calcular di\u00E2metro");
		btnDiametro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r = Double.parseDouble(JOptionPane.showInputDialog("Qual o tamanho do raio da circunfer�ncia ? "));
				
				d = 2 * r;
				
				JOptionPane.showMessageDialog(null,"O di�metro da circunfer�ncia equivale � : " + d);
				
				
			}
		});
		btnDiametro.setBounds(59, 195, 189, 44);
		contentPane.add(btnDiametro);
	}
}
