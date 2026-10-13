#include <iostream>
#include <String>
using namespace std;

int level=1;     /// global variable


 namespace engine{
        namespace audio{

            void playsound(string name){
                cout<<"playing "<<name<<endl;
            }

        }
    }
int main(){

    int level=0;  //local variable..

    cout<<"local variable : "<<level<<endl;
    cout<<"global variable : "<<::level<<endl;

    cout<<"nested namespaces....."<<endl;

   
    engine::audio::playsound("sword_clash");

    return 0;
}