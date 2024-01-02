#include <stdio.h>
main() 
{
    float p, r, t, amount, comInt;

    printf("Enter principal amount: ");
    scanf("%f", &p);

    printf("Enter rate of interest: ");
    scanf("%f", &r);

    printf("Enter time (in years): ");
    scanf("%f", &t);

    amount = p * (1 + r / 100 * t);

    comInt = amount - p;

    printf("Compound Interest: $%.2f\n", comInt);

}

