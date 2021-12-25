package Model;
import java.util.*;
import DAO.AlunoDAO;
public class Aluno extends Pessoa {
	// Atributos
	private String curso;
	private int fase;
	// M�todo Construtor de Objeto Vazio
	public Aluno() {
	}
	// M�todo Construtor de Objeto, inserindo dados
	public Aluno(String curso, int fase) {
		this.curso = curso;
		this.fase = fase;
	}
	// M�todo Construtor usando tamb�m o construtor da SUPERCLASSE
	public Aluno(String curso, int fase, int id, String nome, int idade) {
		super(id, nome, idade);
		this.curso = curso;
		this.fase = fase;
	}
	// M�todos GET e SET
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getFase() {
		return fase;
	}
	public void setFase(int fase) {
		this.fase = fase;
	}
	// Retorna a Lista de Alunos(objetos)
	public ArrayList<Aluno> getMinhaLista() {
		return AlunoDAO.MinhaLista;
	}
	// Cadastra novo aluno
	public boolean InsertAlunoBD(Aluno objeto) {
		AlunoDAO.MinhaLista.add(objeto);
		return true;
	}
	// Deleta um aluno espec�fico pelo seu campo ID
	public boolean DeleteAlunoBD(int id) {
		int indice = this.procuraIndice(id);
		AlunoDAO.MinhaLista.remove(indice);
		return true;
	}
	// Edita um aluno espec�fico pelo seu campo ID
	public boolean UpdateAlunoBD(int id, Aluno objeto) {
		int indice = this.procuraIndice(id);
		AlunoDAO.MinhaLista.set(indice, objeto);
		return true;
	}
	// procura o INDICE de objeto da MinhaLista que
	// contem o ID enviado.
	private int procuraIndice(int id) {
		int indice = -1;
		for (int i = 0; i < AlunoDAO.MinhaLista.size(); i++) {
			if (AlunoDAO.MinhaLista.get(i).getId() == id) {
				indice = i;
			}
		}
		return indice;
	}
	// busca no DAO o maior ID da nossa base de dados
	public int maiorID(){
		return AlunoDAO.maiorID();
	}
}
