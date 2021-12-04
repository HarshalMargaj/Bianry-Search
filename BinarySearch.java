package BinarySearch;

public class BinarySearch {
	
	int binarysearch( int arr[], int l, int r, int x)
	{
    if (r >= 1){
		int mid = 1 + (r -1) / 2;
		
		//If the element is present at the middle itself
		if (arr[mid] == x)
			return mid;
		
		//If element is smaller than mid, then
		//it can only be present in left subarray
		if(arr[mid] > x)
			return binarysearch(arr, l, mid - 1, x);
		
		//Else the element can only be present
		//in right subarray
		return binarysearch(arr, mid + 1, r, x);
	}
	
	//We reach here when element is not present
	//in array
	return -1;
    }

    //Driver method to test above
    public static void main(String args[])
    {
	   BinarySearch ob = new BinarySearch();   //creating object of the class
	   int arr[] = {2, 5, 8, 10};
	   int n = arr.length;
	   int x = 8;
	   int result = ob.binarysearch(arr, 0, n - 1, x);
	   if (result == -1)
		   System.out.println("Element not present");
	   else
		   System.out.println("Element found at index" + result);
    }
	
}