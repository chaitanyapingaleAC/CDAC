#include <iostream>
#include <String>
using namespace std;
class sensor{

};
int main(int argc,char*argv[]){
      if(argc!=4){
        cout<<"Usage : <warn_threshold> <critical _threshold> <num_reading>"<<endl;
        cout<<"Error : Missing Argument"<<endl;
    }
    double warn=stod(argv[1]);
    double critical=stod(argv[2]);
    double reading=stod(argv[3]);


    
  
    if(warn>critical ){
        cout<<"Error : warning are wrong..";
    
    }else if(reading<1 ||reading>100){
      cout<<"Error : reading  are wrong..";

    }else{
        cout<<"config : "<<" warn="<<warn<<"C "<<" critical="<<critical<<"C  "<<"Readings ="<<reading<<endl;

    }

    int normal=0;
    int criticall=0;
    int warning=0; 
    int shutdown=0;

    for(int i=1;i<=reading;i++){
        int temp=rand()%70;
        if(temp<30){
            normal++;
        }
        else if(temp<45){
            warning++;

        }
        else if(temp<60){
            criticall++;
        }
        else if(temp>60){
            shutdown++;
        }

    }

    cout<<"Results :   Normal : "<<normal<<"  Warning : "<<warning<<"  Critical : "<<criticall<<"  Shutdown : "<<shutdown<<endl;
    
    
    return 0;
}