#include <stdio.h>
main() 
{
    int num;

    printf("Enter an integer: ");
    scanf("%d", &num);

    printf("N^1: %d\n", num);
    printf("N^2: %d\n", num * num);
    printf("N^3: %d\n", num * num * num);

}

