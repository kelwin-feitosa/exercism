class NeedForSpeed {
    
    private int speed;
    private int batteryDrain;
    private int battery = 100;
    private int distanceDriven = 0;
    private static final int NITRO_SPEED = 50;
    private static final int NITRO_BATTERY_DRAIN = 4;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }
    
    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if(!batteryDrained()){
            this.distanceDriven += this.speed;
            this.battery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(NITRO_SPEED, NITRO_BATTERY_DRAIN);
    }

    public int getBattery() {
        return this.battery;
    }
    public int getBatteryDrain() {
        return this.batteryDrain;
    }
    public int getSpeed() {
        return this.speed;
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        if (car.getBatteryDrain() <= 0) return true;
        
        int possibleMoves = car.getBattery() / car.getBatteryDrain();
        int maximumDistance = car.getSpeed() * possibleMoves;
        
        return maximumDistance >= this.distance;
    }
}
