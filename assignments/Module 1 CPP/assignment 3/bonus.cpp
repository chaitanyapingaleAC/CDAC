#include<iostream>
#include<String>
using namespace std;

class log{
    mutable int accesscount=0;
   public:


       void print()const{
        cout<<"log printed..."<<endl;
        accesscount++;

      }
       int access()const{
        return accesscount;
      }

};
int main(){
   const log l;
    
    l.print();
    l.print();
    l.print();
    cout<<"total access count : "<<l.access()<<endl;

    
    
    return 0;
}