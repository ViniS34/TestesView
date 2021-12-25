/*
Aqui vamos simular a persistência de dados.
Nas próximas aulas nós vamos reprogramar esta classe para conectar-se com o banco de dados.
*/
package DAO;
import Model.Aluno;
import java.util.*;
public class AlunoDAO {
	// simula a base de dados
	public static ArrayList<Aluno> MinhaLista = new ArrayList<Aluno>();
	// método que fornece o maior CAMPO ID dentro da nossa base de dados
	public static int maiorID() {
		int maiorID = 0;
		for (int i = 0; i < MinhaLista.size(); i++) {
			if (MinhaLista.get(i).getId() > maiorID) {
				maiorID = MinhaLista.get(i).getId();
			}
		}
		return maiorID;
	}
}