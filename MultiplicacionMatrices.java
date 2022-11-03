package POB;

//Jesús Eduardo Nava Castan


import java.util.Scanner;

public class MultiplicacionMatrices
{

    public static int getInt() // esta función la ocupo para que el usuario ponga número entero de filas y renglones de la matriz
    {
        int thevalue;
        Scanner keybord;
        //
        keybord = new Scanner(System.in);
        thevalue = keybord.nextInt();
        return thevalue;
    }//end getInt

    public static double getDouble() // esta función la ocupo para que el usuario ponga número double de filas en coords de la matriz
    {
        double theValue;
        Scanner keybord;
        //
        keybord = new Scanner(System.in);
        theValue = keybord.nextDouble();
        return theValue;
    }//end getDouble

    public static double[][]getDoubleMatriz(int n , int m) //función que obtiene una matriz de tipo double
    {
        double [] [] matriz;
        //
        matriz = new double[n][m];
        for(int i = 0; i < n; i = i + 1)
        {
            for( int j = 0; j<m; j = j + 1)
            {
                System.out.print("Dato "  + i + " , " + j + " :  " );
                matriz [i][j]= getDouble();
            }//end for
        }//end for

        return matriz;
    }//end getDourbleMatriz


    public static void printDoubleMatriz(double [] [] matriz) // función para imprimir matrizDouble
    {
        int n;
        int m;
        //
        n = matriz.length;
        m = matriz[0].length;
        //

        for(int i = 0; i < n; i = i+1)
        {
            for( int j = 0; j<m; j = j+1)
            {
                System.out.printf("%10.2f",matriz [i]  [j]);
                System.out.print("    ");
            }//end for
            System.out.println();
        }//end for

    }//end printDoubleMatriz




    public static double[][] getMultiplicacionDeMatrices(double[][] matriz, double[][] matrizdos) //función para hacer multiplicación de matrices
    {
        int i; //filas
        int j; // columnas
        int nf;
        int nc;
        double[][] result;

        //
        nf = matriz.length;
        nc = matrizdos[0].length;
        //
        result = new double[nf][nc];

        if(matriz.length == matrizdos.length && matriz[0].length == matrizdos[0].length)
        {
            System.out.println("La multiplicación es:  ");



            for(i=0; i<nf; i=i+1) //filas
            {
                for(j=0; j<nc; j=j+1) //columnas
                {
                    for(int f = 0; f<nf; f++ ){
                        result [i][j] += matriz[i][f] * matrizdos[f][j]; // += sumar cantidad a una variable
                    }


                }//end for


            }//end for

        }//end if
        else
        {
            System.out.println("No se puede multiplicar, verifique las dimensiones de las matrices  ");

        }


        // posible idea para matrices de diferentes dimensiones
        //  if(matriz.length != matrizdos.length && matriz[0].length != matrizdos[0].length){
        //    System.out.println("La multiplicación es:  ");
        //  double [][] MatrizNueva = new double [nf][nf];

        //l = filas, c = columnas

        //for(int l = 0; l<nf; l++){
        //  for(int c =0; c<nc; c++){
        //    for(int p = 0; p<nf;p++){
        //      MatrizNueva [l][c] += matriz[l][p] * matrizdos[p][c];
        //    MatrizNueva = result;


        //  }
        //}
        //}

        //}
        return result;
    }//end MultiplicacionMatrices



    public static void main(String args[])
    {
        double[][] matriz;
        double[][] matrizdos;
        double[][] result;
        int n;
        int m;
        //

        //
        System.out.print("Ingrese los renglones de la PRIMERA matriz:  ");
        n = getInt();
        System.out.print("Ingrese las columnas de la PRIMERA matriz:  ");
        m = getInt();
        matriz = getDoubleMatriz(n,m);
        System.out.print("Ingrese los renglones de la SEGUNDA matriz:  ");
        n = getInt();
        System.out.print("Ingrese las columnas de la SEGUNDA matriz:  ");
        m = getInt();
        matrizdos = getDoubleMatriz(n,m);
        //
        System.out.println("La matriz uno es:");
        printDoubleMatriz(matriz);

        System.out.println("");

        System.out.println("La matriz dos  es:");
        printDoubleMatriz(matrizdos);

        System.out.println("");

        result = getMultiplicacionDeMatrices(matriz,matrizdos);
        printDoubleMatriz(result);
    }//end main


}//end class