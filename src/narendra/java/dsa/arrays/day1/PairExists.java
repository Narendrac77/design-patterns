package narendra.java.dsa.arrays.day1;

import java.util.Scanner;

/*
Given an array 'arr' of size  'N' check if there exists a pair(i,j) such that arr[i] + arr[j] = k
and i != j;
N = 5
Input = [ 9, 1, 3, 5, 9] k = 12
ans = true
 */
public class PairExists {

    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        } */

        //System.out.println(arr);
        int arr[] = { 9, 1, 3, 5, 9};
        int k = 12;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+ 1; j < arr.length; j++){

                if(i != j && (arr[i] + arr[j] == k)){
                    System.out.println(Boolean.TRUE + "index value of i = " + i + " index value of j =  " + j);
                }
            }
        }
    }
}
