/*Write a method called median that accepts an array of integers as its argument and returns the median of the numbers in
 *the array. The median is the number that will appear in the middle if you arrange the elements in order.
 *Assume that the array is of odd size (so that one sole element constitutes the median) and that the numbers
 *in the array are between 0 and 99 inclusive.
 */



public static int median(int[] array){
    int a =0,b=0;    
    int k =array.length;
    for (int i = 0; i < array.length; i++) {
        int min = array[i];
        
        for (int j = i + 1; j < array.length; j++) {
            if (array[j] < min) {
                int temp = min;
                array[i] = array[j];
                array[j] = temp;
                min = array[i];
            }
        }
    }
 
        a= (k+1)/2;
  
    return array[a-1];
} 