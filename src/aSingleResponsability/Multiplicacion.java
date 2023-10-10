public class Multiplicacion extends Operacion {
    public Multiplicacion() {
    }

    public Multiplicacion(double a, double b) {
        super(a, b);
    }

    @Override
    public double operacion() {
        return a + b;
    }

    @Override
    public double operacion(double a, double b) {
        return a * b;
    }
}
