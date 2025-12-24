public class Lasagna {
    
    private static final int expectedMinutes = 40;
    private static final int  minutesPerLayer = 2;
    public int expectedMinutesInOven(){
        return expectedMinutes;
    }
    public int remainingMinutesInOven(int actualMinutesInOven){
        return expectedMinutesInOven() - actualMinutesInOven;
    }
    public int preparationTimeInMinutes(int numberOfLayers){
        return numberOfLayers * minutesPerLayer;
    }

    public int totalTimeInMinutes(int numberOfLayers, int actualMinutesInOven){
        return preparationTimeInMinutes(numberOfLayers) + actualMinutesInOven;
    }
}
