package gui;

import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Jmeter {
	public static void main(String[] args) {
//		Object[] options = { "Copiar Id da Execução" };
//
//		JOptionPane pane = new JOptionPane("ID da Execução", JOptionPane.INFORMATION_MESSAGE, JOptionPane.OK_OPTION,
//				null, options, options[0]);
//
//		JDialog dialog = pane.createDialog((Frame) null, "P4ALL");
//		dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
//		dialog.setVisible(true);
//		System.out.println(pane.getOptionType());

		Object[] options = { "OK" };

		JOptionPane pane = new JOptionPane(
				"Falha no Carregamento do Arquivo de Execução.\nColunas Pendentes: "
						.concat("Hostname,ResponseTime,Teste,Teste,Teste"),
				JOptionPane.ERROR_MESSAGE, JOptionPane.OK_OPTION, null, options, options[0]);

		JDialog dialog = pane.createDialog((Frame) null, "P4ALL");
		dialog.setVisible(true);
		System.out.println(pane.getOptionType());

	}

}
