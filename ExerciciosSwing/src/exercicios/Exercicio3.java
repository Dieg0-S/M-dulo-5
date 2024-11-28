package exercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio3 {
    public static void main(String[] args) {
        //janela principal
        JFrame janela = new JFrame("Inserir e Mostrar Mensagem");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 200);

        // componentes
        JLabel labelInstrucao = new JLabel("Digite uma mensagem:");
        JTextField campoTexto = new JTextField(20); // Campo para entrada de texto
        JButton botaoEnviar = new JButton("Enviar");

        // ação ao botão
        botaoEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensagem = campoTexto.getText(); // Obtém o texto
                if (!mensagem.isEmpty()) {
                    // Mostra a mensagem digitada
                    JOptionPane.showMessageDialog(janela, "Você escreveu: " + mensagem);
                } else {
                    JOptionPane.showMessageDialog(janela, "Por favor, insira uma mensagem antes de enviar!");
                }
            }
        });

        // layout da janela
        JPanel painel = new JPanel();
        painel.add(labelInstrucao);
        painel.add(campoTexto);
        painel.add(botaoEnviar);

        // painel na janela
        janela.add(painel, BorderLayout.CENTER);

        // janela visível
        janela.setVisible(true);
    }
}
