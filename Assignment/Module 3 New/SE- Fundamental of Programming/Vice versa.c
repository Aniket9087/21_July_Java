#include <stdio.h>

void swapCase(char *str) 
{
    while (*str) 
	{
        if (*str >= 'a' && *str <= 'z') 
		{
            *str = *str - 'a' + 'A';
        }
        else if (*str >= 'A' && *str <= 'Z') 
		{
            *str = *str - 'A' + 'a';
        }

        str++;
    }
}
main() 
{
    char sentence[100];

    printf("Enter a sentence: ");
    fgets(sentence, sizeof(sentence), stdin);

    swapCase(sentence);

    printf("Sentence after swapping case: %s\n", sentence);

}

