#include <stdio.h>
main() 
{
    int n, rev = 0, i;

    printf("Enter a number: ");
    scanf("%d", &n);

    while (n != 0) {
        i = n % 10;
        rev = rev * 10 + i;
        n= n / 10;
    }
    printf("Reversed number: %d\n", rev);
}

