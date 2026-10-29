package ecuacionesLineales;

/**
 * Clase principal para ejecutar el metodo de Gauss.
 */
public class lanzadorGauss {
    public static void main(String[] args) {
        // Se obtiene la matriz del sistema.
        double[][] matriz = defMatrizz.defmatriz();

        // Se realiza la eliminacion gaussiana.
        gauss.eliminacionGaussiana(matriz);

        // Se calculan las soluciones mediante sustitucion regresiva.
        double[] soluciones = gauss.sustitucionRegresiva(matriz);

        // Se muestran las soluciones en consola.
        System.out.println("Soluciones del sistema");
        for (int i = 0; i < soluciones.length; i++) {
            System.out.println("x" + (i + 1) + " = " + soluciones[i]);
        }
    }
}
