#include<iostream>
#include <String>
using namespace std;
class sensor{
    public:

    int status(double reading){

        if(reading<0){
             cout<<"Status : SENSOR_ERROR"<<endl;
            return -1;
        }
           
        
        else if(reading>0 && reading<30){
              cout<<"Status   : NORMAL"<<endl;
            return 0;
        }
        else if(reading>30 && reading<45){
              cout<<"Status   : WARNING"<<endl;
            return 1;
        }
        else if(reading>45 && reading<60){
              cout<<"Status   : CRITICAL"<<endl;
            return 2;
        }
        else if(reading>60 && reading<=100){
              cout<<"Status   : SHUTDOWN"<<endl;
            return 3;
        }
        

    }
    void action(int code){
        switch(code){
            case -1:
            cout<<"Action   :Sensor fault-Check Wiring"<<endl;
            break;
            case 0:
            cout<<"Action   :no action required"<<endl;
            break;
            case 1:
            cout<<"Action   :alert send to supervisor"<<endl;
            break;
            case 2:
            cout<<"Action   :cooling system trigggerd"<<endl;
            break;
            case 3:
            cout<<"Action   :Emergency shutdown initiated"<<endl;
            break;


        }
    }




};
int main(){

    cout<<"enter the tempreture of machine"<<endl;
    double reading;
    cin>>reading;
    cout<<"tempreture: "<<reading<<"C   "<<(reading*9/5)+32<<" F"<<endl;
    sensor s1;
   int code= s1.status(reading);
   s1.action(code);
   
   string s= (reading>25)? "Above Average" : "below average";
   cout<<"Reading  :"<<s<<endl;

   



    return 0;
}