/*Write a method named longestSortedSequence that accepts an array of integers as a parameter and that returns the length 
 *of the longest sorted (nondecreasing) sequence of integers in the array
 */



public int longestSortedSequence(int[] a) {
    if(a.length == 0)
        return 0;

    int maxLen = 1;
    int len = 1;
    
    for(int i = 1; i < a.length; i++) {
        if(a[i-1] <= a[i]) {
            len++;
        } else {
            if(len > maxLen) {
                maxLen = len;
            }
            
            len = 1;
        }
    }
    
    return Math.max(maxLen, len);
}