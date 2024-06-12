package Practice04;

public class QuickSort {
    public static void quickSort(int[] arr, int left, int right){
        if(left > right){
            return;
        }

        int base = arr[left];
        int i = left;
        int j = right;
        while(i != j){
            while (i <= base && i < j){
                i++;
            }
            while (j >= base && i < j){
                j--;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        arr[left] = arr[i];
        arr[i] = base;
        quickSort(arr, left, i - 1);
        quickSort(arr, j + 1, right);
    }
}
