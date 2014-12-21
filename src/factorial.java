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
public class factorial {
    private static int numOfCalls = 0;
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int result = getFact(number);
        System.out.println("The factorial is " + result);
        System.out.println("Number of recursive calls made are " + numOfCalls);
    }
    public static int getFact(int num){
        numOfCalls++;
        int result = 1;
        if(num == 0)return result;
        else{
            result = num;
            return num * getFact(num - 1);
        }
    }
}
