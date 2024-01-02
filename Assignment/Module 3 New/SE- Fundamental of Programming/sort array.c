#include <stdio.h>
main() 
{
    int size,i,j;

    printf("Enter the size of the arrays: ");
    scanf("%d", &size);

    int arr1[size], arr2[size];

    printf("Enter %d elements for the first array:\n", size);
    for (i = 0; i < size; ++i) 
	{
        scanf("%d", &arr1[i]);
    }

    printf("Enter %d elements for the second array:\n", size);
    for (i = 0; i < size; ++i) 
	{
        scanf("%d", &arr2[i]);
    }

    int choice;
    printf("Enter sorting order (1 for ascending, 2 for descending): ");
    scanf("%d", &choice);

    for (i = 0; i < size - 1; ++i) 
	{
        for (j = 0; j < size - i - 1; ++j) 
		{
            int t;
            if ((choice == 1 && arr1[j] > arr1[j + 1]) || (choice == 2 && arr1[j] < arr1[j + 1])) 
			{
                t = arr1[j];
                arr1[j] = arr1[j + 1];
                arr1[j + 1] = t;
            }
            if ((choice == 1 && arr2[j] > arr2[j + 1]) || (choice == 2 && arr2[j] < arr2[j + 1])) 
			{
                t = arr2[j];
                arr2[j] = arr2[j + 1];
                arr2[j + 1] = t;
            }
        }
    }

    printf("Sorted array 1: ");
    for (i = 0; i < size; ++i) 
	{
        printf("%d ", arr1[i]);
    }
    printf("\n");

    printf("Sorted array 2: ");
    for (i = 0; i < size; ++i) 
	{
        printf("%d ", arr2[i]);
    }
    printf("\n");
}

