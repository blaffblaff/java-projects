package org.Mont;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ConversaoMoeda extends JFrame {

	private JPanel contentPane;
	private JTextField txtValorInicial;
	private JTextField txtCotacaoDolar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversaoMoeda frame = new ConversaoMoeda();
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
	public ConversaoMoeda() {
		setTitle("Convers\u00E3o de moedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtValorInicial = new JTextField();
		txtValorInicial.setBounds(115, 21, 108, 20);
		contentPane.add(txtValorInicial);
		txtValorInicial.setColumns(10);
		
		txtCotacaoDolar = new JTextField();
		txtCotacaoDolar.setColumns(10);
		txtCotacaoDolar.setBounds(115, 52, 108, 20);
		contentPane.add(txtCotacaoDolar);
		
		JLabel lblNewLabel = new JLabel("Valor inicial");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 24, 85, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCotaoDoDolar = new JLabel("Cota\u00E7\u00E3o do dolar");
		lblCotaoDoDolar.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCotaoDoDolar.setBounds(10, 55, 97, 14);
		contentPane.add(lblCotaoDoDolar);
		
		JLabel lblConverterPara = new JLabel("Converter p/");
		lblConverterPara.setBounds(128, 94, 73, 14);
		contentPane.add(lblConverterPara);
		lblConverterPara.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JRadioButton rdbRealConversao = new JRadioButton("Real");
		rdbRealConversao.setBounds(137, 126, 47, 23);
		contentPane.add(rdbRealConversao);
		
		JRadioButton rdbDolarConversao = new JRadioButton("D\u00F3lar");
		rdbDolarConversao.setBounds(10, 155, 51, 23);
		contentPane.add(rdbDolarConversao);
		
		JRadioButton rdbDolar = new JRadioButton("D\u00F3lar");
		rdbDolar.setBounds(137, 155, 64, 23);
		contentPane.add(rdbDolar);
		
		JRadioButton rdbReal = new JRadioButton("Real");
		rdbReal.setBounds(10, 126, 59, 23);
		contentPane.add(rdbReal);
		
		JLabel lblMoeda = new JLabel("Moeda");
		lblMoeda.setBounds(10, 94, 46, 14);
		contentPane.add(lblMoeda);
		lblMoeda.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double valor,cotacao,res;
				
				valor = Double.parseDouble(txtValorInicial.getText());
				cotacao = Double.parseDouble(txtCotacaoDolar.getText());
				
				if(rdbDolar.isSelected() && rdbRealConversao.isSelected()) { 
					
					
					res = valor * cotacao;
					
					JOptionPane.showMessageDialog(null, "O valor do Dólar em reais é de : " + String.format("%.2f",res) ,"Informação",JOptionPane.INFORMATION_MESSAGE);
					
				}
				
				else if(rdbReal.isSelected() && rdbDolarConversao.isSelected()) { 
					
					res = (valor / cotacao);
					
					JOptionPane.showMessageDialog(null, "O valor do Real em dólares é de : " + String.format("%.2f",res) ,"Informação",JOptionPane.INFORMATION_MESSAGE);
					
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Escolha os devidos botões para realizar a conversão da(s) moeda(s)!","Erro",JOptionPane.CANCEL_OPTION);
				}
				
				
				
			}
		});
		btnConverter.setBounds(77, 199, 97, 28);
		contentPane.add(btnConverter);
		

	}
}
