#include <stdio.h>
main() 
{
    float fah, cel;

    printf("Enter temperature in Fahrenheit: ");
    scanf("%f", &fah);

    
    cel = (fah - 32) * 5 / 9;

    printf("Temperature in Celsius: %.2f\n", cel);

}

