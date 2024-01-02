#include <stdio.h>
main() 
{
    float bill;
    printf("Enter the bill amount: ");
    scanf("%f", &bill);

    if (bill > 800) {
        bill = bill + 0.18 * bill;
    }

    if (bill < 256) {
        bill = 256;
    }

    printf("bill amount: Rs. %.2f\n", bill);

}

