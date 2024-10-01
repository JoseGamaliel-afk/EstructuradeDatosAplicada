package EvaluacionRecursividad;
// ::: PROGRAMA PARA CALCULAR EL PRODUCTO DE DOS NUMEROS POR SUMAS :::

// 1. Realizar la validación para que las variables de instancia nunca sean cero
// 2. Realizar un método que calcule el producto de dos números usando sumas
// 3. Realizar un método que utilice recursividad para el cálculo

public class ProductoPorSuma {
    // Variables de instancia
    private int a;
    private int b;

    public ProductoPorSuma() {
        this.a = 1;
        this.b = 1;
    }

    public ProductoPorSuma(int a, int b) {
        this.a = (a < 0) ? 1 : a; // Asegurarse que no sea negativo
        this.b = (b < 0) ? 1 : b; // Asegurarse que no sea negativo
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = (a < 0) ? 1 : a; // Validación en el setter
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = (b < 0) ? 1 : b; // Validación en el setter
    }

    // Método para calcular el producto usando sumas
    public int calcularProducto() {
        return calcularProducto(a, b);
    }

    // Método recursivo para calcular el producto
    private int calcularProducto(int a, int b) {
        // Caso base: si b es 0, el producto es 0
        if (b == 0) {
            return 0;
        }
        // Caso recursivo: sumar 'a' a sí mismo 'b' veces
        return a + calcularProducto(a, b - 1);
    }

@Override
public String toString() {
    return "El Producto(" + this.a + ", " + this.b + ") = " + this.calcularProducto();
}
}