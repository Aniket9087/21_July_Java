#include <iostream>
#include <string>
using namespace std;

class Car 
{
	public:
		void SetData(string company,string model,int year)
		{
			cout<<"Enter Company Name Of Car"<<endl;
			cin>>company;
			cout<<"Enter Model Name Of Car"<<endl;
			cin>>model;
			cout<<"Enter Year Of Car"<<endl;
			cin>>year;
		}
		void GetData(string company,string model,int year)
		{
			cout<<"Company Name Of Car :"<<company<<endl;
			cout<<"Enter Model Name Of Car :"<<model<<endl;
			cout<<"Enter Year Of Car :"<<year<<endl;
		}
};

main() 
{
	string company;
	string model;
    int year;
	Car myCar;
	myCar.SetData(company,model,year);
	myCar.GetData(company,model,year);

}

