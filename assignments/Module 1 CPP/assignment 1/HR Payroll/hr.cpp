#include<iostream>
#include<iomanip>
#include<String>
using namespace std;
class employee{
    int empid;
    string name;
    char grade;
    double basicsalary;
    bool isactive=true;
    static int employeecount;
    string department;

    public:

    employee(){
    empid=1001+employeecount;
    employeecount++;
     
    }

    //setters
    bool setName(const string& n){
        if(n!=""){
            name=n;
            return true;
        }
        else{
            cout<<"-----Error-----name cannot be  empty "<<endl;
            return false;
        }

    }
bool setDepartment(const string& dept){

    if(dept=="engineering" || dept=="hr" ||dept=="finance" ||dept=="operation"){
        department=dept;
        return true;
    }else{
        cout<<"----error----enter valid department"<<endl;
        return false;
    }

}
bool setGrade(char g){
    if(g=='A' || g=='B' ||g=='C' || g=='D'){
        grade=g;
        return true;
    }else{
        cout<<"----error----grade must be A,B,C,D"<<endl;
        return false;
    }

}
bool setBasicSalary(double salary){

    if(salary>10000 && salary<500000){
        basicsalary=salary;
        return true;
    }
    else{
        cout<<"----error----salary is between in 10000 to 500000"<<endl;
        return false;
    }

}
bool deactivate(){

     isactive=false;
     return isactive;

}


//geeters
int getEmpId() const{
    return empid;

}
string getName() const{
    return name;

}
string getDepartment() const{

    return department;
}
char getGrade() const{
return grade;
}
double getBasicSalary() const{
    return basicsalary;

}
bool getIsActive() const{
    return isactive;

}


//functions




    void acceptdetail(){
string n;
 string dept;
        char g;
        double salary;
       do{
         cout<<"enter the name "<<endl;
        
        getline(cin>>ws,n);
       }while(!setName(n));
       
       do{
         cout<<"enter the department "<<endl;
        cin>>dept;
       }while(!setDepartment(dept));

        do{
            cout<<"enter the grade"<<endl;
        cin>>g;
        }while(!setGrade(g));
       do{
         cout<<"enter salary "<<endl;
        cin>>salary;
        }while(!setBasicSalary(salary));
        
        
        

    }
    double computeAllowances() const{

        // Grade A → 40% of basicSalary (Senior / Manager)
       // Grade B → 30% of basicSalary (Mid-level)
// Grade C → 20% of basicSalary (Junior)
// Grade D → 10% of basicSalary (Trainee)
       double allowance;
       if(grade=='A'){
        allowance=0.4*basicsalary;

       }
       else if(grade=='B'){
        allowance=0.3*basicsalary;

       }
       else if(grade=='C'){
        allowance=0.2*basicsalary;


       }
       else if(grade=='D'){
        allowance=0.1*basicsalary;

       }
       return allowance;

    }

    double grosssalary() const{
        double allo=computeAllowances();
        double gross=allo+basicsalary;
      return gross;
    }

    double computetax() const{
        double tax;
        int gross=grosssalary();
        if(gross<=5000){
           
        }
        else if(gross>50000 && gross<100000){
            tax=0.1*((gross-50000)-5000);
           
        }
        else if(gross>100000){
            tax=0.2*(gross-100000);
          
        }
      return tax;
    }

    double netsalary() const{
        double gross=grosssalary();
        double tax=computetax();
        double net=gross-tax;
        return net;

    }
    static int employeeccount() {
        return employeecount;
    }


    void printpayslip(){
        cout<<"====================================================="<<endl;
        cout<<"        Employee Payslip - AUG 2026"<<endl;
        cout<<"====================================================="<<endl;

        cout<<"Emp id : "<<getEmpId()<<endl;
        cout<<"Name "<<getName()<<endl;
       
        cout<<"department : "<<getDepartment()<<endl;
        cout<<"Status: "<<(getIsActive()?"active":"not avtive")<<endl;
        double allallow= computeAllowances();
        double gross=grosssalary();
         double tax=computetax();
         double net=netsalary();
         cout<<"-----------------------------------------------------"<<endl;
         cout<<"Basic Salary :"<<basicsalary;
         cout<<endl;
         cout<<"Allowances :"<<allallow;
         cout<<endl;
         cout<<"Gross Salary :"<<gross<<endl;
                  cout<<"-----------------------------------------------------"<<endl;
        cout<<"Tax deduction :"<<tax;
        cout<<endl;
        cout<<"Net Salary :"<<net;
        cout<<endl;
                cout<<"====================================================="<<endl;







    }
    

};
int employee::employeecount = 0;
int main(){

    employee e1;
    e1.acceptdetail();
    e1.printpayslip();
    




    employee* e2=new employee;
    e2->acceptdetail();
    e2->printpayslip();

    employee* e3=new employee;
    e3->acceptdetail();
    e3->printpayslip();
     


  e3->deactivate();
 if (!e3->getIsActive())
 cout << e3->getName() << " is no longer active. Payroll skipped." << endl;
 cout << "Total Employees : " << employee::employeeccount() << endl;
 delete e2;
 delete e3;
    return 0;
}
