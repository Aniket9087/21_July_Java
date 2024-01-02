#include <stdio.h>
main() 
{
    int n,i;
    int f = 1;

    printf("Enter a number: ");
    scanf("%d", &n);

    for (i = 1; i <= n; i++) 
	{
        f *= i;
    }

    printf("Factorial of %d = %d\n", n, f);
}

