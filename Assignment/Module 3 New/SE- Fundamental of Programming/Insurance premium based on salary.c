#include <stdio.h>

main() 
{
    float s, p;

    printf("Enter the salary: ");
    scanf("%f", &s);

    if (s < 50000) 
	{
        p = 0.02 * s;
    } 
	else if (s >= 50000 && s <= 100000) 
	{
        p = 0.04 * s;
    } 
	else 
	{
        p = 0.06 * s;
    }

    printf("Insurance Premium: $%.2f\n", p);

}

