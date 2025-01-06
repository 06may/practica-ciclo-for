### PRÁCTICA: CICLO FOR
 
### Descripción: Desarrollar un programa que determine los divisores de un número definido previamente. Este programa utilizará un ciclo for para iterar a través de posibles divisores y verificará si cada número es divisor utilizando el operador módulo (`%`).


### Código 

    // Clase principal para determinar divisores de un número

    public class Divisores {

    public static void main(String[] args) {

        // Declaración de la variable número

        int numero = 30;

        // Mensaje inicial indicando el número analizado

        System.out.println("Los divisores de " + numero + " son:");

        // Ciclo for para encontrar y mostrar los divisores

        for (int i = 1; i <= numero; i++) {

            // Verifica si el número actual es divisor

            if (numero % i == 0) {

                // Imprime el divisor

                System.out.print(i + " ");

            }

        }

     }

    }


### Sumatoria y Operaciones Matemáticas

### Descripción: El objetivo de este programa es realizar las siguientes operaciones a partir de la sumatoria de un ciclo, desde `0` hasta un número entero definido previamente:

1. Calcular la **sumatoria**. 

2. Elevar el resultado de la sumatoria al **cuadrado**. 

3. Obtener la **raíz cuadrada** del resultado utilizando `Math.sqrt(numero)`. 

4. Determinar los **divisores** del resultado. 5. Calcular el **factorial** del resultado de la sumatoria.
 
### codigo  

    // Declaración de la clase principal

    public class Sumatoria {

    public static void main(String[] args) {

        // Definir el número límite para el cálculo de la sumatoria

        int numero = 50;

        // Inicializar la variable para almacenar la sumatoria

        int sumatoria = 0;

        // Calcular la sumatoria desde 0 hasta el número definido

        for (int i = 0; i <= numero; i++) {

            sumatoria += i;

        }

        // Imprimir la sumatoria

        System.out.println("Sumatoria desde 0 hasta " + numero + ": " + sumatoria);

        // Calcular el cuadrado de la sumatoria

        int cuadrado = sumatoria * sumatoria

        // Imprimir el cuadrado de la sumatoria

        System.out.println("Sumatoria al cuadrado: " + cuadrado);

        // Calcular la raíz cuadrada de la sumatoria

        double raizCuadrada = Math.sqrt(sumatoria);

        // Imprimir la raíz cuadrada de la sumatoria

        System.out.println("Raíz cuadrada de la sumatoria: " + raizCuadrada);

        // Imprimir un mensaje indicando que se calcularán los divisores

        System.out.println("Los divisores de la sumatoria (" + sumatoria + ") son:");

        // Determinar e imprimir los divisores de la sumatoria

        for (int i = 1; i <= sumatoria; i++) {

            if (sumatoria % i == 0) {

                System.out.println(i);

            }

        }

        // Inicializar la variable para calcular el factorial

        long factorial = 1;

        // Calcular el factorial de la sumatoria

        for (int i = 1; i <= sumatoria; i++) {

            factorial *= i;

        }

        // Imprimir el factorial de la sumatoria

        System.out.println("Factorial de la sumatoria: " + factorial);

      }
 
    }

