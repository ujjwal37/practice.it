/*Write a method priceIsRight that accepts an array of integers bids and an integer price as parameters. The method returns
 *the element in the bids array that is closest in value to price without being larger than price.
 */



public int priceIsRight(int[] bids, int price) {
    int bid = -1;
    
    for(int i = 0; i < bids.length; i++) {
        if(price - bids[i] >= 0 && bids[i] > bid)
            bid = bids[i];
    }
    
    return bid;
}