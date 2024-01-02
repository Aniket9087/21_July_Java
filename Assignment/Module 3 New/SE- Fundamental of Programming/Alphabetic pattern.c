#include <stdio.h>
main() 
{
    int n = 5,i,j;
    char ch = 'A';

    for (i = 1; i <= n; ++i) 
	{
        for (j = 1; j <= i; ++j) 
		{
            printf("%c", ch);
            ch++;
        }
        printf("\n");
    }
}

