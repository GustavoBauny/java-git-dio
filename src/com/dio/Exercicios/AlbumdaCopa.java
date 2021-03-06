package com.dio.Exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AlbumdaCopa {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numTotal = scan.nextInt();
            int numFigCompradas = scan.nextInt();
            Set<Integer> setFig = new HashSet<>();
            for (      int i = 1; i <= numFigCompradas; i++ ) {
              setFig.add(scan.nextInt());
            }
            System.out.println(numTotal - setFig.size());
        }
      }
}
