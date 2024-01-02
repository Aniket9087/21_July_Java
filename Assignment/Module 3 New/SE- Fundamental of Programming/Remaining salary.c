#include <stdio.h>
main() 
{
    float msalary, inspre, loanInst, remSalary;

    printf("Enter the monthly salary: ");
    scanf("%f", &msalary);

    inspre = 0.10 * msalary;

    loanInst = 0.10 * msalary;

    remSalary = msalary - inspre - loanInst;

    printf("Insurance Premium: $%.2f\n", inspre);
    printf("Loan Installment: $%.2f\n", loanInst);
    printf("Remaining Salary: $%.2f\n", remSalary);

}

