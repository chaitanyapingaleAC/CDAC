#include <iostream>
#include <String>
using namespace std;
class buug{
public:
    void resetSensorPairV1(int reading1, int reading2)// Original bug call by value
    {
        int temp=reading1;
        reading1=reading2;
        reading2=temp;

    } 

    void resetSensorPairV2(int& reading1, int& reading2) // Fix 1  Call by refreence
    {
        int temp=reading1;
        reading1=reading2;
        reading2=temp;


    }

    void resetSensorPairV3(int* reading1, int* reading2) // call by pointer
    {
        int temp=*reading1;
        *reading1=*reading2;
        *reading2=temp;


    }



};
int main(){
    int a=55;
    int b=12;
    buug bb;
    cout<<"-----call by value-----"<<endl;
    cout<<"before call by value A="<<a<<" B="<<b<<endl;
    bb.resetSensorPairV1(a,b);
    cout<<"after call by value A="<<a<<" B="<<b<<endl;
    cout<<"-----call by refrence-----"<<endl;
    cout<<"before call by refrence A="<<a<<" B="<<b<<endl;
    bb.resetSensorPairV2(a,b);
     cout<<"after call by refrence A="<<a<<" B="<<b<<endl;
    cout<<"-----call by pointer-----"<<endl;
    cout<<"before call by pointer A="<<a<<" B="<<b<<endl;
    bb.resetSensorPairV3(&a,&b);
     cout<<"after call by pointer A="<<a<<" B="<<b<<endl;
    return 0;
}