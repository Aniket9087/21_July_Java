#include <stdio.h>
main() 
{
    float cPrice, sellPrice, p, l;

    printf("Enter the cost price: ");
    scanf("%f", &cPrice);

    printf("Enter the selling price: ");
    scanf("%f", &sellPrice);

    if (sellPrice > cPrice) 
	{
        p = sellPrice - cPrice;
        printf("Profit: %.2f\n", p);
    }
	else if (sellPrice < cPrice) 
	{
        l = cPrice - sellPrice;
        printf("Loss: %.2f\n", l);
    }
	else 
	{
        printf("No profit, no loss.\n");
    }
}

