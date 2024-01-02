#include <stdio.h>

int isPalindrome(int num) 
{
    int o = num, rev = 0, r;

    while (num > 0) {
        r = num % 10;
        rev = rev * 10 + r;
        num = num / 10;
    }

    return o == rev;
}
main() 
{
    int n[3];

    int i = 0;
    while (i < 3) 
	{
        printf("Enter number %d: ", i + 1);
        scanf("%d", &n[i]);
        i++;
    }

    for (i = 0; i < 3; ++i) 
	{
        if (isPalindrome(n[i])) 
		{
            printf("%d is a palindrome.\n", n[i]);
        } 
		else 
		{
            printf("%d is not a palindrome.\n", n[i]);
        }
    }
}

