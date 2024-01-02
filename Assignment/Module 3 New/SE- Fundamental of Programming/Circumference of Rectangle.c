#include<stdio.h>
main()
{
	float l,w,s;
	
	printf("Enter the Length of Rectangle...");
	scanf("%f",&l);
	
	printf("Enter the Width of Rectangle...");
	scanf("%f",&w);
	
	s=2*(l+w);
	
	printf("Circumference of Rectangle is...%2f",s);
}
