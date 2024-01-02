#include<iostream>
using namespace std;
template <class T>
void sort(T arr[], int size)
{
	for (int i = 0; i < size; i++)
	{
		for (int j = i+1; j < size; j++)
		{
			if (arr[i] > arr[j])
			{
				T temp;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
}
main()
{
	int N;
	cout<<"How many element want to add "<<endl;
	cin>>N;
	int array[N];
	cout<<"Enter elements:"<<endl;
	for (int i = 0; i < N; i++)
	{
		cin>>array[i];
	}
		sort(array,N);
	for (int i = 0; i < N; i++)
	{
		cout<<array[i]<<endl;
	}

}
