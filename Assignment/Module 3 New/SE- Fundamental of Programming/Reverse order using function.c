#include <stdio.h>

main() 
{
    int numbers[5],i;

    printf("Enter 5 numbers:\n");
    for (i = 0; i < 5; ++i) 
	{
        printf("Number %d: ", i + 1);
        scanf("%d", &numbers[i]);
    }

    printf("\nNumbers in reverse order:\n");
    for (i = 4; i >= 0; --i) 
	{
        printf("%d\n", numbers[i]);
    }
}

