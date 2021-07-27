/*This program does bubble sort using bubble sort algorithm 
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly 
 * swapping the adjacent elements if they are in wrong order.
 * It's Time complexity is O(n^2)
 */
import java.util.Scanner;
public class BubbleSort
{
    //Fuction : Taking the array which need to be sorted as input.
    static void bubbleSort(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j+1]<a[j]){
                	
                	//Function Call : Calling Swap Function with array and two indexes.
                    swap(a,j+1,j);
                }
            }
        }
    }
    
    //Function : Takes array and indexes of two elements which needs to be swapped.
    static void swap(int a[],int i, int j){
        int temp = a[j];
        a[j]=a[i];
        a[i]=temp;
    }
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the Size of array : ");
	    int arrSize = in.nextInt(); //User Input for Array size
	    int array[]= new int[arrSize]; 
	    
	    //For Loop : For taking an input in arry.
	    for(int i =0; i<array.length;i++){ 
	        System.out.println("Plese enter "+(i+1)+" element");
	        array[i] = in.nextInt();
	    }
	    
	    //Function call : Calling bubbleSort Function with passing array which needs to be sorted.
	    bubbleSort(array);
	    
	    //For loop for showing the sorted array.
	    for(int i =0; i<array.length;i++){
	        System.out.print(array[i]+" ");
	    }
	        
	    
	}
}

