#include <stdio.h>
main() 
{
    int n, o;
    int fact = 1;

    printf("Enter number: ");
    scanf("%d", &n);

    o = n;

    if (n < 0) 
	{
        printf("Invalid");
    } 
	else 
	{
        while (n > 0) 
		{
            fact *= n;
            --n;
        }

        printf("Factorial of %d = %d\n", o, fact);
    }
}

