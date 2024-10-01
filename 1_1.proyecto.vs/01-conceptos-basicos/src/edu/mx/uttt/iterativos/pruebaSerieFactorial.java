package edu.mx.uttt.iterativos;

import javax.swing.JOptionPane;

public class pruebaSerieFactorial {

public static void main(String[] args) {
   
    serieFactorial sf1 = new serieFactorial();
    sf1.setN(3);
    JOptionPane.showMessageDialog(null,sf1.calcular());
}
}
