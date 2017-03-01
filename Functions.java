public class Functions{
	public static final boolean DEBUG = false;

	public static void funcOne(int a[])
	{
		if(DEBUG){System.out.println("funcOne Called for array length: " + a.length);}
		int n = a.length;
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
   	}

	public static void funcTwo(int a[])
	{
		if(DEBUG){System.out.println("funcTwo Called for array length: " + a.length);}
		int n = a.length;
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
	}
	public static void funcThree(int a[])
	{
		if(DEBUG){System.out.println("funcThree Called for array length: " + a.length);}
		int n = a.length;
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
	}

}