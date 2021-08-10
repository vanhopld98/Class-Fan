public class Fan {
    //    final int SLOW = 1;
//    final int MEDIUM = 2;
//    final int FAST = 3;
    String speedString = "SLOW";
    private int speed = 1;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";

    public String getSpeedString() {
        return speedString;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isStatus() {
        return status;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        switch (speed) {
            case 1:
                speedString = "SLOW";
                break;
            case 2:
                speedString = "MEDIUM";
                break;
            case 3:
                speedString = "FAST";
                break;
        }
        this.speed = speed;
    }

    public Fan() {
    }

    public String toString() {
        String toString = "";
        if (status == true) {
            toString = "Fan : " + " Speed = " + getSpeed() + " => " + getSpeedString() + " , Radius = " + getRadius() + " , Color = " + getColor() + " . Fan is on";
        } else {
            toString = "Fan :" + " Speed = " + getSpeed() + " => " + getSpeedString() + " , Radius " + getRadius() + " . Fan is off";
        }
        return toString;
    }
}