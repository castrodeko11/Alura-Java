package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Teste2 {
	public static void main(String[] args) {
		new Teste2();
	}

	public Teste2() {
	        EventQueue.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                try {
	                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
	                }

	                final JDialog dialog = new JDialog((Frame)null, "Boo");

	                JOptionPane op = new JOptionPane("ID da Execução: ", JOptionPane.INFORMATION_MESSAGE, JOptionPane.OK_OPTION);
	                op.addPropertyChangeListener(new PropertyChangeListener() {
	                    @Override
	                    public void propertyChange(PropertyChangeEvent evt) {
	                        String name = evt.getPropertyName();
	                        if ("value".equals(name)) {

	                            dialog.dispose();

	                        }
	                    }
	                });

	                dialog.setUndecorated(true);
	                dialog.setLayout(new BorderLayout());
	                dialog.add(op);
	                dialog.pack();
	                dialog.setLocationRelativeTo(null);
	                dialog.setVisible(true);
	            }
	        });
	    }

}
