#include <stdio.h>
main() 
{
    int n[5];
	int i;
    printf("Enter 5 numbers:\n");

    for (i = 0; i < 5; i++) 
	{
        printf("Number %d: ", i + 1);
        scanf("%d", &n[i]);
    }

    printf("Entered numbers:\n");

    for (i = 0; i < 5; i++) 
	{
        printf("%d\n", n[i]);
    }
}

