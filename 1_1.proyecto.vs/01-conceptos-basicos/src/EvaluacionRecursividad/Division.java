package EvaluacionRecursividad;


// ::: PROGRAMA PARA CALCULAR LA DIVISIÓN DE UN NÚMERO POR OTRO NÚMERO :::

// 1. Realizar la validación para que el divisor no sea cero.
// 2. Realizar un método que realice la división recursiva.

public class Division {
    // Variables de instancia
    private int dividendo;
    private int divisor;

    public Division() {
        this.dividendo = 1; // Inicializar en 1 para evitar divisiones no válidas
        this.divisor = 1;   // Inicializar en 1
    }

    public Division(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = (divisor == 0) ? 1 : divisor; // Asegurarse que el divisor no sea cero
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = (divisor == 0) ? 1 : divisor; // Validación en el setter
    }

    // Método para calcular la división
    public double calcularDivision() {
        return calcularDivision(dividendo, divisor); // Iniciar el cálculo
    }

    // Método recursivo para calcular la división
    private double calcularDivision(int dividendo, int divisor) {
        // Caso base: si el dividendo es menor que el divisor, retornar 0
        if (dividendo < divisor) {
            return 0;
        }
        // Caso recursivo: restar el divisor del dividendo y contar cuántas veces se puede restar
        return 1 + calcularDivision(dividendo - divisor, divisor);
    }
}
