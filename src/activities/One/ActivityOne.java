package activities.One;

public class ActivityOne {
    public static void main(String[] args) {
         Car car = new Car();
        System.out.println("Action accelator is called");
        car.accelerate();
        System.out.println("Action brake is called");
        car.brake();
        System.out.println(car);
    }
}
