package SortingAlgorithms;

public class MergeSort {

    public void mergeSort(int []array, int low, int high) { //method to sort
        if(low < high){
            int mid = (high + low) /2; //divide the array in two subarrays

            mergeSort(array, low, mid); //sort the left subarray
            mergeSort(array, mid + 1, high); //sort the right subarray
            merge(array, low, mid, high); //combine the two subarray
        }
    }

    public void merge(int []array, int low, int mid, int high) { //method to combine
        int left = (mid - low) + 1; //left size
        int right = high - mid; //right size

        int[] leftArray = new int[left]; //new temporary left array
        int[] rightArray = new int[right]; //new temporary right array

        //passing the elements to the temporary arrays
        for(int i = 0; i < left; i++){
            leftArray[i] = array[low + i];
        }
        for(int i = 0; i < right; i++){
            rightArray[i] = array[mid + 1 + i];
        }

        int i = 0, j = 0, k = low; //index

        while(i < left && j < right){ //while to combine both parts to the original array
            if(leftArray[i] <= rightArray[j]){
                array[k] = leftArray[i];
                i++;
            }
            else{
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < left){ //for the rest of the elements
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < right){ //for the rest of the elements
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
