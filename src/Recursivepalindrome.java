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
public class Recursivepalindrome {
    public static void main(String[] args){
        System.out.println("Enter the string");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        checkPalindrome(str);
    }
    public static void checkPalindrome(String str){
        if(str.length() == 2 && str.charAt(0)== str.charAt(1))System.out.println("String is a palindrome");
        else if(str.length() == 1 || str.length() == 0)System.out.println("String is a palindrome");
        else if(str.charAt(0) == str.charAt(str.length() - 1)){
            String temp = str.substring(1, str.length() - 1);
            checkPalindrome(temp);
        }
        else System.out.println("String is not a palindrome");
    }
}
