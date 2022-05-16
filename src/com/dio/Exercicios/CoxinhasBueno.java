package com.dio.Exercicios;

import java.util.Scanner;

public class CoxinhasBueno {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
        String input = scan.nextLine();

        String[] inputSplit = input.split(" ");

        double media = Double.parseDouble(inputSplit[0] )/Double.parseDouble(inputSplit[1]);

        System.out.printf("%.2f",  media  );
    } catch (NumberFormatException e) {
        e.printStackTrace();
    }
  }
}


