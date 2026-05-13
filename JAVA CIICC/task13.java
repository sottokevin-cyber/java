abstract class Vehicle{  
    String make;
    String model;
    int  year;
  
}

class Car extends Vehicle {
    int numberofDoor;
    public Car(String make,String model,int year, int numberofDoor){
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberofDoor = numberofDoor;
    }
    public void displayDetails(){
        System.out.println("Car details: \nMake: " + make );
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberofDoor);
    }
}

public class task13 {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
            new Car("Toyota","Camry",2022,4)
        };
        
        for(Car c : cars){
            c.displayDetails();
        }
    }
}
