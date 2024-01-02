#include <iostream>
using namespace std;

class Base 
{
  private:
    int pvt = 1;

  protected:
    int prot = 2;

  public:
    int pub = 3;
    int getPVT() 
	{
      return pvt;
    }
};

class PublicDerived : public Base 
{
  public:
    int getProt() 
	{
      return prot;
    }
};
main() 
{
  PublicDerived obj;
  cout << "Private = " << obj.getPVT() << endl;
  cout << "Protected = " << obj.getProt() << endl;
  cout << "Public = " << obj.pub << endl;
}
