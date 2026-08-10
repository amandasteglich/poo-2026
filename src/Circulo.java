public class Circulo {
    private Ponto centro;
    private double raio;

    public Circulo() {
        this.centro = new Ponto(0, 0);
        this.raio = 1;
    }

    public Circulo(double umX, double umY, double umRaio) {
        this.centro = new Ponto(umX, umY);
        this.raio = umRaio;
    }

    public void mover(double novoX, double novoY) {
        this.centro.mover(novoX, novoY);
    }

    public void zoom(double fator) {
        this.raio = this.raio * fator;
    }

    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    public String toString() {
        return "centro: " + this.centro.toString() +
               " raio: "  + this.raio   +
               " area: "  + this.area();
    }
}