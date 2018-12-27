package by.epam.javatraining.ValeriiaAmialchenia.maintask01.additionaltask;

import java.util.Scanner;

/**
 *
 * @author Valeriia_Amialchenia
 */
public class UserInput {
    public final static Scanner scan = new Scanner(System.in);
    public static int input(String msg) {
        System.out.println(msg);
        return scan.nextInt();
    }
}
