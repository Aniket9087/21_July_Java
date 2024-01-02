#include <stdio.h>

int main() {
    float p, r, t, comint;

    printf("Enter principal amount: ");
    scanf("%f", &p);

    printf("Enter rate of interest: ");
    scanf("%f", &r);

    printf("Enter time (in years): ");
    scanf("%f", &t);

    comint = p * (1 - 1 / (100 * r)) * t;

    printf("Compound Interest: $%.2f\n", comint);

}

