#include <stdio.h>
main() 
{
    int n, o, rev = 0, r;

    printf("Enter a number: ");
    scanf("%d", &n);

    o = n;

    for (; n != 0; n /= 10) 
	{
        r = n % 10;
        rev = rev * 10 + r;
    }

    printf("Original number: %d\n", o);
    printf("Reversed number: %d\n", rev);
}

