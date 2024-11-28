package exercicios;

import javax.swing.*;

public class Exercicio5{
    public static void main(String[] args) {
        JFrame janela = new JFrame("Somar ou Multiplicar");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300, 200);

        JTextField campoValores = new JTextField(10);
        String[] opcoes = {"Somar", "Multiplicar"};
        JComboBox<String> comboBox = new JComboBox<>(opcoes);
        JButton botaoCalcular = new JButton("Calcular");
        JLabel resultado = new JLabel("Resultado: ");

        botaoCalcular.addActionListener(e -> {
            String entrada = campoValores.getText();
            if (entrada.length() == 2) {
                try {
                    int num1 = Character.getNumericValue(entrada.charAt(0));
                    int num2 = Character.getNumericValue(entrada.charAt(1));
                    String operacao = (String) comboBox.getSelectedItem();

                    if ("Somar".equals(operacao)) {
                        resultado.setText("Resultado: " + (num1 + num2));
                    } else if ("Multiplicar".equals(operacao)) {
                        resultado.setText("Resultado: " + (num1 * num2));
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(janela, "Entrada inválida!");
                }
            } else {
                JOptionPane.showMessageDialog(janela, "Digite exatamente dois números!");
            }
        });

        JPanel painel = new JPanel();
        painel.add(new JLabel("Valores: "));
        painel.add(campoValores);
        painel.add(comboBox);
        painel.add(botaoCalcular);

        janela.add(painel, "Center");
        janela.add(resultado, "South");

        janela.setVisible(true);
    }
}
