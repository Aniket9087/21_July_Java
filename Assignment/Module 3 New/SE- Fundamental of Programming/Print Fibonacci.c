#include <stdio.h>
main() 
{
    int i,l, f = 0, s = 1, n;

    printf("Enter the Number for Fibonacci series: ");
    scanf("%d", &l);

    printf("Fibonacci series up to %d:\n", l);

    while (f <= l) 
	{
        printf("%d, ", f);

        n = f + s;
        f = s;
        s = n;
    }

    printf("\n");
}

