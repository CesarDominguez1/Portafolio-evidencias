# Método de Gauss-Jordan - Ecuaciones Lineales

## Datos de la práctica

- **Asignatura:** SCC-1017 Métodos Numéricos
- **Unidad:** 3
- **Práctica:** Método de Gauss-Jordan
- **Lenguaje:** Java
- **Institución:** Instituto Tecnológico Superior de Xalapa

## Descripción

El proyecto resuelve un sistema de ecuaciones lineales usando el método de Gauss-Jordan sobre una matriz aumentada. Se reutiliza la eliminación gaussiana desarrollada en la práctica anterior; después se normalizan los pivotes y se eliminan los coeficientes que están arriba de la diagonal. Así, las soluciones se leen directamente de la última columna, sin sustitución regresiva.

## Estructura modular

- `defMatrizz.java`: define y devuelve la matriz aumentada de prueba.
- `gauss.java`: contiene `eliminacionGaussiana()` y el método anterior `sustitucionRegresiva()`; este último se conserva para la práctica original de Gauss.
- `GaussJordan.java`: reutiliza `gauss.eliminacionGaussiana(matriz)`, normaliza los pivotes y realiza el barrido superior.
- `lanzadorGaussJordan.java`: contiene el `main`, ejecuta el método e imprime la matriz reducida y las soluciones.
- `lanzadorGauss.java`: conserva el lanzador de la práctica anterior de Gauss.

## Requisitos

- JDK de Java instalado.
- Terminal o IDE compatible, por ejemplo IntelliJ IDEA.

## Compilar

Desde la carpeta raíz del repositorio, ejecuta:

```bash
javac ecuacionesLineales/*.java
```

## Ejecutar Gauss-Jordan

```bash
java ecuacionesLineales.lanzadorGaussJordan
```

Para ejecutar la práctica anterior de Gauss:

```bash
java ecuacionesLineales.lanzadorGauss
```

## Ejemplo de prueba

La matriz aumentada que utiliza el programa es:

```text
[ 3.0  -0.1  -0.2 |   7.85 ]
[ 0.1   7.0  -0.3 | -19.30 ]
[ 0.3  -0.2  10.0 |  71.40 ]
```

Salida de Gauss-Jordan (los últimos decimales pueden variar por redondeo):

```text
Matriz reducida por Gauss-Jordan
    1.0000    0.0000    0.0000    3.0000
    0.0000    1.0000    0.0000   -2.5000
    0.0000    0.0000    1.0000    7.0000

Soluciones del sistema
x1 = 3.0
x2 = -2.5
x3 = 7.000000000000002
```

## Estructura de carpetas

```text
README.md
 ecuacionesLineales/
 ├── defMatrizz.java
 ├── gauss.java
 ├── GaussJordan.java
 ├── lanzadorGauss.java
 └── lanzadorGaussJordan.java
```
