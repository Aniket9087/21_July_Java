#include<iostream>
using namespace std;
class margin
{
	public:
		int length;
		int width;
	public:
		void setData()
		{
			cout<<"Enter Length Of Ractangle"<<endl;
			cin>>length;
			cout<<"Enter Width Of Ractangle"<<endl;
			cin>>width;
		}
};
class area: public margin
{
	public:
		void getData()
		{
			cout<<"Area Of Ractangle : "<<length*width<<endl;
		}
};
main()
{
	area obj;
	obj.setData();
	obj.getData();
}
