//Tommy Chan
//APCS2 pd 8
//2014-05-21
//HW 42

import java.util.ArrayList;

public class Heapsort{
<<<<<<< HEAD
    
    private ALHeap heap;

    public Heapsort(){
	heap = new ALHeap();
    }
    
    private String toString(int[]data){
=======

    private int[]data;
    
    public Heapsort(int[]stuff){
	data = stuff;
    }
    
    public String toString(){
>>>>>>> 2bc232313dda8dfd9dc91e089880218fd9589886
	String a = "[";
	for(int i = 0; i < data.length - 1; i ++){
	    a += data[i] + ", ";
	}
	a += data[data.length - 1];
	return a + "]";
    }

<<<<<<< HEAD
    public int[] sort(int[]data){
	System.out.println(toString(data));
	int length = data.length;
	if(data.length == 0)
	    return null;
	else if(data.length == 1)
	    return data;
=======
    private void swap(int[]data, int pos1, int pos2){
	int temp = data[pos1];
	data[pos1] = data[pos2];
	data[pos2] = temp;
    }
>>>>>>> 2bc232313dda8dfd9dc91e089880218fd9589886

    private int minChildPos( int pos ) {
	int retVal;
	int lc = 2*pos + 1; //index of left child
	int rc = 2*pos + 2; //index of right child

<<<<<<< HEAD
	int[] retArr = new int[data.length];
	for(int a = 0; a < length; a ++){
	    retArr[a] = heap.removeMin();
	}
=======
	//pos is not in the heap or pos is a leaf position
	if ( pos < 0 || pos >= data.length || lc >= data.length )
	    retVal = -1;
	//if no right child, then left child is only option for min
	else if ( rc >= data.length )
	    retVal = lc;
	//have 2 children, so compare to find least 
	else if ( data[lc] < data[rc] )
	    retVal = lc;
	else
	    retVal = rc;
	return retVal;
    }
>>>>>>> 2bc232313dda8dfd9dc91e089880218fd9589886

    public int[] sort(){
	System.out.println(toString());
	for(int i = 1; i < data.length; i ++){ //heapify
	    if(data[i] < minChildPos(i))
		swap(data, i, minChildPos(i));
	}
	for(int a = 1; a < data.length; a ++){
	    int root = data[0]; //store min val
	    data[0] = data[data.length - a];
	    if(data[a] < minChildPos(a)){
		swap(data, a, minChildPos(a));
	    }
	    data[data.length - a] = root;
	}
	System.out.println(toString());
	return data;
    }
	

    // public int[] sort(int[]data){
    // 	System.out.println(toString(data));
    // 	int length = data.length;
    // 	if(data.length == 0)
    // 	    return null;
    // 	else if(data.length == 1)
    // 	    return data;

    // 	for(int i = 0; i < length; i ++){
    // 	    heap.add(data[i]);
    // 	}

    // 	int[] retArr = new int[data.length];
    // 	for(int a = 0; a < length; a ++){
    // 	    retArr[a] = heap.removeMin();
    // 	}

    // 	System.out.println(toString(retArr));
    // 	return retArr;
    // }

    public static void main(String[]args){
<<<<<<< HEAD
	Integer[] ints = {2,15,19,18,12,22,5,4,8,10,6,7,20,3,1,25,17,23,13,16,21,14,24,9,11};
	Heapsort heaps = new Heapsort();
=======
        int[] ints = {1,3,5,7,9,2,4,6,8,10,11,13,15,17,19,12,14,16,18,20};
	Heapsort heaps = new Heapsort(ints);
>>>>>>> 2bc232313dda8dfd9dc91e089880218fd9589886

	heaps.sort();
	


    }
}
