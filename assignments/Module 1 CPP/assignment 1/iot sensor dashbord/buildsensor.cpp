#include <iostream>
#include <String>
using namespace std;
class sensor{
public:
    void hot(double arr[3][3]){
        
    double hotroom=0;
    int floor=0;
    int room=0;

    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(arr[i][j]>hotroom){
                hotroom=arr[i][j];
                floor=i+1;
                room=j+1;
            }
        }
    }
    cout<<"Hottest room : "<<" floor "<<floor<<",  room "<<room<<"  ->  "<<hotroom<<"C"<<endl;
      double sum1=0;
      double sum2=0;
      double sum3=0;

      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(i==0){
              sum1 +=arr[i][j];
            }
            else if(i==1){
                sum2 +=arr[i][j];
            }
            else if(i==2){
                sum3 += arr[i][j];
            }
                
        }
     }
     double a1=sum1/3;
     double a2=sum2/3;
     double a3=sum3/3;
     
     if(a1>a2){
        if(a1>a3){
            cout<<"hottest floor :  floor 1  (avg "<<a1<<"C)";
        }else{
            cout<<"hottest floor :  floor 3  (avg "<<a3<<"C)";
        }
     }
     else{
        if(a2>a3){
            cout<<"hottest floor :  floor 2  (avg "<<a2<<"C)";
        }
        else{
            cout<<"hottest floor :  floor 3  (avg "<<a3<<"C)";
        }
     }
    }

    void warn(double arr[3][3]){
        
     int warning=0;
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(arr[i][j]>=30){
                warning ++;
            }
        }
     }
     cout<<endl;
     cout<<"room at WARNING or above : "<<warning;

    }

};
int main(){
    double arr[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            cin>>arr[i][j];
        }
    }

     cout<<"          room 1"<<" room 2"<<" room 3"<<endl;
    for(int i=0;i<3;i++){
        cout<<"floor "<<i+1<<" : ";
        for(int j=0;j<3;j++){
            cout<<arr[i][j]<<"      ";
        }cout<<endl;
    }
     sensor s;
     s.hot(arr);
     s.warn(arr);


   

    return 0;
}