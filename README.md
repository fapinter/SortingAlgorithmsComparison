# SortingAlgorithmsComparison

Sorting Algorithms Performance Evaluation
Requirements Overview
This project implements six sorting algorithms, including Quicksort, Shellsort, and Heapsort. The remaining three algorithms are selected at the team's discretion, with the restriction that Bubblesort must not be used. The size of the array will be provided by the user.

# Algorithms to be Implemented
Quicksort
Shellsort
Heapsort
Merge Sort
Insertion Sort
Selection Sort
Evaluation Criteria
### All six algorithms will be assessed under the following conditions:

Nearly Sorted Sets: This set contains only 5% to 10% of keys out of order. Starting with an ordered set, a few keys will be swapped randomly to achieve the specified percentage of out-of-place keys.

Completely Unordered Sets: The array will be populated with randomly generated large integer keys to minimize the chance of duplication in the dataset.

Sorted in Descending Order: An array that is ordered in ascending order will be reversed to create a descending order dataset.

### Performance Measurement
The performance of each algorithm will be measured in seconds. All algorithms will receive the same input datasets (values) to ensure comparability of the execution times.

### Output Format
The output of the system will be structured as follows:

```
Array Size: 10,000

Execution Times for Each Algorithm

Algorithm      Nearly Sorted      Unordered        Descending Order
--------------------------------------------------------------------
Quicksort      2.5 s             0.06 s          3.5 s
Shellsort      0.07 s            0.07 s          4.8 s
Heapsort       0.06 s            0.05 s          0.05 s
...
```

### Report Submission
In addition to the program presentation, a report will be submitted analyzing the results obtained for different array sizes (e.g., 50,000; 100,000; 500,000; 1,000,000). This report will include performance graphs and a thorough discussion of the results, explaining them based on the concepts and characteristics of the algorithms used. Please note that merely presenting graphs without analysis will result in a lower score for this section.

### Conclusion
This project aims to provide a comprehensive evaluation of various sorting algorithms under different conditions. The results will contribute to a better understanding of algorithm performance in practical scenarios. Your feedback and contributions are welcome!
