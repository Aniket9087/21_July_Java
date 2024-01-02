#include<stdio.h>
main()
{
	float s1,s2,s3,s;
	
	printf("Enter the Side 1...");
	scanf ("%f",&s1);
	
	printf("Enter the Side 2...");
	scanf("%f",&s2);
	
	printf("Enter the Side 3...");
	scanf ("%f",&s3);
	
	s=s1+s2+s3;
	
	printf("Circumference of Triangle is...%2f",s);
}
