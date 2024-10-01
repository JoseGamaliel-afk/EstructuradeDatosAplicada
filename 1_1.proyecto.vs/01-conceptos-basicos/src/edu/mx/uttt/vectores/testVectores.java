package edu.mx.uttt.vectores;

public class testVectores {

    public static void main(String[] args) {

        int tam = interger.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
         double estaturas[] = {1.75,1.80,1.75,1.65};
         imprimir(estaturas);
    }
        /*
        //decalrar y inicializar vectores
        int tam = 4;
        int[] x= new int[3];
        System.out.println(x[1]);

        double[] y  = new double[tam];
        System.out.println(y[2]);

        boolean z1[];
        z1 = new boolean[4];
        System.out.println(z1[3]);

        char x1[],x2[],x3[];
        x1= new char [tam];
        tam = 8;
        x2 = new char[tam];

        System.out.println(x2[3]);

        String zz[]={"luis","Paco","Pedro","Maria"};

        System.out.println(zz[4]);


        try {
            System.out.println(zz[3] );

        }catch (ArrayIndexOutOfBoundsException ex) {
        
System.out.println("error:"+ ex.getMessage());

  
    }
    zz[1]="Juan";
    System.out.println(zz[1]);
    */

    public static void imprimir(double arr[] ) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+"->");
        
}

}
}