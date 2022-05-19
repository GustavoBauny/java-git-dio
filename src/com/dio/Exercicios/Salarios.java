package com.dio.Exercicios;

import java.util.*;

/*
Implementar um programa capaz de ler o salário de 10 funcionários e retornar a quantidade de funcionários que
ganha mais que 2 salários mínimos, considerando que o salário mínimo é de R$ 870,00.
*/
public class Salarios {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            final double salarioMin = 870;
            int contador = 0;
        for (int i = 1; i <= 10; i++){
            System.out.println("Digite o salário do funcionário: ");
            double salario = scan.nextDouble();
        
        if (salario > (salarioMin * 2)){
            contador += 1;
        }
        else{
        }
        }
        System.out.println("A quantidade de funcionários que ganha mais de dois salários mínimos é: " + contador);
        }
    }
}
