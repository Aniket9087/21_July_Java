#include<iostream>
#include<string>
using namespace std;
class person
{
	public:
		int roll;
	public:
		void setData()
		{
			cout<<"Enter Student Rollnumber : "<<endl;
			cin>>roll;
		}
		void getData()
		{
			cout<<"Student RollNumber :"<<roll<<endl;
		}	
};
class mark:public person
{
	public:
		int sub1,sub2,sub3;
	public:
		void setMark()
		{
			cout<<"Enter Subject 1 Mark : "<<endl;
			cin>>sub1;
			cout<<"Enter Subject 2 Mark : "<<endl;
			cin>>sub2;
			cout<<"Enter Subject 3 Mark : "<<endl;
			cin>>sub3;
			
		}
			
};
class result:public mark
{
	public:
		int avg;
		
	public:
		void getMark()
		{
			avg=(sub1+sub2+sub3)/3;
			cout<<"Percentage is : "<<avg<<endl;
		}	
};
main()
{
	result obj;
	obj.setData();
	obj.setMark();
	cout<<"\n-------- MarkSheet-------"<<endl;
	obj.getData();
	obj.getMark();
}
