/*Practiced 2D array taking dynamic input using 2 nested for loops.
 1 for input and 1 another nested loop to traverse through all the inputs.
*/
import java.util.Scanner;
public class SumOf2DArrayDiagonal
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int arr[][]= new int[3][3]; //Defining and Declaring 2D array with size [3][3]
	    int primaryDiagonal = 0;    //Variable to store sum of primary diagonal and initializing with 0
	    int secondaryDiagonal = 0;  //Variable to store sum of secondary diagonal and initializing with 0
	    
	    // Nested For loop to take input into an array.
	    for(int i =0;i<=2;i++){
	        for(int j=0;j<=2;j++){
	             System.out.println("Enter Row "+(i+1)+" coloumn "+( j+1)+" Element");
	            arr[i][j]= in.nextInt();
	        }
	    }
	    
	    //Nested For loop to find sum of the diagonals by using logic (i=j) and (i+j=2)
		for(int i=0;i<=2;i++){
		    for(int j = 2; j>=0; j--){
		        if(i==j){
		            primaryDiagonal = primaryDiagonal + arr[i][j];
		        }
		        if((i+j)==(2)){
		        	secondaryDiagonal = secondaryDiagonal + arr[i][j];
		    }
		}
	}
		//Display result.
			System.out.println("Sum of Primary Diagnol is "+primaryDiagonal+" sum of Secondary Diagnol is "+secondaryDiagonal);
}
}

