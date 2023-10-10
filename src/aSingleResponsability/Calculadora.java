public class Calculadora {
    public double a;
    public double b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double sumar() {
        return a + b;
    }

    public double restar() {
        return a - b;
    }

    public double multipplicar() {
        return a * b;
    }

    public double dividir() {
        return a / b;
    }
}
