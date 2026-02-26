import java.util.List;
import java.util.IntSummaryStatistics;
import java.util.Random;

class DnDCharacter {

    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hitpoints;

    public DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
        this.hitpoints = 10 + modifier(this.constitution);
    }
    
    int ability(List<Integer> scores) {
        if(scores == null || scores.isEmpty())
            return 0;
        
        IntSummaryStatistics stats = scores.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        return (int) (stats.getSum() - stats.getMin());
    }

    List<Integer> rollDice() {
        Random rand = new Random();
        return rand.ints(4, 1, 7)
                .boxed()
                .toList();
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    int getStrength() { return strength; }
    int getDexterity() { return dexterity; }
    int getConstitution() { return constitution; }
    int getIntelligence() { return intelligence; }
    int getWisdom() { return wisdom; }
    int getCharisma() { return charisma; }
    int getHitpoints() { return hitpoints; }
}
