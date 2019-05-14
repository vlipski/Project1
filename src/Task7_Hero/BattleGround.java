package Task7_Hero;

public class BattleGround {
    public static void main(String[] args) {
        Hero Warrior = new Warrior("Warrior", 25, 5);
        Hero Mage = new Mage("Mage", 20, 3);
        Hero Archer = new Archer("Archer", 20, 5);

        Enemy Zombi = new Zombi("Zombi", 20, 3);
        Enemy Werewolf = new Werewolf("Werewolf", 25, 5);
        Enemy Monster = new Monster("Monster", 25, 5);

        Hero[] hero = {Warrior,Mage, Archer};
        Enemy[] enemy = {Zombi, Werewolf, Monster};

        for (int i = 3, b = 3; i > 0 && b > 0; ) {
            i = mortal(hero, enemy, b,i);
            if(i > 0) {
                b = mortal(enemy, hero, i, b);
            }
            if (i == 0) {
                System.out.println("\t\t\t GAME OVER \n \t\t\t победили Герои");
            }
            if (b == 0) {
                System.out.println("\t\t\t GAME OVER \n \t\t\t победили Враги");
            }
        }
    }

    private static int mortal(Hero[] h, Enemy[] e, int i, int b) {
        int k = (int) (Math.random() * i);
        int j = (int) (Math.random() * b);
        h[k].attack(e[j]);
        if (!e[j].isAlive()) {
            Enemy buf = e[b-1];
            e[b-1] = e[j];
            e[j] = buf;
            b--;
        }
        return b;
    }


    private static int mortal(Enemy[] e, Hero[] h, int b, int i) {
        int k = (int) (Math.random() * b);
        int j = (int) (Math.random() * i);
        e[k].attack(h[j]);
        if (!h[j].isAlive()) {
            Hero buf = h[i-1];
            h[i-1] = h[j];
            h[j] = buf;
            i--;
        }
        return i;
    }

}


