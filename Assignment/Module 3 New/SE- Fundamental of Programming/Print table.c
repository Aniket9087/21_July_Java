#include <stdio.h>
main() 
{
    int n,i;

    printf("Enter a number: ");
    scanf("%d", &n);

    printf("Multiplication table for %d:\n", n);

    for (i = 1; i <= 10; i++) 
	{
        printf("%d x %d = %d\n", n, i, n * i);
    }
}

