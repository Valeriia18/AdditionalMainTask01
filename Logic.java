package by.epam.javatraining.ValeriiaAmialchenia.maintask01.additionaltask;

import java.util.Arrays;
import java.util.Random;

/*
  @version 1.0 27 Dec 2018
  @author Valeriia Amialchenia
 */
public class Logic {

    public static double findMinElement(int[][] matrixIn) {
        int min = matrixIn[0][0];

        for (int i = 0; i < matrixIn.length; i++) {
            for (int j = 0; j < matrixIn[i].length; j++) {
                if (matrixIn[i][j] < min) {
                    min = matrixIn[i][j];
                }
            }
        }
        return min;
    }

    public static double findMax(int[][] matrixIn) {
        int max = matrixIn[0][0];

        for (int i = 0; i < matrixIn.length; i++) {
            for (int j = 0; j < matrixIn[i].length; j++) {
                if (matrixIn[i][j] > max) {
                    max = matrixIn[i][j];
                }
            }
        }
        return max;
    }
    double sum = 0.0;

    public static double CountArithmeticalAverage(int[][] matrixIn) {

        int sum = 0;
        int count = 0;

        double average = 0.0;
        for (int i = 0; i < matrixIn.length; i++) {
            for (int j = 0; j < matrixIn[i].length; j++) {
                sum += matrixIn[i][j];
                count++;
            }

            average = sum / count;
        }
        return average;
    }

    public static double CountGeometricAverage(int[][] matrixIn) {

        double result = 1;
        int count = 0;

        for (int i = 0; i < matrixIn.length; i++) {
            for (int j = 0; j < matrixIn[i].length; j++) {
                result *= matrixIn[i][j];
                count++;
            }
        }

        return Math.pow(result, 1.0 / count);
    }

    public static boolean isSymmetricalMainDiagonal(int[][] matrixIn) {
        boolean result = false;

        for (int i = 0; i < matrixIn.length; i++) {
            for (int j = 0; j < matrixIn[i].length; j++) {
                if (matrixIn[i][j] == matrixIn[j][i]) {
                    result = true;
                } else {
                    return false;
                }
            }
        }

        return result;
    }

    public static int findLocalMin(int[][] matrixIn) {
        int result = -1;
        for (int i = 1; i < matrixIn.length - 1; i++) {
            for (int j = 1; j < matrixIn[i].length - 1; j++) {
                if (matrixIn[i][j] < matrixIn[i][j + 1]
                        && matrixIn[i][j] < matrixIn[i][j - 1]
                        && matrixIn[i][j] < matrixIn[i + 1][j]
                        && matrixIn[i][j] < matrixIn[i - 1][j]) {
                    return matrixIn[i][j];
                }
            }
        }
        return result;
    }

    public static int findLocalMax(int[][] matrixIn) {
        int result = -1;
        for (int i = 1; i < matrixIn.length - 1; i++) {
            for (int j = 1; j < matrixIn[i].length - 1; j++) {
                if (matrixIn[i][j] > matrixIn[i][j + 1]
                        && matrixIn[i][j] > matrixIn[i][j - 1]
                        && matrixIn[i][j] > matrixIn[i + 1][j]
                        && matrixIn[i][j] > matrixIn[i - 1][j]) {
                    return matrixIn[i][j];
                }
            }
        }
        return result;
    }

    public static void transposeMatrix(int[][] matrixIn) {

        for (int i = 0; i < matrixIn.length; i++) {
            for (int j = i + 1; j < matrixIn.length; j++) {
                int temp = matrixIn[i][j];
                matrixIn[i][j] = matrixIn[j][i];
                matrixIn[j][i] = temp;
            }
        }
        for (int i = 0; i < matrixIn.length; i++) {
            for (int j = 0; j < matrixIn.length; j++) {
                System.out.println(matrixIn[i][j]);
//                System.out.println(" ");
//                System.out.println(Arrays.toString(matrixIn[i]));
//                System.out.println(Arrays.toString(matrixIn[j]));
            }       
        }

    }
}
