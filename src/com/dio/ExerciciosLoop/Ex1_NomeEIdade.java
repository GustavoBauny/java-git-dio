package com.dio.ExerciciosLoop;
import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
         
            while(true) {
                System.out.println("Digite o seu nome (digite '0' para encerrar o programa): ");
               String nome = scan.next();
                if (nome.equals("0")) 
                break;

                System.out.println("Digite a sua idade: ");
                int idade = scan.nextInt();
                if (idade < 18){
                    System.out.println("Idade deve ser maior que 18!");
                    break;
                }
            }
        }

        System.out.println("Programa encerrado!");

    }
}
