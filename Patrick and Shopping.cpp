#include<iostream>
using namespace std;
int main () {
	int d1, d2, d3;
	cin>>d1;
	cin>>d2;
	cin>>d3;
	int a = (d1 + d2) * 2 ;
	int b  = d1 + d2 + d3 ;
	int c  = (d1*2)+ (d3*2);
	int z = (d2*2)+ (d3*2);
	int s = std :: min (a,b) ;
	int f = std :: min (c , z) ;
	int h =  std :: min (f ,s) ;

	cout<<h<<endl;
}