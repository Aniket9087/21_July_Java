#include <stdio.h>
main() 
{
    int n, sum = 0,i;

    printf("Enter the value of n: ");
    scanf("%d", &n);

    for (i = 1; i <= n; ++i) 
	{
        sum += i * i;
    }

    printf("Sum of the series (1*2) + (2*2) + (3*2) + ... + (%d*2) = %d\n", n, sum);
}

