package Practice03;

public class binSearch {
    public static int recursionBinSearch(int[] arr, int key, int min, int max){
        if(key < arr[min] || key > arr[max] || min > max){
            return -1;
        }

        int middle = min + (max - min) / 2;
        if(key < arr[middle]){
            return recursionBinSearch(arr, key, min, max - 1);
        } else if (key > arr[middle]) {
            return recursionBinSearch(arr, key, min + 1, max);
        } else {
            return middle;
        }
    }

    public static int iterativeBinSearch(int[] arr, int key){
        int max = arr.length - 1;
        int min = 0;
        int middle = 0;

        while(min < max){
            middle = min + (max - min) / 2;

            if(key == arr[middle]){
                return middle;
            } else if (key < arr[middle]) {
                max = middle - 1;
            } else {
                min = middle +1;
            }
        }
        return -1;
    }
}
