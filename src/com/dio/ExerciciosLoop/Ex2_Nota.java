package com.dio.ExerciciosLoop;
import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Ex2_Nota {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite a sua nota: ");
            int nota = scan.nextInt();
            if (nota < 4){
                System.out.println("Sua nota é muito baixa! Estude mais!");
            }
            else if(nota > 5 && nota < 7){
                System.out.println("Sua nota é decente!");
            }
            else{
                System.out.println("Sua nota é ótima! Parabéns!");
            }

            while(nota < 0 || nota > 10){
                System.out.println("Nota Inválida! Digite uma nota entre 0 e 10: ");
                nota = scan.nextInt();
            }
        }
    }
}
