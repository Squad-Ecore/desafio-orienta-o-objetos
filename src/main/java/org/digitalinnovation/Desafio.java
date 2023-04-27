package org.digitalinnovation;

import java.util.Random;
import java.util.Scanner;

public class Desafio {

    private int[] a;
    private int[] b;
    private int pontuacaoAna;
    private int pontuacaoBob;

    public Desafio() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1- Você deseja jogar manualmente\n2- Você deseja jogar aleatoriamente");
        int opcao = scan.nextInt();
        while (opcao < 1 || opcao > 2){
            opcao = scan.nextInt();
            System.out.println("Digite uma opção válida");
            System.out.println("1- Você deseja jogar manualmente\n 2- Você deseja jogar aleatoriamente");
        }
        if (opcao == 1) {
            vamosJogarManualmente();
        } else{
        vamosJogarAleatoriamente();
    }

}

    public void vamosJogarManualmente() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número de jogadas: limite 100");
        int numeroJogadas = scan.nextInt();
        while (numeroJogadas < 0 || numeroJogadas > 100) {
            System.out.println("Digite número inteiro válido");
            numeroJogadas = scan.nextInt();
        }

        this.a = new int[numeroJogadas];
        this.b = new int[numeroJogadas];
        int i = 1;
        for (int contador = 0; contador < numeroJogadas; contador++) {
            System.out.println("Jogada " + i + " de Ana: ");
            int jogadaAna = scan.nextInt();
            System.out.println("Jogada " + i + " do Bob: ");
            int jogadaBob = scan.nextInt();
            i++;

            a[contador] = jogadaAna;
            b[contador] = jogadaBob;

            if (a[contador] == b[contador]) {
            } else if (a[contador] > b[contador]) {
                pontuacaoAna++;
            } else {
                pontuacaoBob++;
            }
        }

        System.out.println("Resultado");
        System.out.println("A pontuação de Ana é: " + pontuacaoAna);
        System.out.println("A pontuação de Bob é: " + pontuacaoBob);
        if (pontuacaoAna == pontuacaoBob) {
            System.out.println("Os dois empataram");
        } else if (pontuacaoAna > pontuacaoBob) {
            System.out.println("Ana venceu!");
        } else {
            System.out.println("Bob venceu!");
        }

        System.out.println("Array de Ana: ");
        for (int mostra : a) {
            System.out.print(mostra + ", ");
        }
        System.out.println("\nArray de Bob: ");
        for (int mostra : b) {
            System.out.print(mostra + ", ");
        }


    }

    public void vamosJogarAleatoriamente() {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número de jogadas: limite 100");
        int numeroJogadas = scan.nextInt();
        while (numeroJogadas < 0 || numeroJogadas > 100) {
            System.out.println("Digite número inteiro válido");
            numeroJogadas = scan.nextInt();
        }
        this.a = new int[numeroJogadas];
        this.b = new int[numeroJogadas];

        for (int contador = 0; contador < numeroJogadas; contador++) {

            a[contador] = random.nextInt(100);
            b[contador] = random.nextInt(100);

            if (a[contador] == b[contador]) {
            } else if (a[contador] > b[contador]) {
                pontuacaoAna++;
            } else {
                pontuacaoBob++;
            }
        }

        System.out.println("Array de Ana: ");
        for (int mostra : a) {
            System.out.print(mostra + ", ");
        }
        System.out.println("\nArray de Bob: ");
        for (int mostra : b) {
            System.out.print(mostra + ", ");
        }

        System.out.println("\nResultado");
        System.out.println("A pontuação de Ana é: " + pontuacaoAna);
        System.out.println("A pontuação de Bob é: " + pontuacaoBob);
        if (pontuacaoAna == pontuacaoBob) {
            System.out.println("Os dois empataram");
        } else if (pontuacaoAna > pontuacaoBob) {
            System.out.println("Ana venceu!");
        } else {
            System.out.println("Bob venceu!");
        }

    }

}
