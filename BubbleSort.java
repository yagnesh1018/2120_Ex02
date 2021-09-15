public class BubbleSort {

	public void sort(int[] data) {
		// TODO Auto-generated method stub
		System.out.println("Before Sorting: ");
		for(int i=0; i<data.length; i++) 
		{
			System.out.print(" { "+ data[i]+" } ");
		}
		for(int i=0; i<data.length; i++)
		{
			for(int j=0; j<data.length; j++) 
			{
				if(data[i] < data[j])
				{
					int tmp = data[i];
					data[i] = data[j];
					data[j] = tmp;
				
				}
			}
			
			
		}
		System.out.println("\nAfter Sorting: ");
		for(int i=0; i<data.length; i++)
		{
			System.out.print(" { "+ data[i]+" } ");
		}	
	}
}