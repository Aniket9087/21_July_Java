#include <stdio.h>

main() 
{
    int y, m, d;

    printf("Enter the number of years: ");
    scanf("%d", &y);

    m = y * 12;
    d = y * 365;

    printf("Equivalent months: %d\n", m);
    printf("Equivalent days: %d\n", d);

}

