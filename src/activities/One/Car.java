package activities.One;

public class Car {
    public String color = "Black";
    public String transmission = "Manual";
    public int make = 2014;
    public int tyres;
    public int doors;

    public Car() {
        this.tyres = 4;
        this.doors = 4;
    }
    public void dispayCharacter(){
        System.out.println(this);
    }
    public void accelerate(){
        System.out.println("Car is moving forward");
    }
    public void brake(){
        System.out.println("Car has Stopped");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", transmission='" + transmission + '\'' +
                ", tyres=" + tyres +
                ", doors=" + doors +
                '}';
    }
}