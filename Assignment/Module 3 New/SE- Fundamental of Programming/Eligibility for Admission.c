#include <stdio.h>
main() 
{
    int marksMath, marksPhy, marksChem, totalMarks, totalMathsPhysics;

    printf("Input the marks obtained in Physics: ");
    scanf("%d", &marksPhy);

    printf("Input the marks obtained in Chemistry: ");
    scanf("%d", &marksChem);

    printf("Input the marks obtained in Mathematics: ");
    scanf("%d", &marksMath);

    totalMarks = marksPhy + marksChem + marksMath;
    totalMathsPhysics = marksMath + marksPhy;

    if ((marksMath >= 65) && (marksPhy >= 55) && (marksChem >= 50) && (totalMarks >= 190 || totalMathsPhysics >= 140)) 
	{
        printf("The candidate is eligible for admission.\n");
    }
	else 
	{
        printf("The candidate is not eligible for admission.\n");
    }

}

