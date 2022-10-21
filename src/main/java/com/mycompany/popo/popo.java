package com.mycompany.popo;

import java.util.Scanner;

public class popo {
    
    public static void menu() {
        System.out.println("1 - Inserir Numero");
        System.out.println("2 - Remover Numero");
        System.out.println("3 - Buscar Elemento");
        System.out.println("9 - Sair");        
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,resposta=0,numero;
        System.out.println("DÊ O TAMANHO DO VETOR: ");
        x = scanner.nextInt();
        Vetor vetor = new Vetor(x);
        for (; resposta != 9;) {
           menu();
           resposta = scanner.nextInt();
            if (resposta == 1) {
                System.out.println("Digite o Numero para ser inserido: ");
                numero = scanner.nextInt();
                vetor.insere(numero);
                System.out.println("Numero "+ numero+" foi inserido");
          } if (resposta == 2) {
                System.out.println("Digite de qual casa você quer remover o numero:");
                numero = scanner.nextInt();
                vetor.remove(numero);
          } if (resposta == 3) {
                System.out.println("Digite de qual casa você quer ver o numero:");
                numero = scanner.nextInt();
                System.out.println("O numero da casa: "+numero+ " é "+vetor.buscaElemento(numero));
          }
                
        }
        System.out.println("FIM");
        
    }
}
