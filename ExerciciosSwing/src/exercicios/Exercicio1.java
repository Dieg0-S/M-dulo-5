package exercicios;

import javax.swing.*;
import java.awt.*;

public class Exercicio1 {
	    public static void main(String[] args) {
	        // Código do exercício aqui
	        JFrame frame = new JFrame("Mudar Cor do Painel");
	        JPanel panel = new JPanel();
	        panel.setPreferredSize(new Dimension(300, 200));

	        JButton btnAmarelo = new JButton("Amarelo");
	        JButton btnVerde = new JButton("Verde");
	        JButton btnAzul = new JButton("Azul");

	        btnAmarelo.addActionListener(e -> panel.setBackground(Color.YELLOW));
	        btnVerde.addActionListener(e -> panel.setBackground(Color.GREEN));
	        btnAzul.addActionListener(e -> panel.setBackground(Color.BLUE));

	        JPanel buttonPanel = new JPanel();
	        buttonPanel.add(btnAmarelo);
	        buttonPanel.add(btnVerde);
	        buttonPanel.add(btnAzul);

	        frame.setLayout(new BorderLayout());
	        frame.add(panel, BorderLayout.CENTER);
	        frame.add(buttonPanel, BorderLayout.SOUTH);

	        frame.pack();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}


