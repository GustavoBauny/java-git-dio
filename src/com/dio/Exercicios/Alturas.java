package com.dio.Exercicios;

import java.util.Scanner;

/*
Implementar um programa capaz de ler a altura de 10 atletas e retornar a maior altura.
*/
public class Alturas {
   public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
        double maior = 0;
        for (int i = 1; i <= 10; i++){
            System.out.println("Digite a altura: ");
             double alturas = scan.nextDouble();
            if (alturas>maior){
                 maior = alturas;
             }
        }
        System.out.println("A maior altura é de: " + maior);
    }
   }
}
