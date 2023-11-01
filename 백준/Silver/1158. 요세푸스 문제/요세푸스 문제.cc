#include <iostream>
#include <queue>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	int n, k;
	cin >> n >> k;

	queue<int> q;
	for (int i = 1; i <= n; i++)
		q.push(i);

	cout << '<';

	while (q.size() > 1)
	{
		for (int j = 1; j < k; j++)
		{
			int temp = q.front();
			q.pop();
			q.push(temp);
		}

		cout << q.front() << ", ";
		q.pop();
	}

	cout << q.front() << ">" << endl;

	return 0;
}