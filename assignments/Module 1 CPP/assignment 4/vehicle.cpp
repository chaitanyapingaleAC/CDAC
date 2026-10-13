#include <iostream>
#include <string>
#include <vector>
#include <iomanip>

using namespace std;



class Vehicle
{
protected:
    string registrationNo;
    string ownerName;
    int yearOfManufacture;
    double kmDriven;

public:

    Vehicle(const string& reg,
            const string& owner,
            int year,
            double km)
    {
        registrationNo = reg;
        ownerName = owner;
        yearOfManufacture = year;
        kmDriven = km;

        cout << "[Vehicle Constructor] "
             << registrationNo << " : "
             << ownerName << endl;
    }

    virtual double fuelCost(double kmToTravel) const = 0;

    virtual void describe() const
    {
        cout << "Registration : " << registrationNo << endl;
        cout << "Owner        : " << ownerName << endl;
        cout << "Year         : " << yearOfManufacture << endl;
        cout << "Km Driven    : " << kmDriven << endl;
    }

    virtual string vehicleType() const = 0;

    virtual ~Vehicle()
    {
        cout << "[Vehicle Destructor] "
             << registrationNo << endl;
    }

    double getKmDriven() const
    {
        return kmDriven;
    }

    string getRegNo() const
    {
        return registrationNo;
    }
};



class Car : public Vehicle
{
private:
    string fuelType;
    double mileageKmpl;

public:

    Car(const string& reg,
        const string& owner,
        int year,
        double km,
        const string& fuel,
        double mileage)
        : Vehicle(reg, owner, year, km)
    {
        fuelType = fuel;
        mileageKmpl = mileage;

        cout << "[Car Constructor] "
             << registrationNo << endl;
    }

    double fuelCost(double kmToTravel) const override
    {
        double price;

        if (fuelType == "Petrol")
            price = 106.00;
        else
            price = 93.00;

        double fuelNeeded = kmToTravel / mileageKmpl;

        return fuelNeeded * price;
    }

    string vehicleType() const override
    {
        return "Car";
    }

    void describe() const override
    {
        Vehicle::describe();

        cout << "Fuel Type    : " << fuelType << endl;
        cout << "Mileage      : " << mileageKmpl << " km/l" << endl;
    }

    ~Car()
    {
        cout << "[Car Destructor] "
             << registrationNo << endl;
    }
};



class Truck : public Vehicle
{
protected:
    double payloadCapacityTons;
    double fuelEfficiencyKmpl;

public:

    Truck(const string& reg,
          const string& owner,
          int year,
          double km,
          double payload,
          double efficiency)
        : Vehicle(reg, owner, year, km)
    {
        payloadCapacityTons = payload;
        fuelEfficiencyKmpl = efficiency;

        cout << "[Truck Constructor] "
             << registrationNo << endl;
    }

    virtual double fuelCost(double kmToTravel) const override
    {
        double efficiency = fuelEfficiencyKmpl;

        efficiency = efficiency *
                     (1 - (0.05 * payloadCapacityTons));

        double fuelNeeded = kmToTravel / efficiency;

        return fuelNeeded * 93.00;
    }

    string vehicleType() const override
    {
        return "Truck";
    }

    void describe() const override
    {
        Vehicle::describe();

        cout << "Payload      : "
             << payloadCapacityTons << " tons" << endl;

        cout << "Efficiency   : "
             << fuelEfficiencyKmpl << " km/l" << endl;
    }

    ~Truck()
    {
        cout << "[Truck Destructor] "
             << registrationNo << endl;
    }
};



class ElectricTruck : public Truck
{
private:
    double batteryCapacityKWh;
    double rangePerChargeKm;

public:

    ElectricTruck(const string& reg,
                   const string& owner,
                   int year,
                   double km,
                   double payload,
                   double efficiency,
                   double battery,
                   double range)
        : Truck(reg, owner, year, km, payload, efficiency)
    {
        batteryCapacityKWh = battery;
        rangePerChargeKm = range;

        cout << "[ElectricTruck Constructor] "
             << registrationNo << endl;
    }

    double fuelCost(double kmToTravel) const override
    {
        double unitsUsed =
            (kmToTravel / rangePerChargeKm)
            * batteryCapacityKWh;

        return unitsUsed * 9.50;
    }

    string vehicleType() const override
    {
        return "Electric Truck";
    }

    void describe() const override
    {
        Truck::describe();

        cout << "Battery       : "
             << batteryCapacityKWh << " kWh" << endl;

        cout << "Range         : "
             << rangePerChargeKm << " km" << endl;
    }

    double getBattery() const
    {
        return batteryCapacityKWh;
    }

    ~ElectricTruck()
    {
        cout << "[ElectricTruck Destructor] "
             << registrationNo << endl;
    }
};



class Van : public Vehicle
{
private:
    int seatingCapacity;
    double mileageKmpl;

public:

    Van(const string& reg,
        const string& owner,
        int year,
        double km,
        int seats,
        double mileage)
        : Vehicle(reg, owner, year, km)
    {
        seatingCapacity = seats;
        mileageKmpl = mileage;

        cout << "[Van Constructor] "
             << registrationNo << endl;
    }

    double fuelCost(double kmToTravel) const override
    {
        double fuelNeeded =
            kmToTravel / mileageKmpl;

        return fuelNeeded * 106.00;
    }

    string vehicleType() const override
    {
        return "Van";
    }

    void describe() const override
    {
        Vehicle::describe();

        cout << "Seats        : "
             << seatingCapacity << endl;

        cout << "Mileage      : "
             << mileageKmpl << " km/l" << endl;
    }

    ~Van()
    {
        cout << "[Van Destructor] "
             << registrationNo << endl;
    }
};



void printFleetReport(
    const vector<Vehicle*>& fleet,
    double tripKm)
{
    cout << endl;
    cout << "===== FLEET REPORT =====" << endl;
    cout << "Trip Distance: "
         << tripKm << " km" << endl;

    cout << endl;

    cout << left
         << setw(15) << "Reg"
         << setw(20) << "Type"
         << setw(20) << "Owner"
         << setw(12) << "Km Driven"
         << endl;

    cout << "--------------------------------------------------------"
         << endl;

    for (Vehicle* v : fleet)
    {
        cout << left
             << setw(15) << v->getRegNo()
             << setw(20) << v->vehicleType()
             << setw(20) << "Owner"
             << setw(12) << v->getKmDriven()
             << endl;
    }


    cout << endl;
    cout << "===== FUEL / CHARGE COST ====="
         << endl;

    double lowestCost = 999999999;
    Vehicle* efficientVehicle = nullptr;


    for (Vehicle* v : fleet)
    {
        double cost = v->fuelCost(tripKm);

        cout << v->getRegNo()
             << " (" << v->vehicleType()
             << ") : Rs. "
             << fixed << setprecision(2)
             << cost;

       
        ElectricTruck* electric =
            dynamic_cast<ElectricTruck*>(v);

        if (electric != nullptr)
        {
            cout << " [Electric Vehicle]";
        }

        cout << endl;


        if (cost < lowestCost)
        {
            lowestCost = cost;
            efficientVehicle = v;
        }
    }


    cout << endl;

    if (efficientVehicle != nullptr)
    {
        cout << "Most Efficient Vehicle: "
             << efficientVehicle->getRegNo()
             << " (" << efficientVehicle->vehicleType()
             << ") - Rs. "
             << fixed << setprecision(2)
             << lowestCost
             << endl;
    }
}



int main()
{
    cout << "===== CONSTRUCTION ORDER ====="
         << endl;

    {
        ElectricTruck et(
            "V-ET001",
            "Green Logistics",
            2025,
            50000,
            5,
            5.0,
            100,
            400
        );

        cout << "...scope ends..." << endl;
    }
    cout << endl;
    cout << "===== POLYMORPHIC FLEET ====="
         << endl;

    vector<Vehicle*> fleet;


    fleet.push_back(
        new Car(
            "KA01AA001",
            "Ramesh Kumar",
            2020,
            45200,
            "Petrol",
            18
        )
    );


    fleet.push_back(
        new Truck(
            "MH04BB002",
            "Shyam Logistics",
            2019,
            123500,
            5,
            6
        )
    );


    fleet.push_back(
        new ElectricTruck(
            "GJ07CC003",
            "Green Fleet Co",
            2024,
            89000,
            2,
            5,
            85,
            400
        )
    );


    fleet.push_back(
        new Van(
            "MH12DD004",
            "City Services",
            2021,
            67000,
            8,
            14
        )
    );


    fleet.push_back(
        new Car(
            "DL05EE005",
            "Amit Shah",
            2022,
            30000,
            "Diesel",
            20
        )
    );


    printFleetReport(fleet, 200);

    cout << endl;
    cout << "===== CLEANUP =====" << endl;

    for (Vehicle* v : fleet)
    {
        delete v;
    }

    return 0;
}