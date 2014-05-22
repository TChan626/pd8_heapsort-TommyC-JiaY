//Tommy Chan
//APCS2 pd 8
//2014-05-21
//HW 42

import java.util.ArrayList;

public class Heapsort{
    
    private ALHeap heap;

    public Heapsort(){
	heap = new ALHeap();
    }
    
    private String toString(int[]data){
	String a = "[";
	for(int i = 0; i < data.length - 1; i ++){
	    a += data[i] + ", ";
	}
	a += data[data.length - 1];
	return a + "]";
    }

    public int[] sort(int[]data){
	System.out.println(toString(data));
	int length = data.length;
	if(data.length == 0)
	    return null;
	else if(data.length == 1)
	    return data;

	for(int i = 0; i < length; i ++){
	    heap.add(data[i]);
	}

	int[] retArr = new int[data.length];
	for(int a = 0; a < length; a ++){
	    retArr[a] = heap.removeMin();
	}

	System.out.println(toString(retArr));
	return retArr;
    }

    public static void main(String[]args){
	Integer[] ints = {2,15,19,18,12,22,5,4,8,10,6,7,20,3,1,25,17,23,13,16,21,14,24,9,11};
	Heapsort heaps = new Heapsort();

	heaps.sort(ints);
	


    }
}
