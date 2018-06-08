/*Write a static method named range that takes an array of integers as a parameter and returns the range of values contained
 *in the array. The range of an array is defined to be one more than the difference between its largest and smallest element.
 *For example, if the largest element in the array is 15 and the smallest is 4, the range is 12. If the largest and smallest
 *values are the same, the range is 1. 
 */   


public int range(int[] arr) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    
    for(int i = 0; i < arr.length; i++) {
        if(arr[i] < min) {
            min = arr[i];
        }
        
        if(arr[i] > max) {
            max = arr[i];
        }
    }
    
    return max - min + 1;
}