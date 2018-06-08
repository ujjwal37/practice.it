/*Write a method named isUnique that takes an array of integers as a parameter and that returns a boolean value indicating 
 *whether or not the values in the array are unique (true for yes, false for no). The values in the list are considered 
 *unique if there is no pair of values that are equal.
 */

public boolean isUnique(int[] array){
    int k = array.length;
    for(int i =0 ; i < k; i++){
        int val = array[i];
        for(int j = i+1 ; j< k; j++){
            if(val == array[j]){
                return false;}
        }
    }
    return true;
}