#include <stdio.h>

void inputMatrix(int matrix[][3], int rows, int cols) 
{
	int i,j;
    printf("Enter elements of the matrix:\n");
    for (i = 0; i < rows; ++i) 
	{
        for (j = 0; j < cols; ++j) 
		{
            printf("Element[%d][%d]: ", i + 1, j + 1);
            scanf("%d", &matrix[i][j]);
        }
    }
}

void displayMatrix(int matrix[][3], int rows, int cols) 
{
	int i,j;
    printf("Matrix:\n");
    for (i = 0; i < rows; ++i) 
	{
        for (j = 0; j < cols; ++j) 
		{
            printf("%d\t", matrix[i][j]);
        }
        printf("\n");
    }
}

int findSum(int matrix[][3], int rows, int cols) 
{
    int sum = 0,i,j;
    for (i = 0; i < rows; ++i) 
	{
        for (j = 0; j < cols; ++j) 
		{
            sum += matrix[i][j];
        }
    }
    return sum;
}

int main() 
{
    int matrix[3][3];

    inputMatrix(matrix, 3, 3);

    displayMatrix(matrix, 3, 3);

    int sum = findSum(matrix, 3, 3);
    printf("\nSum of elements in the matrix: %d\n", sum);

}

