#include <stdio.h>

main() 
{
    int d;
    float m;

    printf("Enter the number of days: ");
    scanf("%d", &d);

    m = d / 30.44;

    printf("Equivalent months: %.2f\n", m);

}

