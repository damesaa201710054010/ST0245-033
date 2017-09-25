#include <queue>
#include <iostream>
#include <string>

using namespace std;

void atender(queue<string> cola){
  cout << "[";
  cout << "Atendiendo a: " << cola.front();
  cola.pop();
  while(!cola.empty()){
      cout << endl <<"Atendiendo a: " << cola.front();
      cola.pop();  
    }
}

void print(queue<string> cola){
  cout << "[";
  cout << cola.front();
  cola.pop();
  do{
    cout << "-" << cola.front();
    cola.pop();
  }while(!cola.empty());
  cout << "]" << endl;
}

int main(){
 queue<string> cola;
 cola.push("Juan");
 cola.push("Maria");
 cola.push("Pedro");

 print(cola);
 atender(cola);

    return 0;
}
