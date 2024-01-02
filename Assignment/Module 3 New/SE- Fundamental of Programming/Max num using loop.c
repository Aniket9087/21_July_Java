#include <stdio.h>
main() 
{
    int n, d, max = -1;

    printf("Enter a number: ");
    scanf("%d", &n);

    while (n != 0) {
        d = n % 10;
        
        if (d > max) {
            max = d;
        }

        n = n / 10;
    }

    printf("Maximum digit: %d\n", max);
}

