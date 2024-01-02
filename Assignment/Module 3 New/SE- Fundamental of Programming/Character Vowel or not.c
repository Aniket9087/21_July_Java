#include <stdio.h>
 main() 
{

    char ch;

    printf("Enter the Character: ");
    scanf(" %c", &ch); 
    
    if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) 
	{
        printf("The Character is a vowel.\n");
    }
	else
	{
        printf("The Character is not a vowel.\n");
    }

}

