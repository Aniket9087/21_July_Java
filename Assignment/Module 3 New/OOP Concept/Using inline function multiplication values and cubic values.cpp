#include<iostream>
using namespace std;
multi(int num1,int num2)
{
	return num1*num2;
}
cube(int num1,int num2)
{
	cout<<"Cube of Number 1 :"<<num1*num1<<endl;
	cout<<"Cube of Number 2:"<<num2*num2;
}

main()
{
	int num1,num2;
	cout<<"Enter Value of Number 1"<<endl;
	cin>>num1;
	cout<<"Enter Value of Number 2"<<endl;
	cin>>num2;
	
	cout<<"multiplication :"<<multi(num1,num2)<<endl;
	cube(num1,num2);
}
