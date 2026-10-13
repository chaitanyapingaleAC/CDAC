#include<iostream>
#include <String>
#include<memory>

using namespace std;

class texture{

    string name;
     int width;
      int height;
      public:

      texture(string n,int w,int h){
            name=n;
            width=w;
            height=h;

        
        cout<<"texture loaded"<<endl;
      }

      ~texture(){
        cout<<"texture released..."<<endl;
      }


      void display() const{
        cout<<"texture : "<<name<<endl;
        cout<<"dimensions : "<<width<<" x "<<height<<endl;

      }





};




int main(){
  
    auto tex1=make_unique<texture>("player_sprite",512,512);
    tex1->display();

    // unique_ptr<texture> tex2=tex1;            errror because unique pointer dose not share his ownership to other owner
                                               // if we want to share owner we use move to move owner;


    unique_ptr<texture> tex2=move(tex1);
    
    cout<<"tex1 is null? : "<<(tex1==nullptr? "yes" : "no");
    cout<<endl;

    return 0;
}