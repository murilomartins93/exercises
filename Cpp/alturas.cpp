#include<bits/stdc++.h>

using namespace std;

int main()
{

    int N;
    double altmedia, altsoma, porcentagem;

    cout << "Quantas pessoas serao digitadas? ";
    cin >> N;

    // declaracao dos arrays
    int idade[N];
    double altura[N];
    string nome[N];

    // entrada dos dados
    for(int i=0; i < N; i++)
    {
        cout << "Digite os dados da " << i+1 << "a pessoa:" << endl;
        cout << "Nome: ";
        cin.ignore(INT_MAX, '\n');
        getline(cin, nome[i]);
        cout << "Idade: ";
        cin >> idade[i];
        cout << "Altura: ";
        cin >> altura[i];
    }

    // calculo de porcentagem e calculo altura media

    int cont = 0;
    altsoma = 0;
    for(int i=0; i < N; i++)
    {
        if(idade[i] < 16)
        {
            cont++;
        }
        altsoma = altsoma + altura[i];
    }

    altmedia = altsoma / N;
    porcentagem = ((double)cont*100)/N;

    // impressao dos dados
    cout << fixed << setprecision(2);
    cout << endl << "Altura media = " << altmedia << endl;

    cout << fixed << setprecision(1);
    cout << "Pessoas com menos de 16 anos: " << porcentagem << "%" endl;

    // COMO IMPRIMIR PORCENTAGEM E FAZER APARECER OS NOMES DOS MENORES DE 16.
    for(int i=0; i < N; i++)
    {
        if(idade[i] < 16)
        {
            cout << nome[i];
        }
    }

    return 0;
}
