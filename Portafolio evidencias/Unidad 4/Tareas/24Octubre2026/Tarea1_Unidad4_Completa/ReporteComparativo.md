# Reporte comparativo: Simpson compuesto y Trapecio compuesto

## Función y parámetros

- Función: f(x) = x²
- Intervalo: [0, 1]
- Tolerancia: 1e-5
- Integral exacta: 1/3 = 0.3333333333

## Resultados

| Método | Iteraciones de refinamiento | Subintervalos finales (n) | Resultado aproximado |
|---|---:|---:|---:|
| Trapecio compuesto | 7 | 256 | 0.33333587646484375 |
| Simpson 1/3 compuesto | 1 | 4 | 0.3333333333333333 |

El método del Trapecio comenzó con n = 2 y necesitó siete refinamientos, hasta n = 256, para que la diferencia entre aproximaciones sucesivas fuera menor que la tolerancia. Simpson comenzó con n = 2 y necesitó un refinamiento hasta n = 4; la diferencia entre ambas aproximaciones fue 0.0 por la precisión de la función cuadrática.

## ¿Por qué el número de subintervalos debe ser par?

La regla de Simpson 1/3 aproxima la función mediante parábolas que pasan por tres puntos consecutivos. Cada parábola abarca dos subintervalos; por lo tanto, para cubrir todo el intervalo se agrupan los subintervalos de dos en dos y el total n debe ser par.

## ¿Por qué se alternan los coeficientes?

En Simpson compuesto, los extremos tienen coeficiente 1, los puntos interiores con índice impar reciben coeficiente 4 y los puntos interiores con índice par reciben coeficiente 2. Los puntos impares corresponden al punto central de cada grupo de dos subintervalos; los puntos pares interiores se comparten entre dos aproximaciones parabólicas. En el Trapecio compuesto, todos los puntos interiores reciben coeficiente 2 porque se comparten entre dos trapecios, mientras que los extremos reciben coeficiente 1 porque pertenecen a un solo trapecio.

Simpson compuesto suele alcanzar mayor precisión con menos subintervalos para funciones suaves: su error global es de orden cuatro, frente al orden dos del Trapecio compuesto. En la función cuadrática utilizada, Simpson obtiene el valor exacto salvo por redondeo numérico.
