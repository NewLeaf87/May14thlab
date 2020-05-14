public class error {

    public String Color;
    public int NumberOfDoors;

    public void start()
    {
        System.out.println("Car starting");
    }

    public void stop()
    {
        System.out.println("Car stopping");
    }

    public void drive()
    {
        System.out.println("Car driving");
    }
}

// instantiating and using a car object
Car car = new Car();
car.Color = "blue";
car.NumberOfDoors = 4;
car.start();
car.drive();

