package SortingAlgorithms;

public class CocktailShakerSort {

    public void cocktailShakerSort(int []array){

        int temp;
        int start = 0;
        int end = array.length-1;
        boolean swap = true;

        //Main Loop, if goes out of it, means the array is sorted
        while(swap){
            swap = false;

            //Left pass
            for(int i = start; i < end; i++){

                //Will take the greatest element to array[end]
                if(array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swap = true;
                }
            }
            //If statement so we don't run the
            //Right pass with no need for it
            if(!swap) break;

            //Decreases the range at the end
            end--;

            swap = false;
            //Right pass
            for(int i = end; i > start; i--){
                if(array[i] < array[i-1]){
                    temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    swap = true;
                }
            }

            //Decreases the range at the start
            start++;
        }
    }
}
