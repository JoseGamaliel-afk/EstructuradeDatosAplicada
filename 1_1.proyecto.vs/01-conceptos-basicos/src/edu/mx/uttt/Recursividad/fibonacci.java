package edu.mx.uttt.Recursividad;

public class fibonacci {

    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        if (n>=0) {
            this.n=n;  
        }
    }
    public int calFib(int n){
        return (n<1)?n:calFib(n-1)+calFib(n-2);
       
    }

}

