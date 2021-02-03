/*
Write a function remove_duplicates(as mentioned below), such that, it remove duplicates from array (without using Collections).

remove_duplicates(input=>array on integers)

Following are example inputs and corresponding expected output:
Input1 : arr[] = {2, 2, 2, 2, 2}
Output1 : arr[] = {2}
Input2 : arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}
Output2 : arr[] = {1, 2, 3, 4, 5}

*/

class RemoveDuplicates
{
	public int removeDuplicates(int[] arr)
	{
		if(arr.length==0 || arr.length==1)
		{
			return arr.length;
		}
		int j = 0;
		for (int i=0; i < arr.length-1; i++)
		{
			if (arr[i] != arr[i+1])
			{
				arr[j++] = arr[i];
			}
		}

		arr[j++] = arr[arr.length-1];
		return j;
			
	}
}

class Mainclass
{
	public static void main(String args[])
	{
		
		RemoveDuplicates ref = new RemoveDuplicates();
		int[] arr1 = {2,2,2,2,2};
		int len1 = ref.removeDuplicates(arr1);
		for(int i=0; i<len1; i++)
		{
			System.out.println(arr1[i]+" ");
		}


		int[] arr2 = {1, 2, 2, 3, 4, 4, 4, 5, 5};
		int len2 = ref.removeDuplicates(arr2);
		for(int i=0; i<len2; i++)
		{
			System.out.println(arr2[i]+" ");
		}
	}
}





