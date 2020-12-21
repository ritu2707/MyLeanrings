package NumberPractice;

public class SortingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {200,30,45,3,6};
		sortArray(arr);

	}

	private static void sortArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			System.out.println(arr[i]);
		}
	}

}
