#include <stdio.h>

main() 
{
    float exp[5];
    float total = 0, average;
    int i;


    for (i = 0; i < 5; i++) 
	{
        printf("Enter expense %d: ", i + 1);
        scanf("%f", &exp[i]);

        total += exp[i];
    }

    average = total / 5;

    printf("\nExpense Information:\n");
    for (i = 0; i < 5; i++) 
	{
        printf("Expense %d: $%.2f\n", i + 1, exp[i]);
    }

    printf("\nTotal Expense: $%.2f\n", total);
    printf("Average Expense: $%.2f\n", average);

}

