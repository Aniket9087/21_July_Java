#include <stdio.h>

main() 
{
    float k, m;

    printf("Enter the distance in kilometers: ");
    scanf("%f", &k);

    m = k * 1000;

    printf("Equivalent meters: %.2f\n", m);

}

