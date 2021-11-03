#include<iostream>
using namespace std;
int main () {
	int w;
	cin >> w;
	for(int i =0; i<w; i++){
	string s;
	cin >> s;
		
	if (s.length() > 10){
		
		string s1 = s.substr(0,1);
		string s2 = s.substr(s.length() -1, s.length());
		cout<<s1<<(s.length() - 2)<<s2<<endl;
		}
		else 
		cout<<s<<endl;
	}
}
