package bOpenClose;

import aSingleResponsability.*;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        DibujadorSimpsons dibujador = new DibujadorSimpsons();
        Homero homero = new Homero();
        Marge marge = new Marge();
        Lisa lisa = new Lisa();
        Bart bart = new Bart();
        dibujador.dibujar(new Simposon[]{homero, marge, lisa, bart});

    }

    public static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in).useDelimiter("\n");
        }
        return scanner;
    }

}