class Solution
{
	int  select(int arr[], int i)
	{

	}
	
	void selectionSort(int arr[], int n)
	{
	 for (int i=0; i<n-1;i++)
	 {
	    for(int j=i+1;j<n;j++){
	        if(arr[i]>arr[j]){
	            int s=j;
	        }
	       
	    }
	    int p=arr[s];
	    arr[s]= arr[i];
	    arr[i]= p;
	 }
	}
}
