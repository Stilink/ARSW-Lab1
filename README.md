## Escuela Colombiana de Ingeniería
## Arquitectura de software - ARSW
## Laboratorio 1 - BBP Formula
### Part 1
* How does the output change? Why?

La salida cambia pues sin utilizar el comando Start(), la ejecución del main resulta ser "Secuencial", es decir, al invocar el metodo run() solo estamos "ejecutando" dicho metodo, no ejecutandolos concurrentemente con los demás, solo entra al metodo run, hace lo que dice dicho metodo y sale, al salir es donde permite que las demás lineas de codigo del main sean ejecutadas. El metodo Start es quien cuenta con los medios necesarios para iniciar el hilo de manera independiente y permitir la ejecución concurrente con los demás. 
