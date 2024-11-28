package exercicios;

import javax.swing.*;

public class Exercicio2 {
    public static void main(String[] args) {
        // Criar a janela principal
        JFrame janela = new JFrame("Modificar Texto do JLabel");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 200);

        // Criar um JLabel
        JLabel label = new JLabel("Texto original", SwingConstants.CENTER);

        // Criar botões
        JButton botaoJava = new JButton("Java");
        JButton botaoPython = new JButton("Python");
        JButton botaoC = new JButton("C");

        // Adicionar ações aos botões
        botaoJava.addActionListener(e -> label.setText("Java"));
        botaoPython.addActionListener(e -> label.setText("Python"));
        botaoC.addActionListener(e -> label.setText("C"));

        // Criar painel para os botões
        JPanel painelBotoes = new JPanel();
        painelBotoes.add(botaoJava);
        painelBotoes.add(botaoPython);
        painelBotoes.add(botaoC);

        // Adicionar componentes à janela
        janela.add(label, "Center");
        janela.add(painelBotoes, "South");

        // Mostrar a janela
        janela.setVisible(true);
    }
}
