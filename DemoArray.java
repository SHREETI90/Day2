package day2;

import java.util.Scanner;
	
public class DemoArray 
{
	public static void main(String[] args){
	  
	  int arr[] = new int[20];
	  int fElement,nElement,i;
	 
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Enter array size: ");
	  int arr_size = sc.nextInt();
	  
	  
	  for(i=0;i<arr_size;++i)
	  {
	   System.out.print("Enter array elements of index " +i +": ");
	   arr[i] = sc.nextInt();
	  }

	  System.out.print("Elements of the Array :");
	  for(i=0;i<arr_size;++i)
	  {
	   System.out.print(arr[i]+" ");
	  }
	  System.out.println(" ");
	  System.out.print("New array :");
	  for(fElement=0;fElement<arr_size;++fElement)
	  {
	   for(nElement=fElement+1;nElement<arr_size;){
	    
	    if(arr[fElement] == arr[nElement]){
	     for(int temp = nElement; temp<arr_size; ++temp){
	      arr[temp] = arr[temp+1];
	     }
	     arr_size = arr_size-1;  
	    }  
	    else
	     nElement++;  
	   }
	  }
	  
	 
	  for(i=0;i<arr_size;++i)
	   System.out.print(arr[i]+" ");
	 }
}



