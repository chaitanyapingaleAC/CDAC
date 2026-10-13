#include <iostream>

using namespace std;
bool parsepacket(const int* rawdata,int size,const int** outmin,const int** outmax){

    if(size<=0){
        return false;
    }
    *outmin=rawdata;
    *outmax=rawdata;
    for(int i=0;i<size;i++){
        if(*rawdata<=**outmin){
            *outmin=rawdata;
           
        }
         if(*rawdata>=**outmax){
            *outmax=rawdata;
           
        }
         rawdata++;
    }
    return true;

}
int main(){

    int packet[]={45,12,67,8,55,31};
     const int *maxptr=nullptr;
     const int *minptr=nullptr;

    if(parsepacket(packet,6,&minptr,&maxptr)){
      

        cout<<"Calibration min : "<<*minptr;
        cout<<"calibration max : "<<*maxptr;
    }
    return 0;
}