# dadab

##**How it Works**

The quick sort algorithm is a divide-and-conquer method utilizing recursion to sort an array. On every pass, a pivot is chosen. Then, the smaller elements on the inspected part of the area is moved to the left of the pivot, and the larger numbers to the right. The algorithm is called again on the left and right sides of the partition. Once the pivot is the same index as the left and the right, it means that for every element in the array, the numbers to the right are greater than, and the numbers to the left are less than. Thus, the array is sorted.

##**Big O Classification**
O(nlogn) on average.

## Best pivot choice / array state and associated runtime:
The pivot whos final resting spot is directly in the middle of the inspected section. This minimizes the number of passes. O(nlogn)

## Average case
Somewhere between nlogn and n^2. This is because the pivot must be between an extreme, and the middle. So, it can cut the section of array into either n-1 and itself, in the worst case, and n/2 on both sides. Therefore, we classify the algorithm as loglinear.

## Worst pivot choice / array state and associated runtime: 
The worst pivot choice would be a pivot that is the smalles or largest of the inspected section. This would only eliminate sort one number at a time. O(n^2)

Please refer to [here](https://docs.google.com/spreadsheets/d/1Cz4IlncD-2vgb6dJkJXUBLzVvh0Em00AyKuoM9bHJoc/pubhtml) for graphs showing runtimes.
##**Data Gathered**
Mean execution times for dataset of size n:

Batch size: 100

  n        | time (ms)
  -------- | ---------
1	         | 0.02
10	       | 0.02
100	       | 0.08
1000	     | 0.19
5000	     | 1.2
10000	     | 2.59
50000	     | 14.03
100000	   | 28.64
500000	   | 143.88
1000000	   | 328.75
2500000	   | 863.76
5000000	   | 1825.19
7500000	   | 2673.56
10000000	 | 3881.9

##**Analysis**
On [this spreadsheet](https://docs.google.com/spreadsheets/d/1Cz4IlncD-2vgb6dJkJXUBLzVvh0Em00AyKuoM9bHJoc/pubhtml), we have graphed a O(n) and O(nlogn) run times. It is clear from the expected runtime graph that a linear runtime is faster than a loglinear one, which is much faster than a quadratic runtime. Therefore, we expected a similar result from our tests. When graphed, our results matched what we expected: quadratic by far the slowest with loglinear next, and linear runtime the fastest. 

##**Conclusion**##
Our results show clearly that the graph of the merge sort reuntime is a translation of a loglinear graph, and therefore the algorithm is O(nlogn).

