#include <stdio.h>

main() 
{
    char str1[100];
    char str2[100];

    printf("Enter the first string: ");
    gets(str1);

    printf("Enter the second string: ");
    gets(str2);

    int i, j;
    for (i = 0; str1[i] != '\0'; i++);

    for (j = 0; str2[j] != '\0'; j++) 
	{
        str1[i + j] = str2[j];
    }

    str1[i + j] = '\0';

    printf("Combined string: %s\n", str1);

}

