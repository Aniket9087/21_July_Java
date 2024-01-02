#include<iostream>
using namespace std;
class calc
{
	public:
		int oparate(int num1,int num2)
		{
			return num1+num2;
		}
		int oparate(float num1,float num2)
		{
			return num1-num2;
		}
			int oparate(float num1,int num2)
		{
			return num1*num2;
		}
			int oparate(int num1,float num2)
		{
			return num1/num2;
		}
};
main()
{
	calc obj;
	cout<<"Addition :"<<obj.oparate(100,50)<<endl;
	cout<<"Subtraction :"<<obj.oparate(100,50)<<endl;
	cout<<"multplication :"<<obj.oparate(100,50)<<endl;
	cout<<"Division :"<<obj.oparate(100,50)<<endl;
}
