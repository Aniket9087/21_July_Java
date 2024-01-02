#include <stdio.h>

void inputMatrix(int matrix[][100], int rows, int cols) 
{
	int i,j,k;
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

void displayMatrix(int matrix[][100], int rows, int cols) 
{
	int i,j,k;
    for (i = 0; i < rows; ++i) 
	{
        for (j = 0; j < cols; ++j) {
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }
}

void addMatrices(int mat1[][100], int mat2[][100], int result[][100], int rows, int cols) 
{
	int i,j,k;
    for (i = 0; i < rows; ++i) 
	{
        for (j = 0; j < cols; ++j) 
		{
            result[i][j] = mat1[i][j] + mat2[i][j];
        }
    }
}

void subtractMatrices(int mat1[][100], int mat2[][100], int result[][100], int rows, int cols) 
{
	int i,j,k;
    for (i = 0; i < rows; ++i) 
	{
        for (j = 0; j < cols; ++j) 
		{
            result[i][j] = mat1[i][j] - mat2[i][j];
        }
    }
}

void multiplyMatrices(int mat1[][100], int mat2[][100], int result[][100], int rows1, int cols1, int cols2) 
{
	int i,j,k;
    for (i = 0; i < rows1; ++i) 
	{
        for (j = 0; j < cols2; ++j) 
		{
            result[i][j] = 0;
            for (k = 0; k < cols1; ++k) 
			{
                result[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }
}

int main() {
    int mat1[100][100], mat2[100][100], result[100][100];
    int rows1, cols1, rows2, cols2;

    printf("Enter dimensions of the first matrix (rows columns): ");
    scanf("%d %d", &rows1, &cols1);

    inputMatrix(mat1, rows1, cols1);

    printf("Enter dimensions of the second matrix (rows columns): ");
    scanf("%d %d", &rows2, &cols2);

    inputMatrix(mat2, rows2, cols2);

    if (rows1 != rows2 || cols1 != cols2) 
	{
        printf("Matrices cannot be added, subtracted, or multiplied with the given dimensions.\n");
        return 1;  
    }

    addMatrices(mat1, mat2, result, rows1, cols1);

    printf("\nResult of addition:\n");
    displayMatrix(result, rows1, cols1);

    subtractMatrices(mat1, mat2, result, rows1, cols1);

    printf("\nResult of subtraction:\n");
    displayMatrix(result, rows1, cols1);

    if (cols1 != rows2) 
	{
        printf("\nMatrices cannot be multiplied with the given dimensions.\n");
        return 1; 
    }

    multiplyMatrices(mat1, mat2, result, rows1, cols1, cols2);

    printf("\nResult of multiplication:\n");
    displayMatrix(result, rows1, cols2);
}

