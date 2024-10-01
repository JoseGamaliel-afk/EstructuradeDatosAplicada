package edu.mx.uttt.Recursividad;

public class imprimirNumeros {

    public static void main(String[] args) {
        imprimir(5);
    }
    public static void imprimir(int n){
        if(n == 1){
            System.out.println("Hola Mundo");
        }else{
            System.out.println("Hola Mundo");
            imprimir(n-1);
        }
    }
}