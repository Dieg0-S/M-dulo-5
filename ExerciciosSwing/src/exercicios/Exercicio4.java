package exercicios;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Exercicio4 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Calcular Estatísticas");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 300);

        ArrayList<Integer> numeros = new ArrayList<>();

        JLabel maiorLabel = new JLabel("Maior: ");
        JLabel menorLabel = new JLabel("Menor: ");
        JLabel mediaLabel = new JLabel("Média: ");
        JTextField campoNumero = new JTextField(10);
        JButton botaoOk = new JButton("OK");
        JButton botaoExibir = new JButton("Exibir");

        botaoOk.addActionListener(e -> {
            try {
                int numero = Integer.parseInt(campoNumero.getText());
                numeros.add(numero);
                campoNumero.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(janela, "Digite um número válido!");
            }
        });

        botaoExibir.addActionListener(e -> {
            if (!numeros.isEmpty()) {
                int maior = numeros.stream().max(Integer::compareTo).orElse(0);
                int menor = numeros.stream().min(Integer::compareTo).orElse(0);
                double media = numeros.stream().mapToInt(Integer::intValue).average().orElse(0.0);

                maiorLabel.setText("Maior: " + maior);
                menorLabel.setText("Menor: " + menor);
                mediaLabel.setText("Média: " + media);
            } else {
                JOptionPane.showMessageDialog(janela, "Nenhum número foi digitado!");
            }
        });

        JPanel painelEntrada = new JPanel();
        painelEntrada.add(new JLabel("Número: "));
        painelEntrada.add(campoNumero);
        painelEntrada.add(botaoOk);

        JPanel painelResultados = new JPanel(new GridLayout(3, 1));
        painelResultados.add(maiorLabel);
        painelResultados.add(menorLabel);
        painelResultados.add(mediaLabel);

        janela.add(painelEntrada, "North");
        janela.add(painelResultados, "Center");
        janela.add(botaoExibir, "South");

        janela.setVisible(true);
    }
}
