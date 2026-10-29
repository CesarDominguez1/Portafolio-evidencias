package Ecuaciones_lineales.Gauss_Seidel;

import Ecuaciones_lineales.JACOBI.Defmatrix;
import java.util.Arrays;

public class MainGaussSeidel {

    public static void main(String[] args) {

        double[][] A = Defmatrix.obtenerMatrizA();
        double[] b = Defmatrix.obtenerVectorB();
        double[] x0 = Defmatrix.obtenerVectorX0();

        double tol = 0.0001;
        int maxIter = 100;

        double[] solucion =
                GaussSeidelMetodo.gaussSeidel(
                        A, b, x0, tol, maxIter
                );

        System.out.println("Solución aproximada (Gauss-Seidel): "
                + Arrays.toString(solucion));
    }
}
