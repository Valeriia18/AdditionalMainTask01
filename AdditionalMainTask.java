package by.epam.javatraining.ValeriiaAmialchenia.maintask01.additionaltask;

import java.util.Arrays;

/*
  @version 1.0 27 Dec 2018
  @author Valeriia Amialchenia
 */
public class AdditionalMainTask {

    public static void main(String[] args) {
        int[][] testMatrix = {{2, 5, 3, 4}, {1, -2, 4, -1}, {3, 6, 9, 8}, {7, -1, -8, 9}, {3, 2, 4, 6}};
        int[][] testMatrixSym = {{1, 2, 3}, {2, 2, 2,}, {3, 2, 1}};
        int [][] testMatrixTranspose = {{2, 3}, {4, 5}};

        ConsolePrinter.print("Arithmetical Average: " + Logic.CountArithmeticalAverage(testMatrix));
        ConsolePrinter.print("Geometric Average: " + Logic.CountGeometricAverage(testMatrix));
        ConsolePrinter.print("Local Minimum: " + Logic.findLocalMin(testMatrix));
        ConsolePrinter.print("Local Maximum: " + Logic.findLocalMax(testMatrix));

        ConsolePrinter.print("Matrix is symmetrical according to the main diagonal: " + Logic.isSymmetricalMainDiagonal(testMatrixSym));
        ConsolePrinter.print("Transposed Matrix: \n ");
        Logic.transposeMatrix(testMatrixTranspose);
    }

}
