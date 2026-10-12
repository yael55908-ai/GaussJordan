package Ecuaciones_Lineales;

public class Gauss_Jordan {
    public static double[] resolver(double[][] matriz) {
        int n = matriz.length;

        // Reutiliza la triangulacion superior de la practica de Gauss.
        Gauss.eliminacionGaussiana(matriz);

        // Normaliza cada pivote y elimina los coeficientes superiores.
        for (int i = n - 1; i >= 0; i--) {
            double pivote = matriz[i][i];

            for (int k = i; k <= n; k++) {
                matriz[i][k] /= pivote;
            }

            for (int j = i - 1; j >= 0; j--) {
                double factor = matriz[j][i];

                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }

        // La ultima columna contiene las soluciones.
        double[] soluciones = new double[n];
        for (int i = 0; i < n; i++) {
            soluciones[i] = matriz[i][n];
        }

        return soluciones;
    }
}
