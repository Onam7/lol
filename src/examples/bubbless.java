package examples;

public class bubbless {
	void bubbleSort(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-1;j++)
				if(arr[j]>arr[j+1])
				{
					int temp=arr[i];
					
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
	}
	void printArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;++i)
		{
			System.out.println(arr[i]+"");
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		{
			bubbless ob=new bubbless();
			int arr[]= {64,25,12,22,11};
			ob.bubbleSort(arr);
			System.out.println("Sorted array");
			ob.printArray(arr);
		}
		
		
		
		
		
		
	}

		

	}


