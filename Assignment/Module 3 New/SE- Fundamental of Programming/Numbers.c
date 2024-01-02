#include <stdio.h>
main() 
{
    int n = 10;

    int p[n][n];

    int num = 1;
    int row, col,l,i,j;

    for (l = 0; l < n / 2; ++l) 
	{
        for (col = l; col < n - l; ++col) 
		{
            p[l][col] = num++;
        }

        for (row = l + 1; row < n - l; ++row) 
		{
            p[row][n - l - 1] = num++;
        }

        for (col = n - l - 2; col >= l; --col) 
		{
            p[n - l - 1][col] = num++;
        }

        for (row = n - l - 2; row > l; --row) 
		{
            p[row][l] = num++;
        }
    }
    for (i = 0; i < n; ++i) 
	{
        for (j = 0; j < n; ++j) 
		{
            printf("%3d ", p[i][j]);
        }
        printf("\n");
    }
}

