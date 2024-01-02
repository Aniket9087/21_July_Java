#include<iostream>
#include<cmath>
using namespace std;
class calc
{
	public:
		float area;
		float breadth;
	public:	
		 Do()
		{
			cout<<"Enter Value Of Area :"<<endl;
			cin>>area;
			cout<<"Enter Value Of Breadth :"<<endl;
			cin>>breadth;
		}
	public:
		void Do(float area,float breadth)
		{
			cout<<"Area Of Rectangle : "<<area*breadth<<endl;
			cout<<"Area Of Triangle : "<0.5*area*breadth<<endl;
			cout<<"Area Of Circle : "<<area*area*3.14<<endl;
		}
};
main()
{
	calc obj;
	obj.Do();
	obj.Do();
}

