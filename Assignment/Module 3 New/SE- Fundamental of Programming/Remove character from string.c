#include <stdio.h>

void removeNonAlphabets(char *str) 
{
    int i, j;

    for (i = 0, j = 0; str[i] != '\0'; i++) 
	{
        if ((str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z')) 
		{
            str[j++] = str[i];
        }
    }

    str[j] = '\0';
}

int main() 
{
    char inputString[100];

    printf("Enter a string: ");
    gets(inputString);

    removeNonAlphabets(inputString);

    printf("String after removing non-alphabetic characters: %s\n", inputString);

    return 0;
}

