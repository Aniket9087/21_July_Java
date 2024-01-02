#include<stdio.h>
main()
{
	float l,w,h,a;
	
	printf("Enter the Length of Rectengular prism....");
	scanf("%f",&l);
	
	printf("Enter the Width of Rectengular prism....");
	scanf("%f",&w);
	
	printf("Enter the Height of Rectengular prism....");
	scanf("%f",&h);
	
	a=2*(w*l+h*l+h*w);
	
	printf("Area of Rectengular Prism is....%2f",a);
}
