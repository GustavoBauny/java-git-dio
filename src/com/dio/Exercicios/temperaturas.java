package com.dio.Exercicios;
/*
Escreva um programa que, com base em uma temperatura em graus celsius, 
a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), 
seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67
*/
public class temperaturas {
    public static void main(String[] args) {
        double C,K,F,Re,Ra;

        C = 2.43;
        F = C * 1.8 + 32; 
        K = C + 273.15; 
        Re = C * 0.8; 
        Ra = C * 1.8 + 32 + 459.67;
    
        System.out.println("O valor em Fahrenheit é: " + F);
        System.out.println("O valor em Kelvin é: " + K);
        System.out.println("O valor em Réaumur é: " + Re);
        System.out.println("O valor em Rankine é: " + Ra);
    }
}
