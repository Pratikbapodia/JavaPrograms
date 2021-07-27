/*This program is used to find the second largest element in an array.
 * we are using one temporary variable where we are storing the lergest element.
 * and then we are checking all the elements for the second largest element. 
 * We are giving inputs directly.
 */
public class SecondLargestElement
{
    
    static int secondLargest(int array[]){ 
    int i;
    int largest = 0 , secondLargest=0;
    
    for(i=0;i<array.length;i++){
        largest = Math.max(largest,array[i]);
    }
    for (i=0;i<array.length;i++){
        if(array[i] != largest){
            secondLargest = Math.max(secondLargest,array[i]);
        }
    }
    return secondLargest;
    }
	public static void main(String[] args) {
	    int arr[] = {1,5,10,45,32,54,65,34,74};
	    int largest = secondLargest(arr);
		System.out.println(largest);
	}
}

