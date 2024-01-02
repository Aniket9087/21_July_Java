#include <stdio.h>

int isVowel(char ch) 
{
    return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
}

void countVowelsAndConsonants(const char *str, int *vowelCount, int *consonantCount) 
{
    *vowelCount = 0;
    *consonantCount = 0;

    while (*str) 
	{
        if ((*str >= 'a' && *str <= 'z') || (*str >= 'A' && *str <= 'Z')) 
		{
            if (isVowel(*str)) 
			{
                (*vowelCount)++;
            } 
			else 
			{
                (*consonantCount)++;
            }
        }

        str++;
    }
}
main() 
{
    char myString[] = "Count Vowels and Consonants";

    int vowelCount, consonantCount;

    countVowelsAndConsonants(myString, &vowelCount, &consonantCount);

    printf("Vowel Count: %d\n", vowelCount);
    printf("Consonant Count: %d\n", consonantCount);

}

