package dif_e_Integracion;

public class MainTrap {
    public static void main(String[] args) {
        double a = 0.0;
        double b = 1.0;
        double tolerancia = 1e-5;

        double resultadoTrapecio = TrapecioCompuesto.integrarConTolerancia(a, b, tolerancia);
        System.out.println("Resultado Trapecio: " + resultadoTrapecio);

        double resultadoSimpson = SimpsonCompuesto.integrarConTolerancia(a, b, tolerancia);
        System.out.println("Resultado Simpson: " + resultadoSimpson);
    }
}
