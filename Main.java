import java.util.Scanner;
import java.util.Random;

import SortingAlgorithms.QuickSort;

public class Main {
    public static void main(String []args){

        //Creating Objects from the Algorithms Classes;
        QuickSort qs = new QuickSort();

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho da amostra desejada (tamanho dos arrays): ");
        int arraysSize = sc.nextInt();
        sc.close();

        int []arrayAlmostSorted = new int[arraysSize];
        int []arraySortedDecreased  = new int[arraysSize];
        int []arrayNotSorted = new int[arraysSize];

        //Range
        Random gen  = new Random();
        int min = 0;
        int max = arraysSize;

        for(int i = 0; i < arraysSize; i++){
            int currNum = gen.nextInt(max+1);
            arrayNotSorted[i] = currNum;
            arrayAlmostSorted[i] = currNum;
            arraySortedDecreased[i] = currNum;
        }
        //Quicksort used to Sort the arrays but this part will not be
        //considered in the comparison of algorithms
        qs.quicksortDESC(arraySortedDecreased, 0, arraySortedDecreased.length - 1);
        qs.quicksort(arrayAlmostSorted, 0, arrayAlmostSorted.length -1);

        int randomPercentage = gen.nextInt(10 - 5) + 5;

        //For loop created to set 5 - 10 % of the array to not sorted
        for(int i = 0; i < randomPercentage; i++){
            int first = gen.nextInt(arraysSize-1);
            int last = gen.nextInt(arraysSize-1);

            int temp = arrayAlmostSorted[first];
            arrayAlmostSorted[first] = arrayAlmostSorted[last];
            arrayAlmostSorted[last] = arrayAlmostSorted[temp];
        }

        testAlgorithms(1, arrayAlmostSorted, arraySortedDecreased, arrayNotSorted);
    }
    //The parameter algorithm will define which algorithm will be used to do the Sorting
    public static void testAlgorithms(int algorithm, int[] arrayAlmostSorted,
                                      int[] arrayDesc, int[]arrayNotSorted){

        //Creating a clone for the arrays
        int[] copyAlmostSorted = arrayAlmostSorted.clone();
        int[] copyArrayDesc = arrayDesc.clone();
        int[] copyArrayNotSorted = arrayNotSorted.clone();


        if(algorithm == 1){
            //QuickSort testing
            QuickSort qs = new QuickSort();
            double almostSortedTimer, descTimer, notSortedTimer, startTimer, endTimer;

            startTimer = System.currentTimeMillis();
            qs.quicksort(copyAlmostSorted, 0, copyAlmostSorted.length-1);
            endTimer = System.currentTimeMillis();
            almostSortedTimer = (endTimer - startTimer)/1000;

            startTimer = System.currentTimeMillis();
            qs.quicksort(copyArrayDesc, 0, copyAlmostSorted.length-1);
            endTimer = System.currentTimeMillis();
            descTimer = (endTimer - startTimer)/1000;

            startTimer = System.currentTimeMillis();
            qs.quicksort(copyArrayNotSorted, 0, copyAlmostSorted.length-1);
            endTimer = System.currentTimeMillis();
            notSortedTimer = (endTimer - startTimer)/1000;

            System.out.println("--- QuickSort ---");
            System.out.println("Almost Sorted Array: "+almostSortedTimer+"s");
            System.out.println("Descending Order Array: "+descTimer+"s");
            System.out.println("Not Sorted Array: "+notSortedTimer+"s");

        }
    }
}
