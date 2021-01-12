package matrix;


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
    
    public static int matrixSpur(int[][] matrix){
    	if( matrix==null || matrix[0]==null )
    		return 0;
    	
    	int spur=0;
        for(int i=0;i<matrix.length;i++){
        	//Pruefung quadratisch
        	if( matrix[i].length!=matrix.length )
        		return 0;
        		
        	spur += matrix[i][i]+1;
        }
        
        return spur;
    }

    public static int[][] matrixMul(int[][] a, int[][] b){
    	//null-Pruefung der Parameter
    	if( a==null || b==null || b[0]==null )
    		return null;

        int[][] c=new int[a.length][b[0].length];
        for(int k=0;k<a.length;k++){
            //Fehlerprüfung, wenn Zeilen- nicht gleich Spaltenanzahl dann Fehler
            if(a[k].length!=b.length)
                return null;
            
            for(int i=0;i<b[0].length;i++){
                c[k][i]=0;
                for(int j=0;j<b.length;j++){
                    c[k][i]+=a[k][j]*b[j][i];
                }
            }
        }

        return c;
    }

}
