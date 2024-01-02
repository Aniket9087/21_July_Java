#include <stdio.h>
#include <math.h>
main() 
{
    int num, o, r, result = 0, n = 0;

    printf("Enter an integer: ");
    scanf("%d", &num);

    o = num;

    while (o != 0) {
        o /= 10;
        ++n;
    }

    o = num;

    while (o != 0) {
        r = o % 10;
        result += pow(r, n);
        o /= 10;
    }

    if (result == num)
        printf("%d is an Armstrong number.\n", num);
    else
        printf("%d is not an Armstrong number.\n", num);

}

