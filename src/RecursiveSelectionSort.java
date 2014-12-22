import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankur
 */
public class RecursiveSelectionSort {
    public static void main(String[] args){
        System.out.println("Enter the number of integers to be sorted");
         Scanner input = new Scanner(System.in);
         int numOfInput = input.nextInt();
        System.out.println("Enter the integers to be sorted");
        int[] arr = new int[numOfInput];
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        SelectionSort(arr);
         System.out.println("The sorted array is ");
         for(int i = 0; i < arr.length; i++){
             System.out.print(arr[i] + "\t");
         }
    }
    public static void SelectionSort(int[] arr){
        if(arr.length == 1)return;
        int max = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[max] < arr[i])max = i;
        }
        int temp = arr[0];
        arr[0] = arr[max];
        arr[max] = temp;
    }
}
