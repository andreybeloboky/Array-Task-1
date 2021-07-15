package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size matrix");
        System.out.println("Enter number of columns: ");
        int numberOfColumns = scanner.nextInt();
        System.out.println("Enter number of line: ");
        int numberOfLine = scanner.nextInt();
        System.out.println(" LOLX");
        if (numberOfLine > 0 && numberOfColumns > 0) {
            int[][] matrixA = matrix.creatureMatrix(numberOfLine, numberOfColumns);
            System.out.println("matrix B");
            int[][] matrixB = matrix.creatureMatrix(numberOfLine, numberOfColumns);
            int[][] sumMatrix = com.company.sumMatrix.calculatorMatrix(matrixA, matrixB, numberOfColumns, numberOfLine);
            for (int i = 0; i < numberOfLine; i++) {
                for (int j = 0; j < numberOfColumns; j++) {
                    System.out.print(" " + sumMatrix[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Enter number < 0");
        }
    }
}