#include <stdio.h>
main() 
{
    char ch;

    printf("Enter a character: ");
    scanf(" %c", &ch);

    ch = tolower(ch);

    switch (ch) 
	{
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            printf("Vowel\n");
            break;
        default:
            printf("Consonant\n");
            break;
    }
}

