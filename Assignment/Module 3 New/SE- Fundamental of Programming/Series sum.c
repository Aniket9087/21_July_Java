#include <stdio.h>
main() 
{
    int n, sum = 0,i,j,s;

    printf("Enter the value of n: ");
    scanf("%d", &n);

    for (i = 1; i <= n; ++i) 
	{
        s = 0;
        for (j = 1; j <= i; ++j) 
		{
            s += j;
        }
        sum += s;
    }

    printf("Sum of the series (1) + (1+2) + (1+2+3) + ... + (1+2+3+...+%d) = %d\n", n, sum);
}

