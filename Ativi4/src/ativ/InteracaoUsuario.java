package ativ;

import javax.swing.JOptionPane;

//Camada de Visão
public class InteracaoUsuario {
    public static void main(String[] args) {
        int tamanhoVetor = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
        Armazenamento armazenamento = new Armazenamento(tamanhoVetor);

        for (int i = 0; i < tamanhoVetor; i++) {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição " + i + ":"));
            Dado dado = new Dado(valor);
            armazenamento.adicionarDado(i, dado);
        }

        StringBuilder mensagem = new StringBuilder("Valores armazenados:\n");
        for (int i = 0; i < tamanhoVetor; i++) {
            mensagem.append("Posição ").append(i).append(": ").append(armazenamento.obterDado(i).getValor()).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}
