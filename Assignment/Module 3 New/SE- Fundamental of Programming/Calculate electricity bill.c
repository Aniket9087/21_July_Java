#include <stdio.h>
main() 
{
    float unitcharge, totalbill;

    printf("Enter electricity unit charges: ");
    scanf("%f", &unitcharge);

    if (unitcharge <= 50) 
	{
        totalbill = unitcharge * 0.50;
    } 
	else if (unitcharge <= 150) 
	{
        totalbill = 50 * 0.50 + (unitcharge - 50) * 0.75;
    } 
	else if (unitcharge <= 250) 
	{
        totalbill = 50 * 0.50 + 100 * 0.75 + (unitcharge - 150) * 1.20;
    } 
	else 
	{
        totalbill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (unitcharge - 250) * 1.50;
    }

    totalbill += 0.20 * totalbill;

    printf("Total electricity bill: Rs. %.2f\n", totalbill);
}

