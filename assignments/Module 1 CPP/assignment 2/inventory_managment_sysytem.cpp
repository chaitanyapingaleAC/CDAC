#include<iostream>
#include<String>
#include<iomanip>
using namespace std;
class product{

    int product_id;
    int quantity;
    string name;
    double price;

    public:


    void acceptDetails() // Read all fields from user
    {
        cout<<"enter id"<<endl;
        cin>>product_id;
        cout<<endl;
        cout<<"enter name"<<endl;
        cin>>name;
        cout<<"enter price : "<<endl;
        cin>>price;
        cout<<"enter quantity"<<endl;
        cin>>quantity;



    }
void displayDetails() const // Print formatted product info
{
    cout << left << setw(8) << product_id
             << setw(15) << name
             << right << setw(10) << fixed << setprecision(2) << price
             << setw(8) << quantity
             << setw(15) << totalValue()<<endl;



}
double totalValue() const// price * quantity
{
    return price*quantity;

}
bool isLowStock(int threshold) const // true if quantity < threshold
{
if(quantity<threshold){
    return true;
}
return false;


}
string getName()const{
    return name;
}








};



double reorderCost(int qty, double unitPrice) // integer quantity
{
    return qty*unitPrice;


}
double reorderCost(double qty, double unitPrice)// fractional (by weight)
{
  return qty*unitPrice;
 }
double reorderCost(int qty, double unitPrice, double taxRate){
  double t=qty*unitPrice;
  double tax=t*taxRate/100;
  return t+tax;


}

double applyDiscount(double price, double discountPercent = 10.0){

    return price-(price*(discountPercent/100));

    
}


int main(){
   cout<< "emter the names of product"<<endl;
   product products[5];
   for(int i=0;i<5;i++){
    cout<<"product : "<<i+1<<endl;
    products[i].acceptDetails();
   }
 cout << left
         << setw(8) << "ID"
         << setw(15) << "Name"
         << right << setw(10) << "Price"
         << setw(8) << "Qty"
         << setw(15) << "Total Value"
         << endl;


   

         for(int i=0;i<5;i++){
            products[i].displayDetails();
         }
         int hv=0;
         for(int i=1;i<5;i++){

            if(products[i].totalValue()>products[hv].totalValue()){
                hv=i;
            }
         }
         cout<<"highest value product : "<<products[hv].getName()<<"  (Rs "<<products[hv].totalValue()<<")"<<endl;



         cout<<"enter threshold value"<<endl;
         int threshold;
         cin>>threshold;

         for(int i=0;i<5;i++){
            bool t=products[i].isLowStock(threshold);
            if(t){
                cout<<" low stock (threshold "<<threshold<<")  :  "<<products[i].getName()<<endl;
            }

         }
         cout<<endl;

         cout<<"-------------function overloading------------"<<endl;

cout <<"first function : "<< reorderCost(10, 5) << endl;
cout <<"second function : "<< reorderCost(10, 50.5) << endl;
cout <<"third function : " <<reorderCost(10, 50, 18) << endl;
cout << "discount  : "<<applyDiscount(10,20) << endl;





    return 0;
};