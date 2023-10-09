public class Operacion {
    private double a;
    private double b;

    public Operacion(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void sumar(){
        double suma = a + b;
        System.out.println("La suma es " + suma);
    }

    public void restar(){
        double resta = a - b;
        System.out.println("La resta es " + resta);
    }

    public void multipplicar(){
        double multiplicacion = a * b;
        System.out.println("La multiplicacion es " + multiplicacion);
    }

    public void dividir(){
        double division = a / b;
        System.out.println("La division es " + division);
    }
}
