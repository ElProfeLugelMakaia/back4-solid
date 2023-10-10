public class Resta extends Operacion {
    public Resta() {
    }

    public Resta(double a, double b) {
        super(a, b);
    }

    @Override
    public double operacion() {
        return a + b;
    }
    @Override
    public double operacion(double a, double b) {
        return a - b;
    }
}
