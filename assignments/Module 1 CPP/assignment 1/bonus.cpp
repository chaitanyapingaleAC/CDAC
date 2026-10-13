#include <iostream>
#include <String>
using namespace std;

struct layout1{
    
    char c;
    int d;
    char i;


};
struct layout2{
    int i;
    char c;
    char d;
    
};
int main(){
    cout<<"size of layout 1 : "<<sizeof(layout1)<<endl;
    cout<<"size of layout 2 : "<<sizeof(layout2)<<endl;


}
     /*The sizes can differ because the compiler inserts padding
       according to alignment requirements.

     Padding is extra unused memory added by the compiler so that
       members are stored at properly aligned addresses.

     Member order matters because changing the order can change
       member offsets and the total struct size. This is important
       for network packet headers and hardware register maps.*/
    