package com.dio.Exercicios;

import java.util.*;

/*
Faça um algoritmo que mostre os conceitos finais dos alunos de uma classe de 10 pessoas, considerando a tabela
seguir. Para isso, o programa deve ler a nota final e o código do aluno e, em seguida, retorna o conceito de cada aluno.
Nota Conceito
De 0,0 a 4,9 C
De 5,0 a 8,9 B
De 9,0 a 10,0 A

Deverá apresentar a quantidade de alunos que tiveram conceito A, B e C.
*/

public class Conceito {
    public static void main(String[] args) {
        int contador1 = 0, contador2 = 0, contador3 = 0;
        try (Scanner scan = new Scanner(System.in)) {
            for (int i =1; i <= 10; i++){
                System.out.println("Digite a nota final do aluno: ");
                double nota = scan.nextDouble();
            if (nota <= 4.9){
                System.out.println("O conceito final é C.");
                contador1 += 1;
            }
            else if(nota <= 8.9 && nota >= 5){
                System.out.println("O conceito final é B.");
                contador2 += 1;
            }
            else{
                System.out.println("O conceito final é A.");
                contador3 += 1;
            }
            }
            System.out.println("A quantidade de alunos que tiveram o conceito A é de: " + contador1);
            System.out.println("A quantidade de alunos que tiveram o conceito B é de: " + contador2);
            System.out.println("A quantidade de alunos que tiveram o conceito C é de: " + contador3);
        }
    }
}
