package EvaluacionRecursividad;



// ::: PROGRAMA PARA CALCULAR LA SUMA DE LA SERIE :::
// Suma: 1/n + 2/n + 3/n + ... + a/n
// 1. Realizar la validación para que el denominador no sea cero.
// 2. Realizar un método que calcule la suma usando recursividad.

public class SumaSerie {
    // Variables de instancia
    private int a; // límite superior de la serie
    private int n; // denominador

    public SumaSerie() {
        this.a = 1;
        this.n = 1;
    }

    public SumaSerie(int a, int n) {
        this.a = (a < 1) ? 1 : a; // Asegurarse que 'a' sea mayor o igual a 1
        this.n = (n <= 0) ? 1 : n; // Asegurarse que 'n' no sea cero o negativo
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = (a < 1) ? 1 : a; // Validación en el setter
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n <= 0) ? 1 : n; // Validación en el setter
    }

    // Método para calcular la suma de la serie
    public double calcularSuma() {
        return calcularSuma(a, n);
    }

    // Método recursivo para calcular la suma de la serie
    private double calcularSuma(int a, int n) {
        // Caso base: si 'a' es 0, la suma es 0
        if (a == 0) {
            return 0;
        }
        // Caso recursivo: sumar el término actual 'a/n' y continuar con 'a - 1'
        return (double) a / n + calcularSuma(a - 1, n);
    }

    @Override
    public String toString() {
        return "La suma de la serie (1/" + n + " + 2/" + n + " + ... + " + a + "/" + n + ") es: " + calcularSuma();
    }
}
