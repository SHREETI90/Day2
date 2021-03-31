package day2;

import java.util.Scanner;

public class DemoArray2 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int arr[] = new int [5];
		int arrmaxmin[] = new int [5];
		
		DemoArray2  app = new DemoArray2 ();
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("Insert array element "+i+":");
			int x= sc.nextInt();
			arr = app.insertIntoArray(arr,x,i);
		}
		app.printArray(arr);
		System.out.println("Enter element to be searched:");
		int a = sc.nextInt();
		
		int index = app.searchElement(arr, a);
		if (index == -1)
			System.out.println("Searched item not found ");
		else if (index == -2)
			System.out.println("Empty array ");
		else 
			System.out.println("The searched item  was found at index :"+index);
		System.out.println("The Minimum and Maximum numbers in the array are:");
		arrmaxmin = app.getMinMax(arr);
		app.printArray(arrmaxmin);
		System.out.println("Enter the value to find the multiples :");
		int x = sc.nextInt();
		int arrMul[] = app.getMultiplesOf(arr, x);
		app.printArray(arrMul);
		
		
	}
		public void printUsingEnhanceForLoop(int arr[])
		{
			// from java 1.5 onwards
			for (int myElement : arr) 
			{
				myElement = myElement/2; //business operation , 100 lines of code 
				System.out.println(myElement);
			}
		}
		
		
		public int[] insertIntoArray(int arr[],int information,int position)
		{
			
			arr[position] = information;
			return arr;
			
		}
		
		public void printArray(int arr[])
		{
			for (int i = 0; i < arr.length; i++) 
			{
				System.out.println(" "+arr[i]+" ");
			}
		}
		public int getInformation(int arr[],int position)
		{
			if(position>arr.length)
			{
				return -1;
			}
			return arr[position];
		}
		
		// This method accept an array and the element to be searched and return the index value if element found
		// otherwise return -1;
		// as well as return -2 if array is empty
		public int searchElement(int ars[],int x)
		{
			if(ars.length == 0) {
				return -2;
			}
			for(int i=0;i<ars.length;i++) {
				if(ars[i] == x)
				{
					return i;
				}
			}
			return -1;
		}
		
		/*
		 * this method returns an array of size 2, containing min and max number of the given array, 
		  and below method cannot invoke any other method
		 * Note:- display the returned array using printArray() method 
		 *  */
		public int[] getMinMax(int arr[])
		{
			int arrmaxmin[] = new int[2];
			int max=arr[0],
				min=arr[0];
			
			for(int i=0;i<arr.length;i++) 
			{
				if(arr[i]>max)
					max=arr[i];
			}
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]<min)
					min=arr[j];
			}
			arrmaxmin[0]= min;
			arrmaxmin[1]= max;
			return arrmaxmin;
			
			
		}
		
		/*
		 * this method returns an array which contains the multiples of x, 
		  and below method cannot invoke any other method
		 * Note:- display the returned array using printArray() method 
		 *  */
		public int[] getMultiplesOf(int arr[],int x)
		{
			int j = 0;
			int arrMul[] = new int[arr.length];
			for (int i=0; i<arr.length; i++)
			{
				if (arr[i]%x == 0)
					{
						arrMul[j] = arr[i];
						j++;
					}
			}
			return arrMul;
		}
		
		
		
}
//end class

