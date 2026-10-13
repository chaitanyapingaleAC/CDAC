#include <iostream>
#include <String>
using namespace std;
class hard{

    public:

    void status(const int* statusreg){
        int ref=50;
       cout<<"value:"<<*statusreg<<endl;
       cout<<"address : "<<&statusreg<<endl;
        cout<<"*statusreg=20;"<<"  it gives error becuase the value of status reg is constant "<<endl;
        statusreg= &ref;
        cout<<"addresss after change: "<<statusreg<<endl;

        cout<<"in const int* statusreg value not change only pointer address change because value is constant........"<<endl;
        cout<<"this is read only value..."<<endl;
    }
    void control(int* const controlreg){
         int ref=111;
        cout<<"value : "<<*controlreg<<endl;
       *controlreg=100;
       cout<<"value after change : "<<*controlreg<<endl;
       cout<<"controlreg=&ref"<<"  it give error"<<endl;
       cout<<"in int* const controlreg the value is can be change but pointer cannot be change because it ius counstant"<<endl;
       cout<<"it is read only pointer.."<<endl;




    }
    void data(const int* const datareg){
        int ref=50;
        cout<<"datareg=50;"<<"  this will give error.."<<endl;
        cout<<"datareg=&ref "<<"   this will also give error.."<<endl;

        cout<<" in const *int const datareg both the value and pointer are constant so we cant change them it is constant..."<<endl;
        cout<<"it is fully read only"<<endl;

    }

};
int main(){
    int statusreg=10;
    int controlreg=20;
    int datareg=0;

    hard h;
    cout<<"----------------------------"<<endl;
    h.status(&statusreg);
    cout<<"----------------------------"<<endl;
    h.control(&controlreg);
    cout<<"----------------------------"<<endl;
    h.data(&datareg);
    cout<<"----------------------------"<<endl;


    return 0;
}