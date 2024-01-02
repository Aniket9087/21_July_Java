#include <stdio.h>
main() 
{
    int j, sum = 0, i = 1;

    printf("Enter the number: ");
    scanf("%d", &j);

    while (i <= j) {
        sum += i;
        i++;
    }
    printf("Sum of natural numbers up to %d is: %d\n", j, sum);
}

