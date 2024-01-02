#include<stdio.h>
main()
{
	float r,a,c;
	
	float pi=3.14;
	
	printf("Enter the Radius of Circle...");
	scanf("%f",&r);
	
	a=pi*r*r;
	c=2*pi*r;
	
	printf("Area of the Circle %2f...\n",a);
	printf("Circumference of the Circle %2f...",c);
}
