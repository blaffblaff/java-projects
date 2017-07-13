package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controll.Controller;
import model.Funcionario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FormFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	public JTextField txtNome;
	private JButton btnCadastrar;
	private JButton btnNewButton;
	private JButton btnSair;
	private JButton btnListar;
	private JButton btnExcluir;
	private JButton btnAlterar;
	private JScrollPane spLista;
	public JTable tblLista;
	public DefaultTableModel modelo;
	private static Controller ctrl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormFuncionario frame = new FormFuncionario();
					frame.setVisible(true);
					ctrl = new Controller(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormFuncionario() {
		setTitle("Funcionario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(22, 18, 46, 14);
		contentPane.add(lblId);

		txtId = new JTextField();
		txtId.setBounds(78, 8, 86, 34);
		contentPane.add(txtId);
		txtId.setColumns(10);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(22, 63, 46, 14);
		contentPane.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(78, 53, 136, 34);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, ctrl.incluir());
				limpar();
				ctrl.listar();
			}
		});
		btnCadastrar.setBounds(22, 122, 106, 40);
		contentPane.add(btnCadastrar);

		btnNewButton = new JButton("Consultar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ctrl.consultar()) {
					ctrl.consultar();
				} else {
					limpar();
					JOptionPane.showMessageDialog(null, "Id não localizado");
				}

			}
		});
		btnNewButton.setBounds(138, 122, 106, 40);
		contentPane.add(btnNewButton);

		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object[] options = { "Sim", "Não" };
				int op = JOptionPane.showOptionDialog(null,
						"Deseja realmente sair ?", "Informação",
						JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE,
						null, options, options[0]);

				if (op == 0) {
					System.exit(0);
				} else {
					JOptionPane.showMessageDialog(null,
							"Continue sua aplicação!", "Informação",
							JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
		btnSair.setBounds(254, 122, 106, 40);
		contentPane.add(btnSair);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
				ctrl.listar();
			}
		});
		btnListar.setBounds(254, 173, 106, 40);
		contentPane.add(btnListar);

		btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, ctrl.excluir());
				limpar();
				ctrl.listar();
			}
		});
		btnExcluir.setBounds(138, 173, 106, 40);
		contentPane.add(btnExcluir);

		btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, ctrl.alterar());
				limpar();
				ctrl.listar();
			}
		});
		btnAlterar.setBounds(22, 173, 106, 40);
		contentPane.add(btnAlterar);

		spLista = new JScrollPane();
		spLista.setBounds(22, 238, 338, 214);
		contentPane.add(spLista);

		modelo = new DefaultTableModel();
		modelo.addColumn("ID");
		modelo.addColumn("NOME");
		tblLista = new JTable(modelo);
		tblLista.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				setFuncionarioForm(ctrl.exibirFuncionario());
			}
		});

		// tblLista = new JTable();
		spLista.setViewportView(tblLista);

	}

	private void limpar() {
		this.txtNome.setText("");
		this.txtId.setText("");
		modelo.setRowCount(0);
	}

	public Funcionario getFuncionarioForm() {
		Funcionario func = new Funcionario();
		func.setId(Integer.parseInt(txtId.getText()));
		func.setNome(txtNome.getText());
		return func;
	}

	public void setFuncionarioForm(Funcionario func) {
		this.txtId.setText(String.valueOf(func.getId()));
		this.txtNome.setText(func.getNome());
	}

}
