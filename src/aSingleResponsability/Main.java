import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Scanner scanner;
    private static Operacion[] ops;

    public static void main(String[] args) {
        while (true) {
            double opcion = getDoublePorConsola("Ingrese la operación que desea ejecutar: " +
                    "\n 1. Suma " +
                    "\n 2. resta " +
                    "\n 3. Multiplicacion" +
                    "\n 4. División");

            gestionarOpcionSeleccionada((int) opcion);
        }

        /**
         *
        if (opcion == 1) {
            System.out.println("La suma es " + suma);
        } else if (opcion == 2) {
            System.out.println("La resta es " + resta);
        } else if (opcion == 3) {
            System.out.println("La multiplicacion es " + multiplicacion);
        } else {
            System.out.println("La division es " + division);
        }
         */
    }

    public static void gestionarOpcionSeleccionada(int opcion){
        double resultado = ejecutarOperacion2(getOperations(), opcion);

        System.out.println("El resultado de la operacion es: " + resultado);
    }

    public static Scanner getScanner() {
        if(scanner == null){
            scanner = new Scanner(System.in).useDelimiter("\n");
        }
        return scanner;
    }

    public static Operacion[] getOperations() {
        if(ops == null){
            ops = new Operacion[] {new Suma(), new Resta(), new Multiplicacion(), new Division()};
        }
        return ops;
    }

    public static Calculadora crearCalculadora() {
        // Lectura del número 1
        double a = getDoublePorConsola("Ingrese el primer número");

        // Lectura del número 2
        double b = getDoublePorConsola("Ingrese el segundo número");

        return new Calculadora(a, b);
    }

    public static double getDoublePorConsola(String mensaje){
        System.out.println(mensaje);
        double a = getScanner().nextDouble();
        return a;
    }

    public static void ejecutarOperacion(Calculadora calculadora, int opcion) {
        double a = calculadora.a;
        double b = calculadora.b;
        Operacion[] ops = new Operacion[]{new Suma(a, b), new Resta(a, b), new Multiplicacion(a, b), new Division(a, b)};
        double resultado = ops[opcion-1].operacion();
        System.out.println("El resultado de la operacion es: " + resultado);
        /**switch (opcion) {
            case 1:
                Suma s = new Suma(4, 5);
                System.out.println("La suma es " + s.operacion());
                System.out.println("El resultado de la suma es: " + calculadora.sumar());
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + calculadora.restar());
                calculadora.restar();
                break;
            case 3:
                System.out.println("El resultado de la mulitiplicacion es: " + calculadora.multipplicar());
                break;
            case 4:
                System.out.println("El resultado de la division es: " + calculadora.dividir());
                break;
        }*/
    }

    public static double ejecutarOperacion2(Operacion[] ops, int operacion){
        // Lectura del número 1
        double a = getDoublePorConsola("Ingrese el primer número");
        // Lectura del número 2
        double b = getDoublePorConsola("Ingrese el segundo número");

        return ops[operacion-1].operacion();
    }
}