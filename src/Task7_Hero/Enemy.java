package Task7_Hero;

public abstract class Enemy implements Mortal {

    private String name;
    private int health;
    private int strike;

    public Enemy(String name, int health, int strike) {
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

    public void attack(Hero c) {
        c.setHealth(c.getHealth() - strike);

        System.out.println("враг "+ name + " атакует героя " + c.getName() + ".\t " +
                (c.getHealth() > 0 ? "У " + c.getName() + " осталось " + c.getHealth() + " жизней\n" : c.getName() + " погиб\n"));
    }

    public void takeDamage(Hero c) {
        setHealth(getHealth() - c.getStrike());
    }


    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }

}
