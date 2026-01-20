package activities.Seven;

public class Bycycle implements BycycleOperation,BycycleParts{
    public int gears;
    public int currentSpeed;

    public Bycycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void applyBreak(int decrement) {
        currentSpeed = Math.max(currentSpeed - decrement,0);
    }

    @Override
    public void speedUp(int increment) {
      currentSpeed = Math.min(maxSpeed,currentSpeed+increment);
    }

    public String bicycleDesc() {
        return("No of gears are "+ gears + ",Speed of bicycle is " + maxSpeed+"\n");
    }

}
