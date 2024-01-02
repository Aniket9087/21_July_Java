#include<stdio.h>
main()
{
	char f[20],m[20],l[20];
	
	printf("Enter Your School Name...");
	scanf("%s %s %s",f,m,l);
	
	printf("Abbreviated Name is...");
	printf("%c. %c. %s\n",f[0],m[0],l[0]);
	
}
