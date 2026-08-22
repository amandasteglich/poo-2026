public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(double lado) {
        this(lado, lado);
    }

    public double area() {
        return this.base * this.altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}