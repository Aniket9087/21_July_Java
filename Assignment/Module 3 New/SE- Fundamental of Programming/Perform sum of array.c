#include <stdio.h>

int calculateSum(int array[], int size) 
{
    int sum = 0,i;
    for (i = 0; i < size; ++i) 
	{
        sum += array[i];
    }
    return sum;
}

main() 
{
    int numbers[5],i;

    printf("Enter 5 numbers:\n");
    for (i = 0; i < 5; ++i) 
	{
        printf("Number %d: ", i + 1);
        scanf("%d", &numbers[i]);
    }

    int sum = calculateSum(numbers, 5);
    printf("\nSum of the array: %d\n", sum);
}

