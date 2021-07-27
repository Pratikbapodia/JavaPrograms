//Largest Sum of Consecutive number in an array.
//Here I am taking one array as an input and a consecutive number.
//The result gives the largest sum.
//The time complexity of this algorithm is O(n)


import java.util.*;

public class LargestConsecutiveSumInArray
{

// Function with 2 parameters 1. Array 2. Number ( The number for the consecutive sum )
  static int consecutiveSum (int arraySum[], int num)
  {


    int aLength = arraySum.length; //Storing Length of Array using array_name.length property.

    if (aLength < num) //Checking if number is bigger than length of Array. If yes return 0.
      {

	return 0;

      }
    else 
      {

	int max = 0;  //Max variable for storing the max sum of the consecutive number.

	for (int i = 0; i < ((aLength - num) + 1); i++)
	  {

	    int temp = 0;

	    for (int j = 0; j < num; j++)
	      {

		temp = temp + arraySum[i + j];

	      }
	    if (temp > max)
	      {

		max = temp;

	      }

	  }

	return max;

      }




  }

  public static void main (String[]args)
  {

    int arraySize;  //Variable to store size of array.

    int num; // Variable to store number for consecutive sum

    Scanner in = new Scanner (System.in);

    System.out.println ("Enter the size of array : ");

    arraySize = in.nextInt (); //User Input for arraySize.

    System.
      out.println ("Enter the number of Consecutive sum you want to do : ");

    num = in.nextInt (); //User Input for num variable.

    int numArray[];

    numArray = new int[arraySize]; //Passing size of array taken for user in array.

    //For Loop for taking input in the array.
    for (int i = 0; i < arraySize; i++)
      {

	System.out.println ("Enter number : " + (i + 1));

	numArray[i] = in.nextInt ();

      }

    int sumOf = consecutiveSum (numArray, num); //Function calling

    System.out.println ("The Sum is : " + sumOf); // Showing Result.

  }
}

