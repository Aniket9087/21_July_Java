#include <stdio.h>

void bubbleSort(int array[], int size) 
{
	int i,j;
    for (i = 0; i < size - 1; ++i) 
	{
        for (j = 0; j < size - i - 1; ++j) 
		{
            if (array[j] > array[j + 1]) 
			{
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}

void displayArray(int array[], int size) 
{
	int i;
    printf("Sorted Array in Ascending Order:\n");
    for (i = 0; i < size; ++i) 
	{
        printf("%d ", array[i]);
    }
    printf("\n");
}

int main() 
{
    int numbers[5],i;

    printf("Enter 5 numbers:\n");
    for (i = 0; i < 5; ++i) 
	{
        printf("Number %d: ", i + 1);
        scanf("%d", &numbers[i]);
    }

    bubbleSort(numbers, 5);

    displayArray(numbers, 5);
}

