package controll;

import java.util.ArrayList;
import model.Funcionario;
import persist.FuncionarioDAO;
import view.FormFuncionario;

public class Controller {

	private FuncionarioDAO funcDAO;
	private Funcionario func;
	private FormFuncionario form;

	public Controller() {

	}

	public Controller(FormFuncionario form) {
		funcDAO = new FuncionarioDAO();
		func = new Funcionario();
		this.form = form;
	}

	public void listar() {
		ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
		lista = (ArrayList<Funcionario>) funcDAO.listar();
		for (int i = 0; i < lista.size(); i++) {
			func = (Funcionario) lista.get(i);
			form.modelo.addRow(new Object[] { new Integer(func.getId()),
					func.getNome() });
		}
	}

	public String incluir() {
		func.setNome(form.txtNome.getText());
		return funcDAO.incluir(func);
	}

	public boolean consultar() {
		func = form.getFuncionarioForm();
		func = funcDAO.pesquisarId(func);
		if (func == null) {
			return false;
		} else {
			form.setFuncionarioForm(func);
			return true;
		}
	}

	public String alterar() {
		func = form.getFuncionarioForm();
		return funcDAO.alterar(func);
	}

	public String excluir() {
		func = form.getFuncionarioForm();
		return funcDAO.excluir(func);
	}

	public Funcionario exibirFuncionario() {
		func = new Funcionario();
		int row = form.tblLista.getSelectedRow();
		func.setId((Integer) form.tblLista.getValueAt(row, 0));
		func.setNome((String) form.tblLista.getValueAt(row, 1));
		return func;
	}

}
