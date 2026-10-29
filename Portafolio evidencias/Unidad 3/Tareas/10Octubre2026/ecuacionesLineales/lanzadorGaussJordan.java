package ecuacionesLineales;

/** Clase principal para ejecutar la practica de Gauss-Jordan. */
public class lanzadorGaussJordan {
    public static void main(String[] args) {
        // Se obtiene una matriz nueva para no reutilizar una matriz ya modificada.
        double[][] matriz = defMatrizz.defmatriz();

        try {
            // GaussJordan modifica la matriz y deja la solucion en matriz[i][n].
            GaussJordan.gaussJordan(matriz);

            System.out.println("Matriz reducida por Gauss-Jordan");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j <= matriz.length; j++) {
                    System.out.printf("%10.4f", matriz[i][j]);
                }
                System.out.println();
            }

            System.out.println("\nSoluciones del sistema");
            int n = matriz.length;
            for (int i = 0; i < n; i++) {
                System.out.println("x" + (i + 1) + " = " + matriz[i][n]);
            }
        } catch (IllegalArgumentException e) {
            System.err.println("No se pudo resolver el sistema: " + e.getMessage());
        }
    }
}
