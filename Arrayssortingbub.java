/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package kgosi.arrayssortingbub;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sebak
 */
public class Arrayssortingbub {

    public static void main(String[] args) {
        int numOfValues;//Variable for amount of numbers the user wants to in put and sort it in assending order 
        Scanner sbk=new Scanner(System.in);
        System.out.println("Please enter amount of numbers you want to input:");
        numOfValues=sbk.nextInt();
        int nums[]=new int[numOfValues];
           int temp;
        for(int k=0;k < nums.length;k++){
            try{ 
                //Code to try for the user which is to input their number 
                Scanner kgosi=new Scanner(System.in);
                System.out.println("Please enter number "+k+ " :");
                nums[k]=kgosi.nextInt();
                 }
            catch(InputMismatchException ime){
               //if the user inputs the wrong data type it replace that element with a zero 
             System.out.println("Error please enter a NUMBER"); 
             nums[k]=0;
            }
        
        } 
        System.out.println("\nYour numbers before being sorted: ");
        for(int ob=0;ob < nums.length;ob++){
        System.out.print(" "+nums[ob]);
        
        }
        System.out.println(" ");
        
         for(int v = 0;v<nums.length ;v++){
                for(int s = 0;s<nums.length-1 ;s++){
                    //Process where the elements are being sorted 
                    if(nums[s]>nums[s+1]){
                        temp=nums[s];
                        nums[s]=nums[s+1]; 
                        nums[s+1]=temp;
                    }}}
        
        System.out.println("Your numbers sorted:");
        for(int b =0;b<nums.length;b++)System.out.print(" "+nums[b]);
        
        
        
    }
}
