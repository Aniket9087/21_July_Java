#include <stdio.h>
main() 
{
    int n,j,i;

    printf("Enter the number of terms in the series: ");
    scanf("%d", &n);

    j = 1;
    for (i = 1; i <= n; ++i) 
	{
        printf("%d ", j);
        j *= 3;
    }
}

