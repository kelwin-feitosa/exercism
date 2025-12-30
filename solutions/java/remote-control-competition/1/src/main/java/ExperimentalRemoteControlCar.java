public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private static final int SPEED = 20;
    private int distance = 0;

    public void drive() {
        this.distance += SPEED;
    }

    public int getDistanceTravelled() {
        return this.distance;
    }
}