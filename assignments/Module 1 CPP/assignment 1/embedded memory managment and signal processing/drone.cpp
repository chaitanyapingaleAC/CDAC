#include <iostream>
#include <cmath>
using namespace std;

inline double distanceBetween(double x1, double y1, double x2, double y2){
// d=sqrt(x2-x1)2+(y2-y1)2
double diffx=x2-x1;
double diffy=y2-y1;
double sqrx=diffx*diffx;
double sqry=diffy*diffy;
double d=sqrx+sqry;
double distance=sqrt(d);
return distance;


}
inline double toRadians(double degrees){

  return degrees*(M_PI /180.0);
}

inline double clamp(double value, double minVal, double maxVal){

    if(value<minVal){
        return minVal;
    }
    else if(value>maxVal){
        return maxVal;
    }
    else{
        return value;
    }
    

}
inline bool isInSafeZone(double x, double y, double cx, double cy, double radius){

    double dis= distanceBetween(x, y, cx, cy);
    if(dis<=radius){
        return true;

    }
    else {return false;}

}


int main(){
    double x=0;
    double y=0;
    double radius=50;
    double x1=10,y1=40;
    double x2=30,y2=10;
    double x3=60,y3=0;

    cout<<"for waypoint 1 :(10,40) : "<<endl;
    double dd=distanceBetween(x,y,x1,y1);
    cout<<"distance is : "<<dd;
    if(  isInSafeZone(x,y,x1,y1,radius)){
        cout<<" safe"<<endl;
    }else{
        cout<<"not safe"<<endl;
    }
cout<<"-----------------"<<endl;
     cout<<"for waypoint 2 :(30,10) : "<<endl;
    double dd1=distanceBetween(x,y,x2,y2);
    cout<<"distance is : "<<dd1;
    if( isInSafeZone(x,y,x2,y2,radius)){
        cout<<" safe"<<endl;
    }else{
        cout<<"not safe"<<endl;
    }
cout<<"---------------------"<<endl;

     cout<<"for waypoint 3 :(60,0) : "<<endl;
    double dd2=distanceBetween(x,y,x3,y3);
    cout<<"distance is : "<<dd2;
    if( isInSafeZone(x,y,x3,y3,radius)){
        cout<<" safe"<<endl;
    }else{
        cout<<" not safe"<<endl;
    }

    cout<<"90 to radian:"<<endl;
    int r=toRadians(90);
    cout<<r<<endl;

    cout<<"clamp valueof 10 ...."<<endl;
    int v=clamp(10,50,100);
    cout<<v<<endl;
   





    


    return 0;
}