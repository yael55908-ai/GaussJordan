package Ecuaciones_Lineales;

public class Lanzador_gaus {
    public static void main(String[] args) {
        double[][] matriz = defmatrizz.defmatriz();
        double[] soluciones = Gauss_Jordan.resolver(matriz);

        System.out.println("Soluciones del sistema (Gauss-Jordan Modular):");
        for (int i = 0; i < soluciones.length; i++) {
            System.out.printf("x%d = %.6f%n", i + 1, soluciones[i]);
        }
    }
}
