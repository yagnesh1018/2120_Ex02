public class InsertionSort
{

	public void sort(int[] dig) {
		// TODO Auto-generated method stub
		 System.out.println("Before Insertion Sort");    
	        for(int i:dig){    
	            System.out.print("{"+i+"}"+" ");    
	        }    
	        System.out.println();    
	            
	        for (int j = 1; j < dig.length; j++) 
			{  
	            int key = dig[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( dig [i] > key ) ) 
				{  
	                dig [i+1] = dig [i];  
	                i--;  
	            }  
	            dig[i+1] = key;  
	        }   
	           
	        System.out.println("After Insertion Sort");    
	        for(int i:dig)
			{    
	            System.out.print("{"+i+"}"+" ");    
	        }    
	}   
}