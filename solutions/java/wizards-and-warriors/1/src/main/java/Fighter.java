class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    
    @Override
    public boolean isVulnerable() {
        return false;
    }
    @Override
    public int getDamagePoints(Fighter target) {
        return target.isVulnerable() ? 10 : 6;
    }
    
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {
    private boolean spellPrepared = false;

    @Override
    public boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    public int getDamagePoints(Fighter target) {
        if (spellPrepared) {
            spellPrepared = false;
            return 12;
        }
        return 3;
    }
    
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        this.spellPrepared = true;
    }
}
