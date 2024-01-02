#include <stdio.h>

struct Employee 
{
    int empno;
    char empname[50];
    char address[100];
    int age;
};

void inputEmployee(struct Employee *employee) 
{
    printf("Enter employee number: ");
    scanf("%d", &employee->empno);

    printf("Enter employee name: ");
    scanf("%s", employee->empname);

    printf("Enter employee address: ");
    scanf("%s", employee->address);

    printf("Enter employee age: ");
    scanf("%d", &employee->age);
}

void displayEmployee(const struct Employee *employee) 
{
    printf("Employee Number: %d\n", employee->empno);
    printf("Employee Name: %s\n", employee->empname);
    printf("Employee Address: %s\n", employee->address);
    printf("Employee Age: %d\n", employee->age);
}
main() 
{
	int i;
    struct Employee singleEmployee;

    printf("Enter information for a single employee:\n");
    inputEmployee(&singleEmployee);

    printf("\nDisplaying information for a single employee:\n");
    displayEmployee(&singleEmployee);

    struct Employee employees[5];

    printf("\nEnter information for five employees:\n");
    for (i = 0; i < 5; ++i) 
	{
        printf("\nEnter information for employee %d:\n", i + 1);
        inputEmployee(&employees[i]);
    }

    printf("\nDisplaying information for five employees:\n");
    for (i = 0; i < 5; ++i) 
	{
        printf("\nInformation for employee %d:\n", i + 1);
        displayEmployee(&employees[i]);
    }
}

