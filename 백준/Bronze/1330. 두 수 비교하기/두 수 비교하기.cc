#include <iostream>

using namespace std;

int main()
{
	// 자료형 (크기 단위, byte) Data Type
	// 정수형 : char(1), short(2), int(4), long long(8)
	// 실수형 : float(4), double(8)

	int a, b;

	cin >> a  >> b;

	if (a > b)
		cout << ">";
	else if (a < b)
		cout << "<";
	else if (a == b)
		cout << "==";


	return 0;
}