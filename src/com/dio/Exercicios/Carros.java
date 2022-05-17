package com.dio.Exercicios;

import java.util.Scanner;

/*
Implementar um programa capaz de ler o consumo de 5 carros e retornar o consumo do carro mais econômico.
*/

public class Carros {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double menorConsumo = 9999999;
        for (int i = 1; i <= 5; i++){
            System.out.println("Digite o consumo do carro: ");
            double consumo = scan.nextDouble();
        if (consumo<menorConsumo){
            menorConsumo = consumo;
        }
        }
        System.out.println("O carro mais econômico consumiu: " + menorConsumo);
        }
    }
}
