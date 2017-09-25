#include <stack>
#include <iostream>

using namespace std;

stack<int> invertir(stack<int> pila){
		     stack<int> retorno;
		     for(int i = pila.size(); i > 0; --i){
		       retorno.push(pila.top());
		       pila.pop();
		     }
		     return retorno;
		   }
void print(stack<int> pila){
  cout << "[";
  cout << pila.top();
  pila.pop();
  do{
    cout << "-" << pila.top();
    pila.pop();
  }while(!pila.empty());

  cout << "]" << endl;
}

int main(){
  stack<int> pila;
  for(int i = 1; i <= 3; ++i){
    pila.push(i);
  }
  print(pila);
  pila = invertir(pila);
  print(pila);
  
    return 0;
}
		   
