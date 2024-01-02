#include <stdio.h>
main() 
{
    int n[5],i;

    printf("Enter 5 numbers:\n");
    for (i = 0; i < 5; ++i) 
	{
        printf("Number %d: ", i + 1);
        scanf("%d", &n[i]);
    }

    printf("\nNumber\tType\n");
    for (i = 0; i < 5; ++i) 
	{
        printf("%d\t%s\n", n[i], (n[i] % 2 == 0) ? "Even" : "Odd");
    }
}

