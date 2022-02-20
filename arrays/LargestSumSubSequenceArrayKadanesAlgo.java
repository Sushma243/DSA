package arrays;

//Finding a subset from given array which will return max sum, print the max sum
//brute-force will give O(N^2) solution where as Kadane's algo gives O(N)
//without using extra space

public class LargestSumSubSequenceArrayKadanesAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[]= {-2,1,-3,4,-1,2,1,-5,4};
		int a[]= {-2,-1};
		
		//holds currentSum value by adding previous element to it
		int currentSum=0;
		int maxSum=Integer.MIN_VALUE;
		
		//exceptional case-1
		//if only 1 element is present in the array then that itself is the max sum
		if(a.length == 1)
		{maxSum=a[0];}
		
		//if array is empty then maxSum is 0
		//exceptional case-1
		if(a.length == 0)
		{maxSum=0;}
		
		else {
		for(int i=0; i < a.length; i++) {
		//Normal Scenario
		//will take current values as current sum store in currentSum variable by adding previous
			currentSum= currentSum+a[i];
			
			//if currentSum by adding current element is > maxSum then update maxSum with currentSum 
			if(currentSum > maxSum)
			{maxSum=currentSum;}
			
			//if after adding to currentSum if we get negative value then we need
			//to discard the change till there by making currentSum as 0(reset)
			if(currentSum < 0)
			{
				currentSum=0;
			}
			
		}
		}
		
		System.out.println(maxSum);

	}

}
