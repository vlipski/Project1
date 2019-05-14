package Task7_Hero;

public abstract class Hero implements Mortal  {
    private String name;
    private int health;
    private int strike;

    public Hero (String name, int health, int strike) {
        this.name = name;
        this.health = health;
        this.strike = strike;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrike() {
        return strike;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }

    public void attack(Enemy e) {
        e.setHealth(e.getHealth() - strike);
        System.out.println("герой " + name + " атакует врага " + e.getName() +".\t " +
                (e.getHealth() > 0 ? "У " + e.getName() + " осталось " + e.getHealth() +
                        " жизней\n" : e.getName() + " погиб\n"));
    }
/*
    public void takeDamage(Enemy e){
        setHealth(getHealth() - e.getStrike());
    }
*/
    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
