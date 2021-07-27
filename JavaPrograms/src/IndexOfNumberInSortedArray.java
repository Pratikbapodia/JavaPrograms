//Finding the index of the number which is in the sorted array. This is also known as binary search
// and its time complexity is O(log(n))
//It is also known as divide and conquer...


import java.util.*;
public class IndexOfNumberInSortedArray
{
//Function which takes 2 inputs. An Array and a number in a array whose Index needs to be found.
  static int indexOfNumber (int arraySum[], int num)
  {
    int min = 0;
    int max = arraySum.length - 1;
    while (min <= max)
      {
	int midIndex = (min + max) / 2;
	if (arraySum[midIndex] < num)
	  {
	    min = midIndex + 1;
	  }
	else if (arraySum[midIndex] > num)
	  {
	    max = midIndex - 1;
	  }
	else
	  {
	    return midIndex;
	  }
      }

    return 0;
  }
  public static void main (String[]args)
  {
    int arraySize; //Size of an array.
    int num; //Number whose index needs to be found.
    Scanner in = new Scanner(System.in);
    System.out.println ("Enter the size of array : ");
    arraySize = in.nextInt ();
    int numArray[];
    numArray = new int[arraySize];
    for (int i = 0; i < arraySize; i++) //Loop for taking input into the array.
      {
	System.out.println ("Enter number : " + (i + 1));
	numArray[i] = in.nextInt (); 
      }
    System.out.println ("Enter the number which index you need to find : ");
    num = in.nextInt ();

    int indexOf = indexOfNumber (numArray, num); //Calling the function with passing an array and a number.
    System.out.println ("The index is : " + indexOf); //Showing the result. i.e., Index of the element in an array.
  }
}

