#include <stdio.h>
main() 
{
    int n, f, l;

    printf("Enter a number: ");
    scanf("%d", &n);

    l = n % 10;

    f = n;
    while (f >= 10) {
        f /= 10;
    }

    int sum = f + l;

    printf("Sum of first and last digits: %d\n", sum);
}

