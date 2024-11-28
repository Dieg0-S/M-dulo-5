package exercicios;

import javax.swing.*;
import java.awt.*;

public class Exercicio6 {
    public static void main(String[] args) {
        // Criar a janela principal
        JFrame janela = new JFrame("Formulário de Cadastro");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(500, 600);
        janela.setLayout(new BorderLayout());

        // Criar painel para os campos
        JPanel painelPrincipal = new JPanel(new GridLayout(12, 2, 5, 5));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Campos de texto
        JTextField campoNome = new JTextField();
        JTextField campoEndereco = new JTextField();
        JTextField campoCidade = new JTextField();
        JTextArea campoObservacao = new JTextArea(3, 20);

        // Botões de seleção para Sexo
        JRadioButton radioMasculino = new JRadioButton("Masculino");
        JRadioButton radioFeminino = new JRadioButton("Feminino");
        ButtonGroup grupoSexo = new ButtonGroup();
        grupoSexo.add(radioMasculino);
        grupoSexo.add(radioFeminino);

        // ComboBox para Estado
        String[] estados = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
        JComboBox<String> comboEstado = new JComboBox<>(estados);

        // CheckBoxes para Cursos
        JCheckBox curso1 = new JCheckBox("Curso 1");
        JCheckBox curso2 = new JCheckBox("Curso 2");
        JCheckBox curso3 = new JCheckBox("Curso 3");

        // CheckBoxes para Interesses
        JCheckBox interesseRedes = new JCheckBox("Redes");
        JCheckBox interesseInternet = new JCheckBox("Internet");
        JCheckBox interesseCompiladores = new JCheckBox("Compiladores");
        JCheckBox interesseSeguranca = new JCheckBox("Segurança");
        JCheckBox interesseBD = new JCheckBox("BD");

        // Adicionar componentes ao painel principal
        painelPrincipal.add(new JLabel("Nome:"));
        painelPrincipal.add(campoNome);

        painelPrincipal.add(new JLabel("Endereço:"));
        painelPrincipal.add(campoEndereco);

        painelPrincipal.add(new JLabel("Cidade:"));
        painelPrincipal.add(campoCidade);

        painelPrincipal.add(new JLabel("Sexo:"));
        JPanel painelSexo = new JPanel();
        painelSexo.add(radioMasculino);
        painelSexo.add(radioFeminino);
        painelPrincipal.add(painelSexo);

        painelPrincipal.add(new JLabel("Estado:"));
        painelPrincipal.add(comboEstado);

        painelPrincipal.add(new JLabel("Cursos:"));
        JPanel painelCursos = new JPanel();
        painelCursos.add(curso1);
        painelCursos.add(curso2);
        painelCursos.add(curso3);
        painelPrincipal.add(painelCursos);

        painelPrincipal.add(new JLabel("Interesses:"));
        JPanel painelInteresses = new JPanel();
        painelInteresses.add(interesseRedes);
        painelInteresses.add(interesseInternet);
        painelInteresses.add(interesseCompiladores);
        painelInteresses.add(interesseSeguranca);
        painelInteresses.add(interesseBD);
        painelPrincipal.add(painelInteresses);

        painelPrincipal.add(new JLabel("Observações:"));
        painelPrincipal.add(new JScrollPane(campoObservacao));

        // Botões
        JButton botaoInserir = new JButton("Inserir");
        JButton botaoExibir = new JButton("Exibir");

        // Painel para os botões
        JPanel painelBotoes = new JPanel();
        painelBotoes.add(botaoInserir);
        painelBotoes.add(botaoExibir);

        // Adicionar os painéis à janela
        janela.add(painelPrincipal, BorderLayout.CENTER);
        janela.add(painelBotoes, BorderLayout.SOUTH);

        // Ação do botão Inserir
        botaoInserir.addActionListener(e -> {
            JOptionPane.showMessageDialog(janela, "Dados salvos com sucesso!");
        });

        // Ação do botão Exibir
        botaoExibir.addActionListener(e -> {
            StringBuilder dados = new StringBuilder();

            // Coletar os dados preenchidos
            dados.append("Nome: ").append(campoNome.getText()).append("\n");
            dados.append("Endereço: ").append(campoEndereco.getText()).append("\n");
            dados.append("Cidade: ").append(campoCidade.getText()).append("\n");
            dados.append("Sexo: ").append(radioMasculino.isSelected() ? "Masculino" : radioFeminino.isSelected() ? "Feminino" : "Não informado").append("\n");
            dados.append("Estado: ").append(comboEstado.getSelectedItem()).append("\n");
            dados.append("Cursos: ");
            if (curso1.isSelected()) dados.append("Curso 1 ");
            if (curso2.isSelected()) dados.append("Curso 2 ");
            if (curso3.isSelected()) dados.append("Curso 3 ");
            dados.append("\nInteresses: ");
            if (interesseRedes.isSelected()) dados.append("Redes ");
            if (interesseInternet.isSelected()) dados.append("Internet ");
            if (interesseCompiladores.isSelected()) dados.append("Compiladores ");
            if (interesseSeguranca.isSelected()) dados.append("Segurança ");
            if (interesseBD.isSelected()) dados.append("BD ");
            dados.append("\nObservações: ").append(campoObservacao.getText());

            // Mostrar os dados em uma nova janela
            JOptionPane.showMessageDialog(janela, dados.toString());
        });

        // Tornar a janela visível
        janela.setVisible(true);
    }
}

