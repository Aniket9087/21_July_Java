#include<iostream>
#include<string>
using namespace std;
class person
{
	public:
		string name;
		int age;
	public:
		void setData()
		{
			cout<<"Enter Student Name : "<<endl;
			cin>>name;
			cout<<"Enter Student Age : "<<endl;
			cin>>age;
		}
		void getData()
		{
			cout<<"Student Name :"<<name<<endl;
			cout<<"Student Age :"<<age<<endl;
		}	
};
class mark:public person
{
	public:
		int sub1,sub2,sub3,avg;
	public:
		void setMark()
		{
			cout<<"Enter Subject 1 Mark : "<<endl;
			cin>>sub1;
			cout<<"Enter Subject 2 Mark : "<<endl;
			cin>>sub2;
			cout<<"Enter Subject 3 Mark : "<<endl;
			cin>>sub3;
			avg=(sub1+sub2+sub3)/3;
		}
		void getMark()
		{
			cout<<"Percentage is : "<<avg<<endl;
		}		
};
main()
{
	mark obj;
	obj.setData();
	obj.setMark();
	cout<<"\n-------- MarkSheet-------"<<endl;
	obj.getData();
	obj.getMark();
}
