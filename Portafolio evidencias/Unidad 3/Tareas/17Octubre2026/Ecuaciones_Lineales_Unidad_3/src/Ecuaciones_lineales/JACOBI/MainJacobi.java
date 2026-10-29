package Ecuaciones_lineales.JACOBI;

import java.util.Arrays;

public class MainJacobi {

    public static void main(String[] args) {

        double[][] A = Defmatrix.obtenerMatrizA();
        double[] b = Defmatrix.obtenerVectorB();
        double[] x0 = Defmatrix.obtenerVectorX0();

        double tol = 0.0001;
        int maxIter = 100;

        double[] solucion =
                MetodoJacobi.resolver(A, b, x0, tol, maxIter);

        System.out.println("Solución aproximada (Jacobi): "
                + Arrays.toString(solucion));
    }
}
