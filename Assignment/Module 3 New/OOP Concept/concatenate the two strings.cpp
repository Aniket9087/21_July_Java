#include<iostream>
#include<string>
using namespace std;
class Do
{
	public:
		char str1[20];
		char str2[20];
		char str3[100];
		
	public:
		char Dod(char str1,char str2)
		{
			cout<<"Enter First String :"<<endl;
			cin>>str1;
			cout<<"Enter Second String :"<<endl;
			cin>>str2;
		}
		int Dod()
		{
			cout<<"Your String is:"<<str1<<str2<<endl;	
		}	
};
main()
{
	Do obj;
	obj.Dod("Dilip","Dabhi");
	obj.Dod();
}
