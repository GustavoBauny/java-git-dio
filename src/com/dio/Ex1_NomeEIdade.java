package com.dio;
import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Digite o seu nome (digite '0' para encerrar o programa): ");
            nome = scan.next();
            if (nome.equals("0")) 
            break;

            System.out.println("Digite a sua idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Programa encerrado!");

    }
}
