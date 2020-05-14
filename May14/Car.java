public class Car {

    public String color;
    public int numberOfDoors;
    private int currentRPM;
    private int speed;
    public static final String TYPE_SPORTY ="Sporty";
    public static final String TYPE_FAMILY = "Family";
    private static final int MAX_DOORS =6;
    private static final int MIN_DOORS = 1;

// a new property and its respective accessors
private String carType;
	
public String getCarType() 
{
    return carType;
}
public void setCarType(String carType) 
{
    this.carType = carType;
}
// rest of class the same with the exception of setNumberOfDoors
public void setNumberOfDoors(int numberOfDoors) 
{
    if ( MIN_DOORS >= 1 && numberOfDoors <= MAX_DOORS)
        this.numberOfDoors = numberOfDoors;
    else
        this.numberOfDoors = -1;
}





    private int calculateRPM(int speed) {
        int rpm = 0;

        //repersents a rea; rpm calculation
        rpm = speed * getBestGear(speed) * engineFactor();

        return rpm;
    }

    public int getCurrentRPM () {
       return currentRPM;
    }
    private void setCurrentRPM(int rpm) {
        currentRPM = rpm;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
        setCurrentRPM(calculateRPM(speed));
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int NumberOfDoors) {
        if (numberOfDoors >= 1 && numberOfDoors <= 6)
            this.numberOfDoors = numberOfDoors;
            else
            this.numberOfDoors = -1;
    }

    // no-arg Constructor
    public Car() {}
        
    
    // Constructor with arguments
    public Car(String color, int doors) {
        this.color = color;
        this.numberOfDoors = doors;
    }
    // constructors with a single argument
    public Car(String color) {
        this.color = color;
        this.numberOfDoors = 4;
    }
    // just start driving
    public void start() {
        System.out.println("Car starting");
    }
    // Drive for a specifed amount of miles
    public void drive(int miles) {
        System.out.println("Driving for " + miles +"miles");
    }
    // Miles and speed
    public void drive(int miles, int speed) {
        System.out.println("Driving " + speed + "mph for" + miles + "miles");
    }
    //to a destination
    public void drive(String destination) {
        System.out.println("Driving to" + destination);
    }
    public void stop() {
        System.out.println("car Stopping");
    }
    public void drive() {
        System.out.println("Car Driving");
    }
    public static boolean areDoorsEqual(Car c1, Car c2)
{
    return c1.getNumberOfDoors() == c2.getNumberOfDoors();
}

// And this could be used as follows
boolean doorsTheSame = Car.areDoorsEqual(family, sporty);
    
    }

    // Instantiating and using a car object
    //Car car = new Car("blue", 4);
   // car.start();
    //car.drive();
    //Car fam = new Car("White", 4)
    //fam.setCarType(Car.TYPE_FAMILY);
