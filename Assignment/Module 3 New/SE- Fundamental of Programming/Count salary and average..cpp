#include <stdio.h>
main() 
{
    char name[5][100];
    float salary[5];
    float total = 0, average;
    int i;


    for (i = 0; i < 5; i++) {
        printf("Enter name of employee %d: ", i + 1);
        scanf("%s", name[i]);

        printf("Enter salary of employee %d: ", i + 1);
        scanf("%f", &salary[i]);

        total += salary[i];
    }

    average = total / 5;

    printf("\nEmployee Information:\n");
    for (i = 0; i < 5; i++) 
	{
        printf("Name: %s\tSalary: $%.2f\n", name[i], salary[i]);
    }

    printf("\nTotal Salary: $%.2f\n", total);
    printf("Average Salary: $%.2f\n", average);

}

