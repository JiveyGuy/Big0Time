public class Functions{

	public int funcOne(int a[],int n)
	{
  		int i,j,k;
  		int sum,maxSum = 0;
  		for(i=0; i<n; i++)
  		{
    		for(j=i; j<n; j++)
    		{
		    	sum = 0;
      			for(k=i ; k<j; k++)
      			{
        			sum = sum + a[k];
      			}
      			if(sum>maxSum)
        		maxSum = sum;
    		}
   		}
    return maxSum;
	}

	public int funcTwo(int a[],int n )
	{
    	int i,j,sum,maxSum;
    	maxSum = 0;
    	for(i = 0;i<n;i++)
    	{
        	sum = 0;
        	for(j=i;j<n;j++)
        	{
            	sum = sum + a[j];
            	if(sum>maxSum)
                maxSum = sum; 
        	}
    	}
    	return maxSum;
	}
	public int funcThree(int a[], int n)
	{
   		int maxSum = 0,sum = 0;
   		int i;
   		for(i = 0;i<n;i++)
   		{
     		sum = sum + a[i];
     		if(sum < 0)
        		sum = 0;
     		else if(sum > maxSum)
        		maxSum = sum;
   		}
   		return maxSum;
	}

}