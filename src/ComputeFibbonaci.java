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
public class ComputeFibbonaci {
    public static void main(String[] args){
        
        System.out.println("Enter the index of Fibbonachi number to be found");
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        int answer = getFibbonachi(index);
        System.out.println("The fibbonachi number at index " + index + " is " + answer);
    }
    public static int getFibbonachi(int index){
        if(index == 0)return 0;
        if(index == 1)return 1;
        else
            return getFibbonachi(index - 1) + getFibbonachi(index - 2);
    }
}
