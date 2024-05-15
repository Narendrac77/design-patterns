package narendra.java.dsa.arrays.day1;

public class ReverseAnArray2 {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5};
        int k = 5;
        k = k % arr.length;
        reverseAnArray(arr, arr.length, 0, arr.length - 1);
        reverseAnArray(arr, arr.length, 0, k-1);
        reverseAnArray(arr, arr.length, k, arr.length - 1);

        System.out.println("after rotation of an array");

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] reverseAnArray(int arr[], int n, int l, int r){
        int start = l , end = r;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }
}
