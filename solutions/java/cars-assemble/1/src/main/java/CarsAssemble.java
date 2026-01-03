public class CarsAssemble {
    private static final int CAR_PER_HOUR = 221;

    public double productionRatePerHour(int speed) {
        return speed * CAR_PER_HOUR * successRate(speed);
    }

    private double successRate(int speed) {
        if (speed >= 1 && speed <= 4) return 1.0;
        if (speed >= 5 && speed <= 8) return 0.9;
        if (speed == 9) return 0.8;
        if (speed == 10) return 0.77;
        return 0.0;

    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
