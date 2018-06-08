/* Write a method named minGap that accepts an integer array as a parameter and returns the minimum 'gap' between 
 *adjacent values in the array. The gap between two adjacent values in a array is defined as the second value minus 
 *the first value
 */


public static int minGap(int[] array){
    int min = 546;
    if(array.length == 0 || array.length == 1){
        min = 0;
    }
    for(int i =0; i< array.length; i++){
        int a = array[i];
        for(int j = i+1;j<array.length; j++){
            int b = array[j];
            if(b-a<min){
                min = b-a;
            }
        }
    }
    
    return min;
}