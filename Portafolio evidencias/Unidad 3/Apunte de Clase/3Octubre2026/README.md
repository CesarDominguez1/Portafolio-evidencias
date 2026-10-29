# Método de Gauss - Ecuaciones Lineales

## Datos de la práctica

- **Asignatura:** SCC-1017 Métodos Numéricos
- **Unidad:** 3
- **Práctica:** Método de Gauss
- **Lenguaje:** Java
- **Institución:** Instituto Tecnológico Superior de Xalapa

## Descripción

Este proyecto implementa el método de Gauss para resolver un sistema de ecuaciones lineales mediante una matriz aumentada.

El programa está organizado de forma modular en tres clases:

- `defMatrizz.java`: contiene la definición de la matriz del sistema.
- `gauss.java`: contiene la eliminación gaussiana y la sustitución regresiva.
- `lanzadorGauss.java`: contiene el método principal y ejecuta el programa.

## Requisitos

- Java JDK instalado.
- Una terminal o un IDE compatible con Java, como IntelliJ IDEA.

## Compilar

Desde la carpeta raíz del proyecto, ejecutar:

```bash
javac ecuacionesLineales/*.java
```

## Ejecutar

Después de compilar, ejecutar:

```bash
java ecuacionesLineales.lanzadorGauss
```

## Ejemplo de prueba

La matriz utilizada por el programa es:

```text
[ 3.0  -0.1  -0.2 |   7.85 ]
[ 0.1   7.0  -0.3 | -19.30 ]
[ 0.3  -0.2  10.0 |  71.40 ]
```

### Salida por consola

```text
Soluciones del sistema
x1 = 3.0
x2 = -2.5
x3 = 7.000000000000002
```

El valor de `x3` corresponde numéricamente a aproximadamente `7`.

## Estructura del proyecto

```text
ecuacionesLineales/
├── defMatrizz.java
├── gauss.java
└── lanzadorGauss.java
README.md
```
