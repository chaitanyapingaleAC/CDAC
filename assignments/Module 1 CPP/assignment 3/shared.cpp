#include <iostream>
#include <String>
#include <memory>
using namespace std;
class shader{

//     Private: 
//     string name; 
//     string type;
// Constructor prints: [Shader Compiled]
// Destructor prints: [Shader Destroyed]
// int getReferenceCount() — returns use_count() via a shared_ptr passed as parameter (
   
string name;
string type;
public:


shader(string s,string g){
    name=s;
    type=g;
    cout<<"shader compiled..."<<endl;

}
~shader(){
    cout<<"shader destroyed..."<<endl;

}

};
int getrefrencecount(const shared_ptr<shader>& ptr){
    return ptr.use_count();

}
int main(){

    auto share1=make_shared<shader>("main_vert" , "vertex");

    cout<<"refrence count : "<<getrefrencecount(share1)<<endl;
    {
        auto share2=share1;
    cout<<"refrence count : "<<getrefrencecount(share1)<<endl;
        auto share3=share1;
    cout<<"refrence count : "<<getrefrencecount(share1)<<endl;
    }

    cout<<"refrence count : "<<getrefrencecount(share1)<<endl;




    return 0;
}