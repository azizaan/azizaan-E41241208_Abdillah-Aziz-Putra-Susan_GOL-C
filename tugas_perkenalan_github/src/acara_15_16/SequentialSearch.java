/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara_15_16;

/**
 *
 * @author ACER
 */
public class SequentialSearch {
    public static void main(String[] args) {
        int[] exampleVariableone = {2,9,6,7,4,5,3,0,1};
        int target = 4;
        sequentialSearch(exampleVariableone, target);
    }
    
    public static void sequentialSearch(int parameterone[], int parametertwo){
        int index = 1;
        for (int i = 0; i < parameterone.length; i++){
            if (parameterone[i] == parametertwo){
                index = i;
                break;
            }
            if (index == 1) {
                 System.out.println("your target integer does not exist in array");
            }else{
                 System.out.println("your target integer is in the index "+index+" of the array");
            }
        }
    }
}
