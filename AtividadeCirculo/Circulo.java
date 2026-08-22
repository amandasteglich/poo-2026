public class Circulo {
    private double raio;
    public static int contador = 0; 

    public Circulo(double raio) {
        this.raio = raio;
        contador++; 
    }

    public Circulo() {
        this(1.0);
    }

    public double area() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double getRaio() {
        return raio;
    }

    public static Circulo compararAreas(Circulo a, Circulo b) {
        double maiorArea = Math.max(a.area(), b.area());

        if (maiorArea == a.area()) {
            return a;
        } else {
            return b;
        }
    }
}