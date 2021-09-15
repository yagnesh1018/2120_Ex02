public class SelectionSort 
{

	public void sort(int[] num)
	{
		// TODO Auto-generated method stub
		 System.out.println("Before Sorting: ");
			for(int i=0; i<num.length; i++) 
			{
				System.out.print(" "+"{"+num[i]+"}");
			}
	      

	      for (int i = 0 ;i< num.length-1; i++)
		  {
	         int min = i;

	         for (int j = i+1; j<num.length; j++)
			 {
	            if (num[j] < num[min])
				{
	            min = j;
	            }
	         }
	         int temp = num[min];
	         num[min] = num[i];
	         num[i] = temp;
	      }
	      
	      System.out.println("\nAfter Sorting: ");
	      for (int i = 0 ;i< num.length; i++){
	         System.out.print(" "+"{"+num[i]+"}");
	      }	
	}
	
}