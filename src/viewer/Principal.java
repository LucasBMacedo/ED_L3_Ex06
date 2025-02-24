package viewer;

import javax.swing.JOptionPane;

import controller.SomaNRecursiva; 

public class Principal {

	public static void main(String[] args) {
		SomaNRecursiva snr = new SomaNRecursiva();
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro"));
		int i = 0;
		JOptionPane.showMessageDialog(null, " O resultado da expressao é: " + snr.SomaNRec(n, i) + ".");
	}
}