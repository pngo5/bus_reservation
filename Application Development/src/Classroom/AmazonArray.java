package Classroom;
import java.util.*;
public class AmazonArray {
public static void main(String[] args) {
	int[] array = { 102, 100, 23, 120, 111, 100};
    int maxValue = array[0];
	int secondLargest=0;
	for(int a=1;a< array.length;a++) {
		/** If the element a is bigger than maxVlaue then 
		  secondlargest become maxvalue. 
		  and maxvalue become array[a]
		  
		  
		  else if array a is bigger than second largest then
		  second largest become array[a]
		  *
		  **/
	
			if (array[a] > maxValue) {
			    secondLargest = maxValue;
			    maxValue = array[a];
			} else if (array[a] > secondLargest) {
			    secondLargest = array[a];
			}
		}
	System.out.println("maxValue: " + maxValue + " " 
		+ "SecondLargest: "+ secondLargest);
	}
	
}


