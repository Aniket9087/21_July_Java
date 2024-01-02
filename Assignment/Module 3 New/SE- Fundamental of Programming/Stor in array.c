#include <stdio.h>
main() 
{
	int i;
    char studentNames[5][50]; 

    printf("Enter names of 5 students:\n");
    for (i = 0; i < 5; ++i) 
	{
        printf("Student %d: ", i + 1);
        scanf("%s", studentNames[i]);
    }

    printf("\nNames of students:\n");
    for (i = 0; i < 5; ++i) 
	{
        printf("Student %d: %s\n", i + 1, studentNames[i]);
    }
}

