package array_Assignment_1;

import java.util.Arrays;
Time Complexity: O(n)
Space Complexity: O(1)
public class In_Place_Replace {

	
	public static void moveZero(int arr[])
	{
		int n=arr.length;
		int left=0;
		int right=0;
		
		while(right<n)
		{
			if(arr[right]!=0)
			{
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
			}
			right++;
		}
		 
		
	}
	public static void main(String[] args) {
		
		int arr[]= {0,1,0,3,12};
		moveZero(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
