

/*Write a method called mode that returns the most frequently occurring element of an array of integers. Assume that the
 *array has at least one element and that every element in the array has a value between 0 and 100 inclusive. 
 *Break ties by choosing the lower value.
 */

public int mode(int array[]){
    
    int ans = 0;
    int max = 0;
    for(int i = 0 ; i <= array.length -1; i++){
        int count = 0;
        int val = array[i];
        for(int j = 0; j < array.length -1 ; j++){
            if(val == array[j])
                count++;
           
            if(count > max){
                ans =   j ;
                max = count;}
                
        }
   
    
    }
return array[ans];
}