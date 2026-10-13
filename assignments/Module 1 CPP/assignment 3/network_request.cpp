#include <iostream>
#include <String>
#include  <vector>
using namespace std;
 using header=pair<string,string>;
    using headerlist=vector<header>;

    using port=unsigned int;
    using ipaddress = string;
    typedef unsigned long long requestId;

    

enum class httpstatus{OK = 200,
 Created = 201,
 BadRequest = 400,
 Unauthorized = 401,
 NotFound = 404,
 ServerError = 500};

 void handleResponse(httpstatus status, const string& endpoint){

    switch(static_cast<int>(status)){

        case 200:
        cout<<endpoint<<"    ->     OK=200     : Request successful"<<endl; 
        break;

        case 201:
        cout<<endpoint<<"    ->     Created=201     : Created  successful"<<endl;
        break;

        case 400:
        cout<<endpoint<<"    ->     Badrequest=400     : bad request"<<endl;
        break;

        case 401:
        cout<<endpoint<<"    ->     Unauthorized=401     : Authentication Required"<<endl;
        break;

        case 404:
        cout<<endpoint<<"    ->     NotFound=404     : Endpoint dose not exits"<<endl;
        break;

        case 500:
        cout<<endpoint<<"    ->     ServerError=500     : Internal server error - retry Later"<<endl;
        break;

        default:
        cout<<"Status coude not Exits.."<<endl;
    }

 }


 void printheader(const headerlist& headers){

    for(const header& h : headers) {
        cout << h.first << " : " << h.second << endl;
    }
}






 int main(){


    handleResponse(httpstatus::OK ,"[GET /api/users]");
    handleResponse(httpstatus:: Unauthorized,"[POST /api/login]");
    handleResponse(httpstatus:: NotFound ,"[GET /api/products/99]");
    handleResponse(httpstatus:: ServerError ,"[POST /api/order]");



    // header h={"content type : ","Aplication/JSON"};
    // cout<<h.first;
    // cout<<h.second<<endl;

    port port=8010;
    ipaddress ip="192.005.555";
    requestId request=1748293847;

    cout<<"port : "<<port<<endl;
    cout<<"ip address : "<<ip<<endl;
    cout<<"request id : "<<request<<endl;

    // headerlist headers;

    headerlist headers={
                     {"Content-Type", "application/json"},
                     {"Authorization", "Bearer xyz"},
                      {"Accept-Language", "en-US"}
    };
cout<<"headers : "<<endl;
    printheader(headers);
    



    return 0;
 }
 