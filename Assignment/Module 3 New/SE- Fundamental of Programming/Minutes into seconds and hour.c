#include <stdio.h>
main() 
{
    int min, h, sec;

    printf("Enter the number of minutes: ");
    scanf("%d", &min);

    h = min / 60;
    sec = min % 60;

    printf("Equivalent hours: %d\n", h);
    printf("Equivalent seconds: %d\n", sec);

}

