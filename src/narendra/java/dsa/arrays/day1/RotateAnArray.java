package narendra.java.dsa.arrays.day1;

/*
given an array 'arr' of size n. Rotate the array from right to left 'k' time
N = 5
arr = [1, 2, 3, 4, 5]
k = 2
output = [4, 5, 1, 2, 3]
 */
public class RotateAnArray {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5};
        int k = 2;

        for(int i = 0; i < k ; i++){
            int lastElement = arr[arr.length - 1];

            for(int j = arr.length-1; j >= 1; j--){
                arr[j] = arr[j - 1];
            }
            arr[0] = lastElement;
        }
        System.out.println("array after rotate");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
