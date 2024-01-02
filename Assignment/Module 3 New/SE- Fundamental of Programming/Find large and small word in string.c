#include <stdio.h>
#include <string.h>
main() 
{
    char inputString[1000], word[100], sWord[100], lWord[100];

    printf("Enter a string: ");
    gets(inputString);

    int len = strlen(inputString), i = 0;

    while (i < len) 
	{
        while (i < len && inputString[i] == ' ') 
		{
            i++;
        }

        int j = 0;
        while (i < len && inputString[i] != ' ') 
		{
            word[j++] = inputString[i++];
        }
        word[j] = '\0';

        if (strlen(word) > 0) 
		{
            if (strlen(word) < strlen(sWord) || strlen(sWord) == 0) 
			{
                strcpy(sWord, word);
            }

            if (strlen(word) > strlen(lWord)) 
			{
                strcpy(lword, word);
            }
        }
    }

    printf("Smallest word: %s\n", sWord);
    printf("Largest word: %s\n", lWord);

}

