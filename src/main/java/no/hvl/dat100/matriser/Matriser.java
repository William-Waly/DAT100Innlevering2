package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int rad = 0; rad < matrise.length; rad++) {
			System.out.println();
			for (int kol = 0;kol < matrise[rad].length; kol++) {
				System.out.print(matrise[rad][kol] + " ");
			}
		}
	}

	
   // b)
	    public static String tilStreng(int[][] matrise) {
	        StringBuilder sb = new StringBuilder(); 
	        
	        for (int i = 0; i < matrise.length; i++) { 
	            for (int j = 0; j < matrise[i].length; j++) { 
	                sb.append(matrise[i][j]); 
	                if (j < matrise[i].length - 1) { 
	                    sb.append(" ");
	                }
	            }
	            sb.append(" \n");
	        }

	        return sb.toString(); 
	    }

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length != b.length) return false;

		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) return false;
			for (int j = 0; j < a[i].length; j++) {
		    if (a[i][j] != b[i][j]) return false;
		        }
		    }

		    return true;
		}
	}