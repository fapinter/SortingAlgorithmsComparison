package SortingAlgorithms;

public class QuickSort {

    private int partitionDesc(int []array, int low, int high){
        int pivot = array[high];

        int i = (low - 1);

        for(int j = low; j < high; j++){
            if(array[j] >= pivot){
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        //Returns the index used as Pivot
        return (i + 1);
    }

    //Function only used to set the arrays for the testing

    public void quicksortDESC(int []array, int low, int high){
        //Arrays with 1 element
        if(low >= high) return;

        int pivotIndex = partitionDesc(array, low, high);

        quicksortDESC(array, low, pivotIndex-1);
        quicksortDESC(array, pivotIndex+1, high);
    }

    public void quicksort(int []array, int low, int high){
        int i = low;
        int j = high;
        int temp;

        //Chooses the Center element as the pivot
        //Causing better performance in Worst Case scenarios
        int pivot = array[(low + high) / 2];

        //Partition section of the Algorithm
        while(i <= j){
            //Increments i until finds a value Greater than the pivot
            while(array[i] < pivot && i < high) i++;

            while(array[j] > pivot && j > low) j--;

            //Swaps the value of the pointers
            if(i <= j){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        //Only allows recursion with 2 elements or more
        //For both sub-arrays
        if(low < j) quicksort(array, low, j);

        if(i < high) quicksort(array, i, high);
    }
}
