package ecuacionesLineales;

/**
 * Completa el metodo de Gauss-Jordan reutilizando la eliminacion gaussiana.
 * Normaliza los pivotes y elimina los coeficientes que estan arriba de ellos.
 */
public class GaussJordan {

    /**
     * Transforma la matriz aumentada en la forma reducida y deja las soluciones
     * directamente en la ultima columna de la matriz.
     *
     * @param matriz matriz aumentada del sistema; se modifica directamente
     */
    public static void gaussJordan(double[][] matriz) {
        // Reutiliza el metodo implementado en la practica anterior de Gauss.
        gauss.eliminacionGaussiana(matriz);

        int n = matriz.length;

        // Se trabaja desde la ultima fila hacia la primera.
        for (int i = n - 1; i >= 0; i--) {
            double pivote = matriz[i][i];
            if (Math.abs(pivote) < 1e-12) {
                throw new IllegalArgumentException(
                        "El sistema no tiene un pivote distinto de cero en la fila " + (i + 1)
                                + ". Revise si el sistema requiere intercambio de filas.");
            }

            // Normaliza toda la fila para que el pivote sea igual a 1.
            for (int j = 0; j <= n; j++) {
                matriz[i][j] /= pivote;
            }

            // Elimina los coeficientes que estan arriba del pivote actual.
            for (int j = 0; j < i; j++) {
                double factor = matriz[j][i];
                for (int k = 0; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }
}
