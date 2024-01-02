#include<iostream>
#include<string>
using namespace std;
class cricketer
{
	public:
		int match;
		string name;
	public:
		void setData()
		{
			cout<<"Enter Player Name : "<<endl;
			cin>>name;
			cout<<"Enter Number Of Match : "<<endl;
			cin>>match;
		}
};
class batman : public cricketer
{
	int total;
	int avg;
	int best;
	
	public:
		void inputData()
		{
			cout<<"Enter Total Runs : "<<endl;
			cin>>total;
			cout<<"Enter bestpermance Of Match : "<<endl;
			cin>>best;
			avg=total/match;
		}
		void showData()
		{
			cout<<"Player Name: " << name <<endl;
	        cout<<"Matches Played: " << match <<endl;
    	    cout<<"Total Runs: " << total <<endl;
        	cout<<"Average Runs: " << avg <<endl;
        	cout<<"Best Performance: " << best<<endl;

		}
		
};
main()
{
	batman obj;
	obj.setData();
	obj.inputData();
	obj.showData();
}
