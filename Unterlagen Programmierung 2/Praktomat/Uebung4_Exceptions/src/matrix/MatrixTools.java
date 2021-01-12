package matrix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import exception.InvalidMatrixException;
import exception.MatricesNotMultipliableException;
import exception.MatrixNotInitializedException;
import exception.MatrixSpurNotAvailableException;

public class MatrixTools {

    public static int[][] createMatrix(int m, int n){
        int[][] matrix=new int[m][n];
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=(int) (Math.random()*10)+1;
            }
        }

        return matrix;
    }
    
    //Methode zum Ermitteln der maximalen 
    //String-Laenge aller Werte einer Matrix
    private static int getFormatLength(int[][] m){
    	int maxLength = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
            	//aktuellen Wert in String wandeln
            	String s = String.format("%d", m[i][j]);
            	//maximale Laenge speichern
            	if ( s.length()>maxLength )
            		maxLength = s.length();
            }
        }
        
        //enthaelt maximale String-Laenge aller int-Werte
        return maxLength;
    }

    //gibt eine Matrix auf Kommandozeile aus
    //die Ausgabe wird so formatiert dass alle Spaltenwerte 
    //automatisch eingerueckt untereinander stehen
    public static void printMatrix(int[][] m){
    	if( m==null ){
    		System.out.println("Matrix ist null");
    		return;
    	}
    	
    	//Format-Laenge ermitteln lassen
    	int formatLength = getFormatLength(m);
    	//Format-String bilden
    	String fmt = "%" + formatLength + "d";
    	
        for (int i = 0; i < m.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < m[i].length; j++) {
            	//Ausgabe formatieren
            	String out = String.format(fmt, m[i][j]);
                System.out.print(out + " ");
            }
            System.out.println("|");
        }
    }
    
    public static int matrixSpur(int[][] matrix) throws MatrixSpurNotAvailableException, MatrixSpurNotAvailableException, MatrixNotInitializedException, InvalidMatrixException{
    	
    	MatrixDimension dimA = new MatrixDimension(matrix);
    	
    	if(dimA.getHeight() != dimA.getWidth()) {
    		throw new MatrixSpurNotAvailableException("Matrix nicht quadratisch");
    	}
    	
    	int spur=0;
        for(int i=0;i<matrix.length;i++){        	
        		
        	spur += matrix[i][i]+1;
        }
        
        return spur;
    }

    public static int[][] matrixMul(int[][] a, int[][] b) throws MatricesNotMultipliableException, MatrixNotInitializedException, InvalidMatrixException{
    	MatrixDimension dimA = new MatrixDimension(a);
    	MatrixDimension dimB = new MatrixDimension(b);
    	
    	
    	if( a==null || b==null || b[0]==null )
    		throw new MatrixNotInitializedException();

        int[][] c=new int[a.length][b[0].length];
        for(int k=0;k<a.length;k++){
            //Fehlerprüfung, wenn Zeilen- nicht gleich Spaltenanzahl dann Fehler
        	if(dimA.getHeight() != dimB.getWidth()) 
        		throw new MatricesNotMultipliableException();
            	
            for(int i=0;i<b[0].length;i++){
                c[k][i]=0;
                for(int j=0;j<b.length;j++){
                    c[k][i]+=a[k][j]*b[j][i];
                }
            }
        }

        return c;
    }
    
//    public static int[][] getMatrixFromFile(String filename) throws IOException{
//    	
//    	BufferedReader br1 = new BufferedReader(new FileReader(filename));
//    	BufferedReader br2 = new BufferedReader(new FileReader(filename));
//    	
//    	
//    	String[] array = null;
//    	int[][] mat = null;
//    	
//    	try{
//    		array = new String[(int)br1.lines().count()];
//    	
//    	
//    		mat = new int[array.length][];
//    	
//    		for(int i = 0; i < array.length; i++) {
//    			String[] split = br2.readLine().split("\\s");
//    			mat[i] = new int[split.length];
//    		
//    			for(int j = 0; j < mat[i].length; j++) {
//    				mat[i][j]= Integer.parseInt(split[j]);
//    			}
//    		}
//    	
//    	}catch(NullPointerException e){
//    		e.printStackTrace();
//    	}
//    	
//    	br1.close();
//    	br2.close();
//    	
//    	return mat;	
//    }
    
    public static int[][] getMatrixFromFile(String filename) throws NumberFormatException{
		Scanner sc = null;
		try{
			sc = new Scanner(new File(filename), "UTF-8");
		}catch(IOException e) {
			e.printStackTrace();
			return null;
		}
		
		ArrayList<String> list = new ArrayList<String>();
		int[][] mat = null;
		sc.useLocale(Locale.GERMANY);
		int zeile = 0;
		
		//Zeilenweise als String einlesen
		while (sc.hasNext()) { 
        	list.add(sc.nextLine());
			zeile++;
        }
		
		mat = new int[zeile][];
		
		//Zeilenweise gesplitteten String in einen int Array speichern  
        for(int i = 0; i < zeile; i++) {
        	//zeilenString bei leerzeichen splitten
        	String [] split = list.get(i).toString().split("\\s+");
        	
        	//Matrixzeilenlänge initialisieren
        	mat[i] = new int[split.length];
        	
        	// Einträge der Arraylist zeilenweise in einen int array speichern
        	for(int j = 0; j < split.length; j++) {
        		mat[i][j] = Integer.parseInt(split[j]);	
        	}	
        }
               
        sc.close();
    	return mat;
    }
}
