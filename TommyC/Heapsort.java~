//Tommy Chan
//APCS2 pd 8
//2014-05-19
//HW 41

/*********************************************
Best: Already sorted
Worst: Backwards

Execution time: O(n)

 ********************************************/

import java.util.ArrayList;

public class Heapsort{

    private ALHeap heap;

    public Heapsort(){
	heap = new ALHeap();
    }
    
    public Integer[] sort(Integer[]data){
	if(data.length == 0)
	    return null;
	else if(data.length == 1)
	    return data;

	for(int i = 0; i < data.length; i ++){
	    heap.add(data[i]);
	}
	
	Integer[] retArr = new Integer[data.length];
	int a = 0;
	while(!heap.isEmpty()){
	    retArr[a] = heap.removeMin();
	}
	return retArr;
    }

    public ALHeap getHeap(){
	return heap;
    }

    public static String toString(ALHeap heap){
	return heap.toString();
    }

    public static void main(String[]args){
	Integer[] ints = {1,3,5,7,9,2,4,6,8,10,11,13,15,17,19,12,14,16,18,20};
	Heapsort heaps = new Heapsort();

	System.out.println(toString(heaps.getHeap()));
	heaps.sort(ints);
	System.out.println(toString(heaps.getHeap()));
	


    }
}
