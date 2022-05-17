package com.dio.Exercicios;

import java.util.*;

/*
Faça um algoritmo que mostre os conceitos finais dos alunos de uma classe de 10 pessoas, considerando a tabela
seguir. Para isso, o programa deve ler a nota final e o código do aluno e, em seguida, retorna o conceito de cada aluno.
Nota Conceito
De 0,0 a 4,9 C
De 5,0 a 8,9 B
De 9,0 a 10,0 A
*/

public class Conceito {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            for (int i =1; i <= 10; i++){
                System.out.println("Digite a nota final do aluno: ");
                double nota = scan.nextDouble();
            if (nota <= 4.9){
                System.out.println("O conceito final é C.");
            }
            else if(nota <= 8.9 && nota >= 5){
                System.out.println("O conceito final é B.");
            }
            else{
                System.out.println("O conceito final é A.");
            }
            }
        }
    }
}
