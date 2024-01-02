#include<iostream>
#include<string>
using namespace std;

class Person 
{
private:
    string name;
    int age;
    string country;

public:
   void inputData()
   {
   		cout<<"Enter Your Name:"<<endl;
		cin>>name;
		cout<<"Enter Your Age:"<<endl;
		cin>>age;
		cout<<"Enter Your Country:"<<endl;
		cin>>country;
   }
   void displayData()
		{
			cout<<"Your Name ="<<name<<endl;
			cout<<"Your Age ="<<age<<endl;
			cout<<"our Country ="<<country<<endl;
		}
};
main()
{
   Person per;
   per.inputData();
   per.displayData();
}

