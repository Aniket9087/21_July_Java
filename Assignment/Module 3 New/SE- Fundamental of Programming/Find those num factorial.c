#include <stdio.h>
main() 
{
    int n[5];
    int fact[5];
	int i,j;
    for (i = 0; i < 5; ++i) 
	{
        printf("Enter number %d: ", i + 1);
        scanf("%d", &n[i]);

        fact[i] = 1;
        for (j = 1; j <= n[i]; ++j) 
		{
            fact[i] *= j;
        }
    }

    printf("\nFactorials of the numbers:\n");
    for (i = 0; i < 5; ++i) 
	{
        printf("Number %d: %d\n", n[i], fact[i]);
    }
}

