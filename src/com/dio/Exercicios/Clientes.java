package com.dio.Exercicios;

import java.util.*;

/*
Implementar um programa capaz de ler o valor da conta e o valor pago de 10 clientes do Churrasquilo e retornar
a quantidade de clientes que deixaram gorjeta, visto que sempre que o valor pago for maior do que o valor da conta
significa que houve gorjeta.
*/

public class Clientes {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int totalGorjetas = 0;
            boolean gorjeta;
            
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o valor da conta: ");
            double valorConta = scan.nextDouble();

            System.out.println("Digite o valor pago: ");
            double valorPago = scan.nextDouble();

        if (valorConta == valorPago){
            gorjeta = false;
        }
        else if(valorConta < valorPago){
            gorjeta = true;
            totalGorjetas += 1;
        }
        else{
            System.out.println("O valor pago não pode ser menor que o valor da conta!");
            break;
        }

        }
        System.out.println("O número de clientes que deixaram gorjetas é de: " + totalGorjetas );
        }
        }
}
