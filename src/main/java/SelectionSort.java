public class SelectionSort {

    int[] sort(int arr[]){
        int length = arr.length;

        if(length == 0){
            return null;
        }


        for( int i = 0; i < length-1; i++){
            int minIndex = i;

            for( int j = i+1; j < length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }



}
