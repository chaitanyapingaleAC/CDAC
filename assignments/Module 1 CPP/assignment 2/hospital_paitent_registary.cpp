#include<iostream>
#include<String>
#include<iomanip>
using namespace std;
class paitent{

    int patientId;
string name;
int age;
string ward;
const string bloodGroup;

public:


paitent() : patientId(0), name("Unknown"), age(0),
            ward("General"), bloodGroup("O+")
{
cout<<"default paitent registerd..."<<endl;
}

// Constructor 2 — Emergency admission: only id and name known
paitent(int id, const string& name):patientId(id), name(name), age(0),
            ward("General"), bloodGroup("O+"){
cout<<"emergency "<<name<<endl;
}
// Constructor 3 — Full admission details
paitent(int id, const string& name, int age, const string& ward, const string&
bg):patientId(id), name(name), age(age),
            ward(ward), bloodGroup(bg){
                cout<<"full addmission "<<name<<endl;

}
// Destructor — print "Patient <name> discharged." when object is destroyed
~paitent(){
    cout<<"paitent "<<name<<" got discharge.."<<endl;

}
void displayRecord() const{
    cout<<"ID : "<<patientId<<endl;
    cout<<"name : "<<name<<endl;
    cout<<"age : "<<age<<endl;
    cout<<"ward : "<<ward<<endl;
    cout<<"bloodgroup : "<<bloodGroup<<endl;



}
void transferWard(const string& newWard){

    cout<<"ward transfer "<<name<<" -> "<<newWard<<endl;


}




};
int main(){
paitent p;
paitent p1(101,"raj");
paitent p3(103,"meera",41,"cardiology","AB+");

paitent *paitents=new paitent[4];
cout<<"------constructor paitent-------------"<<endl;
p3.displayRecord();
cout<<"---------------default-----------"<<endl;
for(int i=0;i<4;i++){
    paitents[i].displayRecord();
}
cout<<"================"<<endl;

paitents[0].transferWard("icu");


delete[] paitents;


    return 0;
};