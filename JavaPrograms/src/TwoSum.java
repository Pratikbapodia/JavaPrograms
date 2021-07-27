/*This Program finds an index of two digit in an array whose sum are equal to our given number.
 *It uses Nested loop to get the sum of two numbers and check if the sum is equal to our target.
 *if yes, then it saves the index in a pre declared array and returns that array.
 *If no, then in program it validates and tells the user for valid sum input.
 */
import java.util.Scanner;
class TwoSum {
	
	//Function Definition : Takes two parameters 1. Array 2. Sum
    public static int[] twoSum(int[] nums, int target) {
        int solution[]= new int[2]; //Array declaration of size 2.
        
        //Nested For Loop : To find the indexes of digits whose sum are equal to our given input.
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    solution[0]=i;
                    solution[1]=j;
                }
            }
        }
        return solution;
    }
    
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter Size of the array. ");
    	int arraySize = in.nextInt(); //User Input Size of the array.
    	int array[] = new int[arraySize]; //Passing size of array to array.
    	
    	//For Loop : For taking input of in the array.
    	for(int i = 0; i<array.length;i++) {
    		System.out.println("Enter " + (i+1) +" Element ");
    		array[i]= in.nextInt();
    	}
    	System.out.println("Enter the sum which you want to find ");
    	int sum = in.nextInt(); // User input for the number which we want to find the sum.
    	
    	//Function Call : Calling the function by passing Array and the number. Storing them in newArray[];
    	int newArray[] = twoSum(array,sum); 
    	
    	//Checking if we found the sum or not and showing the result.
    	if(newArray[0]+newArray[1]!=0) {
    	System.out.println(newArray[0]);
    	System.out.println(newArray[1]);
    	}else {
    		System.out.println("Enter Valid Sum");
    	}
    }
}

