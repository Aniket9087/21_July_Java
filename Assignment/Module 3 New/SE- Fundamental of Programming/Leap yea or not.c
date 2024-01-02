#include<stdio.h>
main()
{
	int y;
	
	printf("Enter the Year...");
	scanf("%d",&y);
	
	if((y%4==0 && y%100!=0) || (y%400==0))
	{
		printf("%d is a Leap Year...",y);
	}
	else
	{
		printf("%d is Not Leap Year...",y);
	}
}
