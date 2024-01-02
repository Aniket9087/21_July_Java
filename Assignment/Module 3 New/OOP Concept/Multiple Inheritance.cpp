#include<iostream>
#include<string>
using namespace std;
class person
{
	public:
		string name;
		int age;
	public:
		void setPerson()
		{
			cout<<"Enter name: "<<endl;
        	cin>>name;
        	cout<<"Enter age: "<<endl;
        	cin>>age;
		}
		void getPerson()
		{
			cout<<"Name : "<<name<<endl;
			cout<<"Age : "<<age<<endl;
		}
};
class student : public person
{
	public:
		float percen;
	public:
		void setStudent()
		{
			cout<<"Enter Percentage: "<<endl;
			cin>>percen;
		}
		void getStudent()
		{
			cout<<"Percentage : "<<percen<<endl;
		}
};
class teacher : public person
{
	public:
		int salary;
	public:
		void setTeacher()
		{
			cout<<"Enter Salary: "<<endl;
			cin>>salary;
		}
		void getTeacher()
		{
			cout<<"Salary : "<<salary<<endl;
		}
};
main()
{
	student stu;
	teacher tea;
	
	stu.setPerson();
	stu.setStudent();
	stu.getPerson();
	stu.getStudent();
	tea.setTeacher();
	tea.getTeacher();
	
}
