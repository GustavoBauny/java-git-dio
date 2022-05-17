package com.dio.Exercicios;

import java.util.Scanner;

/*
Implementar um programa capaz de ler o valor de 10 notas de venda de uma empresa, e retornar o valor da venda mais cara.
*/
public class Notas {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double maior = 0;
            
            for(int i = 1; i <= 10; i++){
            System.out.println("Digite o valor da nota: ");
            double notas = scan.nextDouble();
            
            if (notas>maior){
                maior = notas;
            }
            }
        System.out.println("A maior nota é: " + maior);
        }
    }
}
