#include <stdio.h>
main() 
{
    int n, d, sum = 0;

    printf("Enter a number: ");
    scanf("%d", &n);

    while (n != 0) {
        d = n % 10;
        sum += d;
        n = n / 10;
    }

    printf("Summation of digits: %d\n", sum);
}

