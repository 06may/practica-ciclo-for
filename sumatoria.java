public class sumatoria {
    public static void main(String[] args) {
        int numero = 50;
        int sumatoria = 0;
        for (int i = 0; i <= numero; i++) {
            sumatoria += i;
        }
        System.out.println("Sumatoria desde 0 hasta " + numero + ": " + sumatoria);
        int cuadrado = sumatoria * sumatoria;
        System.out.println("Sumatoria al cuadrado: " + cuadrado);
        double raizCuadrada = Math.sqrt(sumatoria);
        System.out.println("Raíz cuadrada de la sumatoria: " + raizCuadrada);
        System.out.println("Los divisores de la sumatoria (" + sumatoria + ") son:");
        for (int i = 1; i <= sumatoria; i++) {
            if (sumatoria % i == 0) {
                System.out.println(i);
            }
        }
        long factorial = 1;
        for (int i = 1; i <= sumatoria; i++) {
            factorial *= i;
        }
        System.out.println("Factorial de la sumatoria: " + factorial);
    }
}
