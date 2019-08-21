## Escuela Colombiana de Ingeniería
## Arquitectura de software - ARSW
## Laboratorio 1 - BBP Formula
### Part 1
* How does the output change? Why?

La salida altera su orden, pues al ejercutarse con Start() java de fondo genera los hilos independientes permitiendo la "ejecución en paralelo". Mientras que al usar Run(), no se generan nuevos hilos, lo cual causa una "programación secuencial".

### Part 3

Esta imagén muestra el rendimiento al trata de calcular 100000 datos con 200 hilos.
![alt text1](https://github.com/Stilink/ARSW-Lab1-Part1/blob/master/img/100000VS200.png)
Esta imagén muestra el rendimiento al trata de calcular 100000 datos con 500 hilos.
![alt text2](https://github.com/Stilink/ARSW-Lab1-Part1/blob/master/img/100000VS500.png)
