package Classroom;

import java.util.Arrays;

public class Shift {

    private static void rightRotate(int[] inputArray, int n) {
    	//n= how many times array should shift
    
        System.out.println("Array Before Rotation: ");
         
        System.out.println(Arrays.toString(inputArray));
         
        int temp;
         
        for (int i = 1; i <= n; i++) {
        	//loop with nested for loop, each loop represents one shift
        
            temp = inputArray[inputArray.length-1]; 
            //stores last number in temp variable
             
            for (int j = inputArray.length-1; j > 0; j--) {
            
                inputArray[j] = inputArray[j-1];
                //shifts array by 1 to the right
            }
             
            inputArray[0] = temp;
            //replaces first number in array with temp
        }
         
        System.out.println("Array After Right Rotation By "+n+" Positions: ");
         
        System.out.println(Arrays.toString(inputArray));
    }
     
    public static void main(String[] args) {
    
        rightRotate(new int[] {1,2,3,4,5,6,7,8}, 2);
        //enter array here with how many times it should shift
    }
}