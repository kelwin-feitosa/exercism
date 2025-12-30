public class JedliksToyCar {
    private static final int DRIVE_DISTANCE = 20;
    private static final int BATTERY_DRAIN_RATE = 1;
    
    private int distance = 0;
    private int battery = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if(battery <= 0){
            return "Battery empty";
        }

        return "Battery at " + battery + "%";
    }

    public void drive() {
        if (battery >= BATTERY_DRAIN_RATE){
            distance += DRIVE_DISTANCE;
            battery -= BATTERY_DRAIN_RATE;
        }
    }
}
