package com.dio.Exercicios;

import java.util.*;

/*
4 – Em um campeonato de futebol, existem três times e cada um possui cinco jogadores. Faça um programa que receba a
idade, o peso e a altura de cada um dos jogadores, calcule e mostre:
a) a quantidade de jogadores com idade inferior a 18 anos;
b) a quantidade de jogadores com mais de 80 quilos entre todos os jogadores do campeonato.
c) A altura do jogador mais alto do campeonato.
*/

public class Campeonato {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int contadorIdade = 0, contadorPeso = 0;
            double maior = 0;
            for (int i =1; i <= 3; i++){
                System.out.println("Digite a idade do jogador: ");
                int idade = scan.nextInt();
                System.out.println("Digite o peso do jogador: ");
                double peso = scan.nextDouble();
                System.out.println("Digite a altura do jogador: ");
                double altura = scan.nextDouble();

            if (idade < 18){
                contadorIdade += 1;
            }
            else if (peso > 80){
                contadorPeso += 1;
            }
            else if (altura>maior){
                maior = altura;
            }
            }
           System.out.println("A quantidade de jogadores menores de 18 anos é de: " + contadorIdade);
           System.out.println("A quantidade de jogadores com mais de 80kg é de: " + contadorPeso);
           System.out.println("A maior altura é: " + maior);
        }
    }
}
