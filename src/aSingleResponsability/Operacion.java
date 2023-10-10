public abstract class Operacion {
    public double a;
    public double b;

    public Operacion() {
    }

    public Operacion(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double operacion();
    public abstract double operacion(double a, double b);
}
