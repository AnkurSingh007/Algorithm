/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankur
 */
public class testing {
    public static void main(String[] args){
        String test = "1234";
        char[] temp = test.toCharArray();
        for(int i = 0; i < temp.length; i++){
            System.out.print(temp[i] + "\t");
        }
        System.out.println("");
    }
}
