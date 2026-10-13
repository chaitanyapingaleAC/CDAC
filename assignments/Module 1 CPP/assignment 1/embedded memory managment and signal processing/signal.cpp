#include <iostream>
#include <String>
#include <cmath>
using namespace std;
class sig{
    public:

    double computeRMS(double* signal, int n){
       double sum=0;
        for(int i=0;i<n;i++){

            double sqr=(*signal)*(*signal);
            sum +=sqr;

            *(signal++);
        }
        double ms=sum/n;
        double rms=sqrt(ms);
        return rms;

    }
     
    void normalise(double* signal, int n){
        double * start=signal;
       double max=0;
        for(int i=0;i<n;i++){
         
            if(abs(*signal)>max){
                max=abs(*signal);
                
            }
            *(signal++);
        }
         cout<<endl;
         signal=start;
        for(int  i=0;i<n;i++){
            *signal=*signal/max;
            cout<<abs(*signal)<<" ";
            *(signal++);
        }

    }
   
    int countZeroCrossings(double* signal, int n){

        int count=0;
        for(int i=0;i<n;i++){
            if(* signal>0 && *(signal+1)<0 || *signal<0 && *(signal+1)>0){
                count++;
            }
            signal++;
        }
          cout<<endl<<"zero crossings are : "<<count;
          return 0;
    }

    void applyGain(double* signal, int n, double gainFactor){
        cout<<endl;
        for(int i=0;i<n;i++){
            *signal=(*signal)*(gainFactor);
            cout<<abs(*signal)<<" ";
            signal++;
        }
        
    }

};
int main(){
    int n=7;
    double signal[7];
    for(int i=0;i<n;i++){
        cin>>signal[i];

    }
   

    double gainfactor;
    cout<<"enter gain factor"<<endl;
    cin>>gainfactor;
   
    cout<<endl;
    sig obj;
    cout<<"RMS is : "<<obj.computeRMS(signal,n);
      cout<<endl<<"array before normalize:"<<" ";
    for(int i=0;i<n;i++){
        cout<<signal[i]<<" ";
    }
    cout<<endl<<"array after normalize  ";
    obj.normalise(signal,n);
    obj.countZeroCrossings(signal,n);
      cout<<endl<<"array before apply gain:"<<" ";
    for(int i=0;i<n;i++){
        cout<<signal[i]<<" ";
    }
    cout<<endl<<"array after aplying gain : ";

    obj.applyGain(signal,n,gainfactor);




    return 0;
}