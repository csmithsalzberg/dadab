/*======================================
  class MergeSortTester

  ALGORITHM:
  The merge sort algorithm is a divide-and-conquer method utilizing
   recursion to sort an array. If the array length is one, then it is already 
   sorted, so it is added to the merging block. Otherwise, the array is split
   in half, and the halves are sorted and merged using the rsiu methodology.
   Once the recursion is complete, there will be multiple nested merge 
   calls, so the merges are merged until there is only one sorted array left.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(nlogn) for most cases
  O(n) if one element in array

  Mean execution times for dataset of size n:
  Batch size: 100
  n=1       time: 4500 ns
  n=10      time: 10000 ns
  n=100     time: 32500 ns
  ...
  n=10000   time: 1900000 ns

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/
    public static void main( String[] args ) 
    {
	int n = 1000;     // number of elements to be generated
	int batchSize = 20;  // number of times to repeat operation
	double sum = 0;       // for calculating average of runtime

	// repeat batchSize times
	for (int times = 0; times < batchSize; times++) {
	
	    // generate array with random ints from 0 to n
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++) {
		arr[i] = (int)(Math.random()*n);
	    }
	    /* int[] arr2 = new int[n];
	    for (int i = 0; i < n; i++) {
		arr2[i] = arr[i];
		}*/

	    // begin sort
	    long startTime = System.nanoTime();
	    MergeSort.sort(arr);
      	    long elapsedTime = System.nanoTime() - startTime;
	    
	    System.out.print( "Runtime merge " + (times+1) +" : " );
	    System.out.println( elapsedTime );
	    sum += elapsedTime;
	    //  long startSelect = System.nanoTime();
	    // SelectionSort.
	}

	// print average
	System.out.println( sum / batchSize );
        	
    }//end main

}//end class
