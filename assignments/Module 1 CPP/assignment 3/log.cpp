#include<iostream>
#include<cstring>
#include<memory>
using namespace std;

class logbuffer{
    char *buffer;
    int size;
    int capacity;


public:

    static int instancecount;

    logbuffer(int capacity){
        buffer=new char[capacity];
        size=0;
        this->capacity=capacity;
        buffer [0]='\0';
        instancecount++;
        cout<<"[logbuffer created ]"<<"  capacity: "<<capacity<<endl;


    }

    logbuffer(const logbuffer& other){
        capacity=other.capacity;
        size=other.size;
        buffer=new char[capacity];
        instancecount++;
        memcpy(buffer,other.buffer,size+1);
        cout<<"[LogBuffer Deep Copied] capacity= "<<capacity<<endl;
    }

    logbuffer& operator=(const logbuffer& other){

        if(this==&other){
            cout<<"[Self-assignment detected no operation]" << endl;
            return *this;

        }

        delete[]buffer;
        capacity=other.capacity;
        size=other.size;
        buffer=new char[capacity];
        instancecount++;
        memcpy(buffer,other.buffer,size+1);
        cout<<"[LogBuffer Assigned]" << endl;
        return *this;


    }

    ~logbuffer(){
        delete[] buffer;
        instancecount--;
        cout<<"[LogBuffer Destroyed]"<<endl;
    }

    void append(const char* msg){

        int msglen=strlen(msg);
        int avilable=capacity-size-1;
    
        if(avilable<=0){
            return;
        }
        int copylen;

        if(msglen<avilable){

            copylen=msglen;
        }
        else{
            copylen=avilable;
        }
    

        memcpy(buffer+size,msg,copylen);
        size=size+copylen;
        buffer[size]='\0';


    } 
    void print() const{

        cout<<buffer<<endl;
    }
    void clear(){
         size = 0;
        buffer[0] = '\0';

    }
    static int getInstanceCount(){
        return instancecount;


    }





};
int logbuffer::instancecount=0;
int main(){

     logbuffer log1(256);
     log1.append("Server started on port 8080");
     log1.append(" | Request received from 192.168.1.10");
      cout<<"log1 : "<<endl;
     log1.print();

     logbuffer log2=log1;
     
     log2.append(" Cached response sent");
     cout<<"log1 : "<<endl;
     log1.print();
     cout<<"log2 : "<<endl;
     log2.print();

     logbuffer log3(128);
     cout<<"log3"<<endl;
          log3=log1;
          log3.print();


          log1=log1;
          log1.print();

          cout<<"live logbuffer count : "<<logbuffer::instancecount<<endl;




    return 0;
}