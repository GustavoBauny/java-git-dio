package com.dio.Exercicios;

import java.util.Scanner;

/*
Implementar um programa capaz de ler o peso de 5 lutadores de sumô e retornar o lutador mais magro.
*/

public class Peso {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
           double menor = 99999999;
           for(int i = 1; i <= 5; i++){
               System.out.println("Digite o peso do lutador: ");
               double peso = scan.nextDouble();
            if (peso<menor){
                menor = peso;
            }
           }
           System.out.println("O menor peso é: " + menor);
        }
        
    }
}
