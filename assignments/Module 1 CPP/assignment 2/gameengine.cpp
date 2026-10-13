#include<iostream>
#include<String>
#include<iomanip>
using namespace std;
class Entity
{
private:
    string name;
    int health;
    int level;
    string type;

public:
    Entity& setName(const string& name){
        this->name=name;
        return *this;

    }
    Entity& setHealth(int health){
        this->health=health;
        return *this;


    }
    Entity& setLevel(int level){

        this->level=level;
        return *this;

    }
    Entity& setType(const string& type){
        this->type=type;
        return *this;

    }

    string getName() const{
        return name;

    }
    int getHealth() const{
        return health;

    }
    int getLevel() const{
        return level;

    }
    string getType() const{
        return type;

    }

    void displayInfo() const{
        cout<<"name : "<<name<<endl;
        cout<<"health : "<<health<<endl;
        cout<<"level : "<<level<<endl;
        cout<<"type : "<<type<<endl;

    }



   
};

 namespace Physics{

        double clamp(double val, double min, double max){
            if(val<min){
                return min;
            }
            if(val>max){
                return max;
            }
            return val;
        }
        double lerp(double a, double b, double t){
          return a+(b-a)*t;

        }
    }
    namespace GameMath{
       int clamp(int val, int min, int max){
        if(val<min){
            return min;
        }
        if(val>max){
            return max;

        }
        return val;
       }
       double lerp(double a, double b, double t){

        return a+(b-a)*t;


       }
    }


int main(){
    cout<<"------------part A--------------"<<endl;

    Entity player,enemy,item;
    player.setName("chaitanya").setHealth(100).setLevel(10).setType("player");

    enemy.setName("sarthak").setHealth(60).setLevel(5).setType("enemy");

    item.setName("healthposition").setHealth(0).setLevel(0).setType("item");

    player.displayInfo();
    enemy.displayInfo();
    item.displayInfo();

cout<<"------------part B--------------"<<endl;


    cout<<"namespace functions...."<<endl;
    cout<<Physics::clamp(20,50,100)<<endl;
    cout<<Physics::lerp(2,5,0.5)<<endl;


    cout<<GameMath::clamp(20,50,60)<<endl;
    cout<<GameMath::lerp(2,8,0.5)<<endl;

    cout<<"demonstrate using namespace in a limited block scope"<<endl;

    {
    using namespace Physics;

    cout << clamp(20, 50, 100) << endl;
    cout << lerp(2, 5, 0.5) << endl;
}
{
    using namespace GameMath;

    cout<<clamp(20,50,60)<<endl;
    cout<<lerp(20,8,0.5)<<endl;
}

cout<<"------------part c--------------"<<endl;
cout<<"----------game engine-----------"<<endl;

int r;
int c;
cout<<"enter row : "<<endl;
cin>>r;
cout<<"enter coloumn : "<<endl;
cin>>c;

int** map=new int*[r];

for(int i=0;i<r;i++){
    map[i]=new int[c];
}

for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        map[i][j]=rand()%5;

    }
}
cout<<"===== GAME MAP ("<<r<< "x"<< c<<")"<<"====="<<endl;

for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        cout<<map[i][j]<<" ";

    }
    cout<<endl;
}
cout<<"Legend: 0=Grass 1=Water 2=Mountain 3=Forest 4=Dungeon"<<endl;
int grass = 0;
int water = 0;
int mountain = 0;
int forest = 0;
int dungeon = 0;
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        if(map[i][j]==0){
          grass++;
        }
        else if(map[i][j]==1){
           water++;
        }
        else if(map[i][j]==2){
            mountain++;
        }
        else if(map[i][j]==3){
            forest++;
        }
        else if(map[i][j]==4){
            dungeon++;
        }
    }
}

cout<<"grass : "<<grass<<endl;
cout<<"water : "<<water<<endl;
cout<<"mountain : "<<mountain<<endl;
cout<<"forest : "<<forest<<endl;
cout<<"dungeon : "<<dungeon<<endl; 






    return 0;
}