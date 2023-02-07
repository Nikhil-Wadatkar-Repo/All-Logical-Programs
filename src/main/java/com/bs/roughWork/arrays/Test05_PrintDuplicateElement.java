package com.bs.roughWork.arrays;

public class Test05_PrintDuplicateElement {
	public static void main(String args[]) {
		String string="malayalama";
		char[] arr=string.toCharArray();
		
		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			int count=1;
		//search for duplicate and make it as '0' and increase the count.
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]&& arr[i]!=' ') {
					arr[j] = '0';
				count++;
				}
			}
			
			//if count is > 1 then print it
			if(count>1 && arr[i]!='0')
				System.out.println(arr[i]);
		}
		
		//see the affected array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}