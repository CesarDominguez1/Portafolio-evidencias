# Métodos Numéricos - Jacobi y Gauss-Seidel

Práctica de programación en Java con arquitectura modular.

## Estructura
- Defmatrix.java: definición de matriz, vectores y aproximación inicial.
- MetodoJacobi.java: lógica del método de Jacobi.
- MainJacobi.java: ejecución de Jacobi.
- GaussSeidelMetodo.java: lógica de Gauss-Seidel.
- MainGaussSeidel.java: ejecución de Gauss-Seidel.

## Sistema
5x + y + z = 7
x + 4y + z = 6
x + 2y + 5z = 8

X(0) = [0, 0, 0]T
Tolerancia = 0.0001
Máximo = 100 iteraciones

## Resultados
Jacobi: [0.99998692, 0.99998474, 0.99998256] - 16 iteraciones.
Gauss-Seidel: [0.99999381, 1.00000015, 1.00000118] - 6 iteraciones.

Solución exacta: [1, 1, 1].

## Ejecución
Abrir el proyecto en IntelliJ IDEA, Eclipse o NetBeans y ejecutar MainJacobi y MainGaussSeidel.

## Conclusión
Para este sistema, Gauss-Seidel alcanzó la tolerancia en 6 iteraciones y Jacobi en 16. Por lo tanto, Gauss-Seidel convergió más rápido en esta prueba porque utiliza inmediatamente los valores nuevos calculados durante la misma iteración.
