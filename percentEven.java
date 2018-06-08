/*Write a method called percentEven that accepts an array of integers as a parameter and returns the percentage of even 
 *numbers in the array as a real number.
*/
  


public static double percentEven(int[] array){
    double count =0;
    double k =array.length;
    if(k == 0){
        return 0.0;
    }
    for(int i =0; i< array.length; i++){
         int val =array[i];
        if(val %2 ==0){
            count++;
        }
    }
    double a = (100/k)*count;
   return  a;
}