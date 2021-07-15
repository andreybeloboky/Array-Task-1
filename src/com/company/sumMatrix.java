package com.company;

/*
 * @param matrixA - first filled matrix
 * @param matrixB - second filled matrix
 * @param numberOfColumns - number of columns in a matrix
 * @param numberOfLine - number of lines in a matrix
 * @return - summa matrix A+B
 */
public class sumMatrix {
    public static int[][] calculatorMatrix(int[][] matrixA, int[][] matrixB, int numberOfColumns, int numberOfLine) {
        int[][] sumMatrix = new int[numberOfLine][numberOfColumns];
        for (int i = 0; i < numberOfLine; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return sumMatrix;
    }
}
