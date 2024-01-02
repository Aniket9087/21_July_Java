#include <stdio.h>
main() 
{
    int n[10];
    int evencount = 0, oddcount = 0;
    int sumeven = 0, sumodd = 0;
    int i;

    printf("Enter 10 numbers:\n");

    for (i = 0; i < 10; i++) 
	{
        printf("Number %d: ", i + 1);
        scanf("%d", &n[i]);

        if (n[i] % 2 == 0) 
		{
            evencount++;
            sumeven += n[i];
        } 
		else 
		{
            oddcount++;
            sumodd += n[i];
        }
    }

    printf("\nResults:\n");
    printf("a. Number of even numbers: %d\n", evencount);
    printf("b. Number of odd numbers: %d\n", oddcount);
    printf("c. Sum of even numbers: %d\n", sumeven);
    printf("d. Sum of odd numbers: %d\n", sumodd);
}

