//Tommy Chan
//APCS2 pd 8
//2014-05-20

import java.util.ArrayList;

public class Heapsort{

    private ALHeap heap;

    public Heapsort(){
	heap = new ALHeap();
    }
    
    private String toString(Integer[]data){
	String a = "[";
	for(int i = 0; i < data.length - 1; i ++){
	    a += data[i] + ", ";
	}
	a += data[data.length - 1];
	return a + "]";
    }

    public Integer[] sort(Integer[]data){
	System.out.println(toString(data));
	int length = data.length;
	if(data.length == 0)
	    return null;
	else if(data.length == 1)
	    return data;

	for(int i = 0; i < length; i ++){
	    heap.add(data[i]);
	}

	Integer[] retArr = new Integer[data.length];
	for(int a = 0; a < length; a ++){
	    retArr[a] = heap.removeMin();
	}

	System.out.println(toString(retArr));
	return retArr;
    }

    public static String toString(ALHeap heap){
	return heap.toString();
    }

    public static void main(String[]args){
	Integer[] ints = {1,3,5,7,9,2,4,6,8,10,11,13,15,17,19,12,14,16,18,20};
	Heapsort heaps = new Heapsort();

	heaps.sort(ints);
	


    }
}