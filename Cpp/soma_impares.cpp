#include<bits/stdc++.h>

using namespace std;

int main()
{

    int x, y, i, soma, troca;

    cout << "Digite dois numeros:" << endl;
    cin >> x >> y;

    if(x > y)
    {
        troca = x;
        x = y;
        y = troca;
    }

     soma = 0;

    for(i = x+1; i < y; i++)
        {
            if (i%2 != 0)
            {
                soma = i + soma;
            }
        }

    cout << "SOMA DOS IMPARES = " << soma;

    return 0;
}
