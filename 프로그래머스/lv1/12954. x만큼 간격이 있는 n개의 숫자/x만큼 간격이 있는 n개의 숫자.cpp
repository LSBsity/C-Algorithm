#include <string>
#include <vector>

using namespace std;

vector<long long> solution(int x, int n)
{
    vector<long long> answer;
    int A = x;
    for (int i = 0; i < n; i++)
    {
        answer.push_back(x);
        x += A;
    }

    return answer;
}