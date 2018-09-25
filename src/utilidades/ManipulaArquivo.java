package utilidades;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class ManipulaArquivo {
	
	public void gravaObjeto(Object obj, String caminho) {
		
		try {
			
			ObjectOutputStream saida = new ObjectOutputStream(
					new FileOutputStream(caminho));
			
			saida.writeObject(obj);
			saida.flush();
			saida.close();
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, 
					"Arquivo ou Diretório não encontrado!");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, 
					"Problemas ao criar stream");
		}
		
	}
	
	public Object lerObjeto(String caminho) {
		
		Object obj = null;
		
		try {
			
			ObjectInputStream entrada = new ObjectInputStream(
					new FileInputStream(caminho));
			
			obj = entrada.readObject();
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, 
					"Arquivo ou diretório não encontrado!");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, 
					"Problemas ao criar stream.");
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, 
					"Problemas ao ler objeto.");
		}
		
		return obj;
		
	}

}













