package com.dio.Exercicios;

import java.util.Scanner;

/*
Implementar um programa capaz de ler a nota de 10 alunos e retornar a quantidade de alunos aprovados,
considerando que a média para aprovação no mínimo 60,00 pontos.
*/

public class Aprovados {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            final double media = 60;
            int totalAprovados = 0;
            boolean aprovado;
            
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite a nota do aluno: ");
            double nota = scan.nextDouble();
        
        if (nota<media){
            aprovado = false;
        }
        else if(nota>=media){
            aprovado = true;
            totalAprovados += 1;
        }

        }
        System.out.println("O número de alunos aprovados é de: " +totalAprovados );
        }
        }
    }

