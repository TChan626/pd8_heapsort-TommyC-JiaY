/*****************************************************
Tommy Chan
APCS2 pd 8
2014-05-22
HW #43

 * class RunMed
 * Implements an online algorithm to track the median of a growing dataset
 * Maintains 2 heaps: minheap for upper half of dataset, maxheap for lower half
 * Median will always be one of these:
 *  - max of left heap  (lower range)
 *  - min of right heap (upper range)
 *  - mean of top of each heap

Approach:
If it's empty, insert it to the left
If the difference between the number of elements in the heaps is > 1, fix it
Insert element to the left or right depending on its value compared to the median
Continue until final median is found.
 *****************************************************/

public class RunMed {

    //instance vars
    private ALMaxHeap leftHeap;
    private ALMinHeap rightHeap;
    private int timesL;
    private int timesR;


    /*****************************************************
     * default constructor  ---  inits empty heap
     *****************************************************/
    public RunMed() 
    { 
	/*** YOUR IMPLEMENTATION HERE ***/
	leftHeap = new ALMaxHeap();
	rightHeap = new ALMinHeap();
	timesL = timesR = 0;
    }//O(1)



    /*****************************************************
     * int getMedian()  ---  returns median of dataset
     *****************************************************/
    public int getMedian() 
    {
	if(leftHeap.isEmpty())
	    return rightHeap.peekMin();
	else if(rightHeap.isEmpty())
	    return leftHeap.peekMin();
	return (leftHeap.peekMin() + rightHeap.peekMin()) / 2; 
    }//O(1)



    /*****************************************************
     * insert(int)  ---  adds a new element to the dataset
     * postcondition: dataset is maintained such that 
     *                getMedian() can run in constant time
     *****************************************************/
    public void insert( int addVal )
    {
     	/*** YOUR IMPLEMENTATION HERE ***/
	if(isEmpty()){
	    leftHeap.add(addVal);
	}else if(addVal <= getMedian()){
	    leftHeap.add(addVal);
	    timesL ++;
	}else if(addVal > getMedian()){
	    rightHeap.add(addVal);
	    timesR ++;
	}
	
	if(Math.abs(timesL - timesR) > 1){
	    if(timesL > timesR){
		rightHeap.add(leftHeap.removeMax());
		timesL --;
		timesR ++;
	    }else{
		leftHeap.add(rightHeap.removeMin());
		timesR --;
		timesL ++;
	    }
	}
	
     }//O(1)



    /*****************************************************
     * boolean isEmpty()  ---  tells whether a median may be calculated
     * postcondition: dataset structure unchanged
     *****************************************************/
    public boolean isEmpty() 
    {
	return leftHeap.isEmpty() && rightHeap.isEmpty();
    }//O(1)



    //main method for testing
    public static void main( String[] args ) {



        RunMed med = new RunMed();

        med.insert(1);
	System.out.println( med.getMedian() ); //1

        med.insert(3);
	System.out.println( med.getMedian() ); //2

        med.insert(5);
	System.out.println( med.getMedian() ); //3

        med.insert(7);
	System.out.println( med.getMedian() ); //4

        med.insert(9);
	System.out.println( med.getMedian() ); //5
	/*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }//end main()

}//end class RunMed



    /*****************************************************
     * 
     *****************************************************/
    // (  )
    // {
    // 	/*** YOUR IMPLEMENTATION HERE ***/
    // }//O(?)

