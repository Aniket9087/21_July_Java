#include<stdio.h>
main()
{
	int m,n;
	
	printf("Enter the value of M....");
	scanf("%d",&m);
	
	
	if(m>0)
	{
		n=1;
	}
	else if(m==0)
	{
		n=0;
	}
	else
	{
		n=-1;
	}
	
	printf("Value of n is %d\n",n);
}
