package EvaluacionRecursividad;

public class FraccionConPotencia {
 private int n;

public int getN() {
    return n;
}

public void setN(int n) {
    this.n = n;
}
 
private double calcular(double n) {
   
        if (n == 1) {
            return 1;
        }
        return   n / (n + 1) * calcular(n - 1);
    }
    }
    
    


        
    


