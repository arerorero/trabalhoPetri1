
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
                numero = scanner.nextInt();
                vetor.insere(numero);
          } if (resposta == 2) {
                numero = scanner.nextInt();
                vetor.remove(numero);
          } if (resposta == 3) {
                numero = scanner.nextInt();
                System.out.println(vetor.buscaElemento(numero));
          }
                
        }
        
    }
}
