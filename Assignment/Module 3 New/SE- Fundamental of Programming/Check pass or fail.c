#include <stdio.h>
main() 
{
    float marks;

    printf("Enter the marks: ");
    scanf("%f", &marks);

    if (marks >= 50.0) 
	{
        printf("You have passed.\n");
    } 
	else 
	{
        printf("You have failed.\n");
    }
}

