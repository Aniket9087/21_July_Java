#include <stdio.h>
main() 
{
    float msalary, asalary;

    printf("Enter the  monthly salary: ");
    scanf("%f", &msalary);

    asalary = 12 * msalary;

    printf("Annual Salary: $%.2f\n", asalary);

}

