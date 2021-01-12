package main;

import matrix.MatrixTools;


public class Main {

    public static void main(String[] args){


        int[][] a = MatrixTools.createMatrix(4, 4);
        int[][] b = MatrixTools.createMatrix(5, 4);


        //#############Zusatz, anschauen fuer Interessierte########################
        
        //falsche Dreiecksmatrix erzeugen
        int[][] f=new int[5][0];
        for(int i=0;i<5;i++){
            f[i]=new int[i];
            for(int j=0;j<f[i].length;j++){
            	f[i][j] = (int) (Math.random() * 100)+1;
            }
        }

        //erstellte Matrizen in ein dreidimensionales Feld names Testreihe einfuegen
        //jedes Element der ersten Dimension enthaelt dann ein zweidimensionales Feld (Matrix)
        int[][][] test_reihe=new int[3][0][0];
        test_reihe[0]=a;
        test_reihe[1]=b;
        test_reihe[2]=f;

        for(int i=0;i<test_reihe.length;i++){
            System.out.println("Matrix "+i+": ");

            MatrixTools.printMatrix(test_reihe[i]);
            System.out.println("Spur(Matrix " + i + ") = " + MatrixTools.matrixSpur(test_reihe[i]) + "\n");
            for(int j=0;j<test_reihe.length;j++){
            	System.out.println("Multiplikation Matrix " + i + " mit Matrix " + j + ": ");
                MatrixTools.printMatrix(test_reihe[j]);

            	int[][] erg = MatrixTools.matrixMul(test_reihe[i], test_reihe[j]);
            	System.out.println("Ergebnismatrix: ");
                MatrixTools.printMatrix(erg);
                System.out.println("\n");
            }
        }
        //#############################################################
    }

}
