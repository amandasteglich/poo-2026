public class App {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(4.0, 8.0);
        Retangulo q1 = new Retangulo(3.0);

        System.out.println("Área do Retângulo: " + r1.area()); 
        System.out.println("Área do Quadrado: " + q1.area()); 

        Circulo c1 = new Circulo(); 
        Circulo c2 = new Circulo(3.0); 
        Circulo c3 = new Circulo(7.0);  

        System.out.println("Total de círculos criados: " + Circulo.contador);

        Circulo maior = Circulo.compararAreas(c1, c2);
        System.out.println("Raio do maior círculo entre c1 e c2: " + maior.getRaio());
    }
}