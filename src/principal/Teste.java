package principal;

import javax.swing.JOptionPane;

import modelo.Aluno;
import utilidades.ManipulaArquivo;

public class Teste {

	public static void main(String[] args) {

		ManipulaArquivo manipulador = new ManipulaArquivo();
		
		String caminho = "c:\\java\\objeto.obj";
		
		//Aluno aluno = new Aluno();
		//aluno.setNome("Marcia da Silva");
		//aluno.setMatricula("abc123");
		//aluno.setEmail("marcinha@pop100.com.br");
		
		//manipulador.gravaObjeto(aluno, caminho);
		
		Aluno recuperado = (Aluno) manipulador.lerObjeto(caminho);

		JOptionPane.showMessageDialog(null, recuperado.getNome());
		
	}

}







