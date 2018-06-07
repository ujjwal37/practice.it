public int lastIndexOf(int[] array, int val){
    for(int i = array.length - 1; i >= 0; i--){
        if(array[i] == val )
            return i;
    }
    return -1;
}# practice.it
