package narendra.java.dsa.arrays.day1;

/*

Print all the elements in an array
input[1, 2, 3, 4, 5]
Output = 1, 2, 3, 4, 5

 */
public class PrintArrayElements {

    public static void main(String[] args) {
        int array[] = new int[5];
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
