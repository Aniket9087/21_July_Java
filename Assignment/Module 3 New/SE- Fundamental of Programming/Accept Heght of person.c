#include <stdio.h>
main() 
{
    float h;

    printf("Enter the height: ");
    scanf("%f", &h);

    if (h < 150) 
	{
        printf("Short \n");
    } 
	else if (h >= 150 && h < 170) 
	{
        printf("Average \n");
    } 
	else 
	{
        printf("Tall \n");
    }
}

