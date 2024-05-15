package narendra.java.dsa.arrays.day1;

/*
Find max element in an array
Input = [ 5, -4, 8, 9, 10]
Output = [9]
 */
public class FindMaxElement {

    public static void main(String[] args) {
        int array[] = {5, -4, 8, 9, 10};
       // int maxElement = array[0];
        int maxElement = Integer.MIN_VALUE;
        for(int i = 1; i < array.length; i++){
            if(array[i] > maxElement)
                maxElement = array[i];
        }
        System.out.println(maxElement);
    }
}
