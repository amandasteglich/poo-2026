public class App {

    public static void main(String[] args) {

        Circulo c1 = new Circulo();

        System.out.println(c1);
        System.out.println("Área do c1: " + c1.area());

        Circulo c2 = new Circulo(3, 4, 2);

        System.out.println(c2);

        c2.mover(5, 2);
        System.out.println(c2);

        c2.zoom(2);
        System.out.println(c2);

        Circulo[] lista = new Circulo[3];

        lista[0] = c1;
        lista[1] = c2;
        lista[2] = new Circulo(7, 8, 9);

        System.out.println("\nFor tradicional:");
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }

        System.out.println("\nForeach:");
        for (Circulo c : lista) {
            System.out.println(c);
        }
    }
}