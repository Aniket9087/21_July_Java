#include <stdio.h>
main() 
{
    char n[5][50];
	int i;
    for (i = 0; i < 5; ++i) 
	{
        printf("Enter name %d: ", i + 1);
        scanf("%s", n[i]);
    }

    printf("\nEntered names:\n");
    for (i = 0; i < 5; ++i) 
	{
        printf("%d: %s\n", i + 1, n[i]);
    }

}

