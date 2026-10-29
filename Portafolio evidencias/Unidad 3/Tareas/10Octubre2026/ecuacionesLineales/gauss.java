package ecuacionesLineales;

/**
 * Clase que contiene las operaciones del metodo de Gauss.
 */
public class gauss {

    /**
     * Realiza la eliminacion gaussiana sobre la matriz aumentada.
     * Convierte la matriz en una forma triangular superior.
     */
    public static void eliminacionGaussiana(double[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            // Se calcula el factor para eliminar los elementos debajo del pivote.
            for (int j = i + 1; j < n; j++) {
                double factor = matriz[j][i] / matriz[i][i];

                // Se actualizan los elementos de la fila.
                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }

    /**
     * Realiza la sustitucion regresiva para obtener las soluciones.
     */
    public static double[] sustitucionRegresiva(double[][] matriz) {
        int n = matriz.length;
        double[] x = new double[n];

        for (int i = n - 1; i >= 0; i--) {
            double suma = 0;

            // Se suman los productos de los valores ya calculados.
            for (int j = i + 1; j < n; j++) {
                suma += matriz[i][j] * x[j];
            }

            // Se obtiene el valor de la variable actual.
            x[i] = (matriz[i][n] - suma) / matriz[i][i];
        }
        return x;
    }
}
