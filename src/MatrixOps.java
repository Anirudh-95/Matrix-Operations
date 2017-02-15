public class MatrixOps
{
	public static double[][] multiply(double[][] matrix1, double[][] matrix2)
	{
		   int rowsInA = matrix1.length;
	       int columnsInA = matrix1[0].length; 
	       int columnsInB = matrix2[0].length;
	       double[][] c = new double[rowsInA][columnsInB];
	       if(rowsInA!=columnsInB)
	    	   return null;
	       else{
	       for (int i = 0; i < rowsInA; i++) {
	           for (int j = 0; j < columnsInB; j++) {
	               for (int k = 0; k < columnsInA; k++) {
	                   c[i][j] = c[i][j] + matrix1[i][k] * matrix2[k][j];
	               }
	           }
	       }
	           return c;
	}
  }
}