#include <stdio.h>

int countWords(const char *str) 
{
    int count = 0;
    int isWord = 0;  
    	
    while (*str) 
	{
        if (*str == ' ' || *str == '\t' || *str == '\n' || *str == '\r') 
		{
            isWord = 0;  
        }
          else if (isWord == 0) 
		{
            isWord = 1;
            count++; 
        }

        str++; 
    }

    return count;
}
main() 
{
    char myString[] = "Count the total number of words";

    int wordCount = countWords(myString);
    printf("Total number of words: %d\n", wordCount);

}

