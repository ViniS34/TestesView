package Control;

import Model.Aluno;
import java.util.ArrayList;
public class AlunoControl {
	private final Aluno control;
	public AlunoControl() {
		this.control = new Aluno();
	}
	// Create
	public boolean Cadastrar(String curso, int fase, String nome, int idade) {
		// CONTROL NÃO DEVE ACESSAR DAO DIRETAMENTE.
		// Fluxo de dados entre as camadas: VIEW -> CONTROL -> MODEL -> DAO
		// O ID que será cadastrado deve vir diretamente da base de dados(DAO).
		int id = control.maiorID() + 1;
		// Criando um objeto completo de Aluno com os dados vindos de uma interface gráfica qualquer.
		Aluno objeto = new Aluno(curso, fase, id, nome, idade);
		// Controlador (objeto de Aluno) envia objeto completo para Aluno enviar para o DAO.
		if(control.InsertAlunoBD(objeto)){
			return true;
		}else{
			return false;
		}
	}
	// Update
	public boolean Editar(String curso, int fase, int id, String nome, int idade) {
		Aluno objeto = new Aluno(curso, fase, id, nome, idade);
		if(control.UpdateAlunoBD(id, objeto)){
			return true;
		}else{
			return false;
		}
	}
	// Delete
	public boolean Apagar(int id) {
		if(control.DeleteAlunoBD(id)){
			return true;
		}else{
			return false;
		}
	}
	// Read
	@SuppressWarnings("rawtypes")
	public ArrayList getMinhaLista() {
		return control.getMinhaLista();
	}
}

