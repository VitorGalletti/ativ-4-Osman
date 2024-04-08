package ativ;
//Camada de Negócio
class Armazenamento {
    private Dado[] vetor;

    public Armazenamento(int tamanho) {
        vetor = new Dado[tamanho];
    }

    public void adicionarDado(int indice, Dado dado) {
        vetor[indice] = dado;
    }

    public Dado obterDado(int indice) {
        return vetor[indice];
    }
}