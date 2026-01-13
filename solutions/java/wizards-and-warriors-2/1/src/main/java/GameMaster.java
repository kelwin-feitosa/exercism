public class GameMaster {

    public String describe(Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
    }

    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    public String describe(TravelMethod travel) {
        String method = (travel == TravelMethod.WALKING) ? "by walking." : "on horseback.";
        return "You're traveling to your destination " + method;
    }
    
    public String describe(Character character, Destination destination, TravelMethod travel) {
        return describe(character) + " " + describe(travel) + " " + describe(destination);
    }

    public String describe(Character character, Destination destination) {
        return describe(character, destination, TravelMethod.WALKING);
    }
}
