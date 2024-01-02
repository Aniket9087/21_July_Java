#include <stdio.h>
main() 
{
    float bs, gs, hra, da;

    printf("Enter the basic salary: ");
    scanf("%f", &bs);

    if (bs <= 10000) 
	{
        hra = 0.20 * bs;
        da = 0.80 * bs;
    }
	else if (bs <= 20000) 
	{
        hra = 0.25 * bs;
        da = 0.90 * bs;
    } 
	else 
	{
        hra = 0.30 * bs;
        da = 0.95 * bs;
    }

    gs = bs + hra + da;

    printf("Basic Salary: Rs. %.2f\n", bs);
    printf("HRA: Rs. %.2f\n", hra);
    printf("DA: Rs. %.2f\n", da);
    printf("Gross Salary: Rs. %.2f\n", gs);
}

