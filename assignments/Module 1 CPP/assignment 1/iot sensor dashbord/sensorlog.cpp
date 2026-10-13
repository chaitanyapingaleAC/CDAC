#include <iostream>
#include <String>
using namespace std;
class sensor{
public:
    void valid(double arr[],int r){
        double arr1[r];
        int skipped=0;
        int j=0;

        for(int i=0;i<r;i++){
            if(arr[i]>0){
                arr1 [j] =arr[i];
                j++;
            }else{
                skipped++;
            }

        }
        cout<<"valid readings : ";
        for(int i=0;i<j;i++){
            cout<<arr1[i];
            cout<<"  ";

        }
        cout<<endl;
        cout<<"Skipped (errors) : "<<skipped<<endl;

        cout<<"FIRST CRITICAL   :";
        for(int i=0;i<j;i++){
            if(arr1[i]>45){
                cout<<"Index "<<i+1<<"   -> "<<arr1[i]<<"C"<<endl;
                break;
            }
        }
        int max=0;
        int min=arr1[0];
        double sum=0;
        for(int i=0;i<j;i++){
            if(arr1[i]>max){
                max=arr[i];
            }
            else if(arr1[i]<min){
                min=arr1[i];
            }
            sum+=arr1[i];

        }
        // int min=max;
        // for(int i=0;i<j;i++){
        //     if(arr1[i]<min){
        //         min=arr[i];
        //     }
        // }
        // int sum=0;
        // for(int i=0;i<j;i++){
        //     sum=sum+arr[i];
        // }
        double average=sum/j;
        cout<<"Min : "<<min<<"C "<<"     Max : "<<max<<"C "<<"     Avg : "<<average<<"C "<<endl;

        int normal=0;
        int critical=0;
        int warning=0; 
        int shutdown=0;
        for(int i=0;i<j;i++){
            if(arr1[i]<30){
                normal++;

            }
            else if(arr1[i]<45){
                warning++;
            }
            else if(arr1[i]<60){
                critical++;
            }
            else if(arr1[i]>60){
                shutdown++;
            }
        }
        cout<<"Normal : "<<normal<<"   Warning : "<<warning<<"   Critical : "<<critical<<"   Shutdown : "<<shutdown<<endl;



    }

};
int main(){
    cout<<"enter the number of readings"<<endl;
    int r;
    cin>>r;
    cout<<endl;
    double arr[r];
    for(int i=0;i<r;i++){
        cin>>arr[i];

    }
    sensor s;
    cout<<"---------------"<<endl;
    s.valid(arr,r);


    return 0;
}