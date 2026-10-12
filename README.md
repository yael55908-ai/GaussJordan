# Practica: Metodo de Gauss-Jordan

## Descripcion
Este proyecto implementa el metodo de Gauss-Jordan en Java para resolver un sistema de ecuaciones lineales. Reutiliza la triangulacion superior de la practica de eliminacion gaussiana.

## Estructura del proyecto
- `src/Ecuaciones_Lineales/defmatrizz.java`: define la matriz aumentada.
- `src/Ecuaciones_Lineales/Gauss.java`: realiza la eliminacion gaussiana.
- `src/Ecuaciones_Lineales/Gauss_Jordan.java`: normaliza los pivotes y elimina los coeficientes superiores.
- `src/Ecuaciones_Lineales/Lanzador_gaus.java`: ejecuta el programa y muestra las soluciones.

## Como abrir y ejecutar en IntelliJ IDEA
1. Extrae la carpeta del proyecto.
2. Abre IntelliJ IDEA y elige **Open**.
3. Selecciona la carpeta `GaussJordan` que contiene este README y `src`.
4. Si IntelliJ pregunta si confias en el proyecto, confirma solo si reconoces el archivo.
5. Verifica que haya un JDK configurado. Si no lo hay, configura uno desde las opciones que muestra IntelliJ.
6. Abre `src/Ecuaciones_Lineales/Lanzador_gaus.java`.
7. Pulsa el triangulo verde junto a `main` y elige **Run**.

## Ejemplo de ejecucion
```text
Soluciones del sistema (Gauss-Jordan Modular):
x1 = 3.000000
x2 = -2.500000
x3 = 7.000000
```

## Reutilizacion de codigo
La clase `Gauss_Jordan` invoca `Gauss.eliminacionGaussiana(matriz)` para reutilizar la triangulacion superior. Despues normaliza los pivotes y elimina los coeficientes que estan por encima de ellos, por lo que obtiene las soluciones directamente de la ultima columna.

## Nota
Este ejemplo usa una matriz de 3 ecuaciones con 3 incognitas y supone que los pivotes son distintos de cero.
