package com.mycompany.popo;

public class Vetor {
    int tamanho;
    int vetor [];
    
    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        this.vetor = new int [this.tamanho];
    }
    
    public void insere(int valor) {
        for (int i = 0; i != tamanho+1; i++) {
            if (this.vetor[i] == 0){
                this.vetor[i] = valor;
                break;
            }
        }
    }
    
    public void remove(int posicao) {
        this.vetor[posicao-1] = 0;
        int casa = posicao-1;
        for (int i = 0; i < this.tamanho-1; i++) {
            if (this.vetor[casa+1] != 0 && this.vetor[casa] == 0){  //arrumar rebobinação da ordem de elementos
                this.vetor[casa] = this.vetor[casa+1];
                this.vetor[casa+1] = 0;
            }   
        }
    }
    
    public int buscaElemento(int posicao) {
    return this.vetor[posicao-1];
    }
    
    
}
