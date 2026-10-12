package Ecuaciones_Lineales;

public class Gauss {
    public static void eliminacionGaussiana(double[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double factor = matriz[j][i] / matriz[i][i];

                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }
}
