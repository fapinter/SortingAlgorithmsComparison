package SortingAlgorithms;

public class QuickSort {

    //returns the index in which the array is partitioned in two sub-arrays
    private int partitionAsc(int []array, int low, int high){
        int pivot = array[high];

        int i = (low - 1);

        for(int j = low; j < high; j++){
            if(array[j] <= pivot){
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return (i + 1);
    }
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
        return (i + 1);
    }
    public void quicksortASC(int []array, int low, int high){
        //If low >= high, then the array is Sorted
        if(low >= high) return;
        //pivot is only the index of the array, not the value itself
        //If Ascending mode is activated, sorting is done in ascending order
        //Otherwise sorting is done in descending order
        int pivot = partitionAsc(array, low, high);

        quicksortASC(array, low, pivot-1);
        quicksortASC(array, pivot+1, high);
    }
    public void quicksortDESC(int []array, int low, int high){
        //If low >= high, then the array is Sorted
        if(low >= high) return;
        //pivot is only the index of the array, not the value itself
        //If Ascending mode is activated, sorting is done in ascending order
        //Otherwise sorting is done in descending order
        int pivot = partitionDesc(array, low, high);

        quicksortDESC(array, low, pivot-1);
        quicksortDESC(array, pivot+1, high);
    }
    public void quicksort(int []values, int low, int high)
    {
        int i, j, pivo, aux;
        i = low;
        j = high-1;
        pivo = values[(low + high) / 2];
        while(i <= j)
        {
            while(values[i] < pivo && i < high)
            {
                i++;
            }
            while(values[j] > pivo && j > low)
            {
                j--;
            }
            if(i <= j)
            {
                aux = values[i];
                values[i] = values[j];
                values[j] = aux;
                i++;
                j--;
            }
        }
        if(j > low)
            quicksort(values, low, j+1);
        if(i < high)
            quicksort(values, i, high);
    }
}
