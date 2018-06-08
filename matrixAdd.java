
/*Write a method named matrixAdd that accepts a pair of two-dimensional arrays of integers as parameters, 
 *treats the arrays as 2D matrices and adds them, returning the result.
 */


public static int[][] matrixAdd(int[ ][ ] a1,int[ ][ ] a2){
    if(a1.length == 0 || a2.length ==0){
        return new int[0][0];
    }else{
         int[][] result = new int[a1.length][a1[0].length];
         for(int i =0 ; i< result.length; i++){
             for(int j=0; j < result[0].length;j++){
                 result[i][j] = a1[i][j]+a2[i][j];
             }
         }
        return result;
    }
}