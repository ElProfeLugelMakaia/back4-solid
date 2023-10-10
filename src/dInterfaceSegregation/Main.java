package cLiskovSubstitution;

import bOpenClose.*;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Adulto papa = new Adulto("10378967574","Carlos", "papa", "9870 5768 4589 2349");
        Nino nino = new Nino("Carlos", "Niño", papa);
        nino.getAdultoResponsable().pagar();
    }


}