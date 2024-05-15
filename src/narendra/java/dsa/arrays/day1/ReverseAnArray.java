package narendra.java.dsa.arrays.day1;

/*
Given an array 'arr' of size 'n' reverse the array
intput = [ 1, 2, 3, 4, 5]
output = [ 5, 4, 3, 2, 1]
 */
public class ReverseAnArray {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5};
        int lastIndex = arr.length - 1;
        int startIndex = 0;
        while(startIndex < lastIndex){
            int temp = arr[lastIndex];
            arr[lastIndex] = arr[startIndex];
            arr[startIndex] = temp;
            startIndex++;
            lastIndex--;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
