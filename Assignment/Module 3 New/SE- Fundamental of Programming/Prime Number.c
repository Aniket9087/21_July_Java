#include <stdio.h>
main() 
{
    int rows = 5;
    int i,j,n;
    int cols = 10;

    for (i = 0; i < rows; ++i) 
	{
        for (j = 1; j <= cols; ++j) 
        {
            n = i * cols + j;
            printf("%02d ", n);
        }
        printf("\n");
    }
}

