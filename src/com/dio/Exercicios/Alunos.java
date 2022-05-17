package com.dio.Exercicios;

import java.util.Scanner;

/*
Implementar um programa capaz de ler a nota de 5 alunos de um curso e retornar a nota do aluno mais fraco e do aluno mais nerd.
*/

public class Alunos {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double maior = 0;
            double menor = 99999;
        for (int i = 1; i <= 5; i++){
            System.out.println("Digite a nota do aluno: ");
            double nota = scan.nextDouble();
        if (nota>maior){
            maior = nota;
        }
        else if (nota<menor){
            menor = nota;
        }
        }
        System.out.println("A maior nota é: " +maior);
        System.out.println("A menor nota é: " +menor);
        }
    }
}
